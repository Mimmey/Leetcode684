# Leetcode684
## Topics: Prim's algorithm and StreamAPI

In this problem, a tree is an undirected graph that is connected and has no cycles.

You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input.

### Example 1:
<pre><code>
    Input: edges = [[1,2],[1,3],[2,3]]
    Output: [2,3]
</code></pre>    

### Example 2:
<pre><code>
    Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
    Output: [1,4]
</code></pre>

### Constraints:
<ul>
    <li>n == edges.length</li>
    <li>3 <= n <= 1000</li>
    <li>edges[i].length == 2</li>
    <li>1 <= ai < bi <= edges.length</li>
    <li>ai != bi</li>
    <li>There are no repeated edges.</li>
    <li>The given graph is connected.</li>
</ul>    
