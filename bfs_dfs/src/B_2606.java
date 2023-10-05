import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B_2606 {
    public static class Node {
        ArrayList<Node> adj;
        int v;

        Node(int v) {
            this.adj = new ArrayList<>();
            this.v = v;
        }
    }

    public static int N, M;
    public static Node[] nodes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        StringTokenizer st;

        nodes = new Node[N+1];

        for(int i=0; i<=N; i++) {
            nodes[i] = new Node(i);
        }

        for(int i=0; i<M; i++) {
             st = new StringTokenizer(br.readLine(), " ");

             int n1 = Integer.parseInt(st.nextToken());
             int n2 = Integer.parseInt(st.nextToken());

             if(!nodes[n1].adj.contains(nodes[n2])) {
                 nodes[n1].adj.add(nodes[n2]);
             }
             if(!nodes[n2].adj.contains(nodes[n1])) {
                 nodes[n2].adj.add(nodes[n1]);
             }
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[N+1];
        int cnt = 0;

        q.add(nodes[1]);
        visited[1] = true;

        while(!q.isEmpty()) {
            Node cur = q.poll();

            for(Node n : cur.adj) {
                if(!visited[n.v]) {
                    visited[n.v] = true;
                    q.add(n);
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
