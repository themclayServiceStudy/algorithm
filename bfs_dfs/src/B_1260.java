import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  bfs, dfs 기본 문제
 *  dfs의 경우, Stack이나 Recursive 방식으로 접근이 가능하며
 *  bfs의 경우, Queue로 구현이 가능하다.
 *
 *  3가지 방식을 모두 익혀놔야 완전탐색과 같은 문제를 손쉽게 풀어낼 수 있을 것 같다.
 */

public class B_1260 {
    public static int N, M, V;

    public static class Node implements Comparable<Node> {
        int v;
        ArrayList<Node> adj;

        Node(int v) {
            this.v = v;
            this.adj = new ArrayList<>();
        }

        @Override
        public int compareTo(Node n) {
            return this.v - n.v;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        Node[] node = new Node[N+1];

        for(int i=1; i<=N; i++) {
            node[i] = new Node(i);
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(!node[a].adj.contains(node[b])) node[a].adj.add(node[b]);
            if(!node[b].adj.contains(node[a])) node[b].adj.add(node[a]);
        }

        for(int i=1; i<=N; i++) {
            Collections.sort(node[i].adj);
        }

        boolean[] visit = new boolean[N+1];

        dfs2(V, visit, node);
        System.out.println();
        visit = new boolean[N+1];
        bfs(V, visit, node);
    }

    public static void dfs(int st, boolean[] visit, Node[] n) {
        Stack<Node> s = new Stack<>();
        s.push(n[st]);

        while(!s.isEmpty()) {
            Node curNode = s.pop();
            visit[curNode.v] = true;

            for(Node no : curNode.adj) {
                if(!visit[no.v]) {
                    visit[no.v] = true;
                    s.add(no);
                }
            }

            System.out.print(curNode.v + " ");
        }
    }

    // recursive
    public static void dfs2(int v, boolean[] visit, Node[] n) {
        if(visit[v]) return;

        visit[v] = true;
        System.out.print(v + " ");

        for(Node no : n[v].adj) {
            if(!visit[no.v]) dfs2(no.v, visit, n);
        }
    }

    public static void bfs(int st, boolean[] visit, Node[] n) {
        Queue<Node> q = new LinkedList<>();
        q.add(n[st]);

        while(!q.isEmpty()) {
            Node curNode = q.poll();
            visit[curNode.v] = true;

            for(Node no : curNode.adj) {
                if(!visit[no.v]) {
                    visit[no.v] = true;
                    q.add(no);
                }
            }

            System.out.print(curNode.v + " ");
        }
    }
}