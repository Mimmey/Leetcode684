import java.util.Arrays;

public class Solution {
    public static int[] findRedundantConnection(int[][] edges) {
        return Arrays.stream(Algos.findExtra(edges)).mapToInt(Integer::intValue).toArray();
    }
}
