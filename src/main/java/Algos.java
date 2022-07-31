import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Algos {
    public static Integer[] intArrayToIntegerArray(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .toArray(Integer[]::new);
    }

    public static Integer[][] intArrayToIntegerArray(int[][] array) {
        Integer[][] integerArray = new Integer[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            integerArray[i] = intArrayToIntegerArray(array[i]);
        }

        return integerArray;
    }

    public static Integer[][] prim(int[][] edges) {
        int n = edges.length;

        int[][] result = new int[n - 1][2];

        boolean[] isInTree = new boolean[n];
        isInTree[0] = true;
        int counter = 1;

        while (counter < n - 1) {
            for (int i = 0; i < edges.length; i++) {
                int[] edge = edges[i];
                if (isInTree[edge[0] - 1] && !isInTree[edge[1] - 1]
                        || !isInTree[edge[0] - 1] && isInTree[edge[1] - 1]) {
                    result[counter - 1] = edge;

                    if (isInTree[edge[0] - 1]) {
                        isInTree[edge[1] - 1] = true;
                    } else {
                        isInTree[edge[0] - 1] = true;
                    }

                    counter++;
                    i = -1;
                }
            }
        }

        return intArrayToIntegerArray(result);
    }

    public static Integer[] findExtra(int[][] edges) {
        Integer[][] minSpanningTree = prim(edges);

        for (int[] edge : edges) {
            List<Integer> integerEdge = Arrays.asList(intArrayToIntegerArray(edge));
            if (!Arrays.stream(minSpanningTree)
                    .map(e -> Arrays.stream(e).collect(Collectors.toList()))
                    .collect(Collectors.toList())
                    .contains(integerEdge)) {
                return Arrays.asList(integerEdge.toArray()).toArray(Integer[]::new);
            }
        }

        return null;
    }
}
