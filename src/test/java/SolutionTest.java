import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void check1() {
        int[][] edges = {{1,2},{1,3},{2,3}};
        Assert.assertArrayEquals(Solution.findRedundantConnection(edges), new int[] {2,3});
    }

    @Test
    public void check2() {
        int[][] edges = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        Assert.assertArrayEquals(Solution.findRedundantConnection(edges), new int[] {1,4});
    }

    @Test
    public void check3() {
        int[][] edges = {{3,4},{1,2},{2,4},{3,5},{2,5}};
        Assert.assertArrayEquals(Solution.findRedundantConnection(edges), new int[] {2,5});
    }
}
