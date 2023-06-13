import java.util.LinkedList;
import java.util.Iterator;

public class DFSTraversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DFSTraversal(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }
    }

}