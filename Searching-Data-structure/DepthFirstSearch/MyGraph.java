package depthfirstsearch;

import java.util.Arrays;

/**
 *
 * @author VVF6HCS19 - Chris Bouwer
 */
class MyGraph {

    private int[][] adj;

    public MyGraph() {
        adj = new int[4][4];
    }

    public void addEdge(int i, int j, int weight) {
        adj[i][j] = weight;
        adj[j][i] = weight;
    }

    @Override
    public String toString() {
        String buffer = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buffer = buffer + adj[i][j] + "\t";
            }
            buffer = buffer + "\n";
        }
        return buffer;
    }

    public void dfs() {
        MyStack stack = new MyStack();
        boolean[] visited = new boolean[4];
        Arrays.fill(visited, false);
        System.out.println("" + 0);
        stack.push(0);
        visited[0] = true;
        while (!stack.isEmpty()) {
            int node = getUnvisNeighbour(stack.peek(), visited);
            if (node == -1) {
                int garbage = stack.pop();
            } else {
                System.out.println(node + ", ");
                stack.push(node);
                visited[node] = true;
            }
        }
    }

    public int getUnvisNeighbour(int i, boolean[] visited) {
        for (int j = 0; j < 4; j++) {
            if (adj[i][j] > 0 && !visited[j]) {
                return j;
            }
        }
        return -1;
    }
}
