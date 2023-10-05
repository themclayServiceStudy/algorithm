import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 *  bfs로 접근하면 항상 미로의 최소 경로로 이동함 -> 너비 우선 탐색이기 때문
 */

public class B_2178 {
    public static int N, M;
    public static int[][] map;
    public static int[] dx = { 0, 0, -1, 1 };
    public static int[] dy = { -1, 1, 0, 0 };

    public static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];

        for(int i=1; i<=N; i++) {
            String line = br.readLine();

            for(int j=1; j<=M; j++) {
                char idx = line.charAt(j-1);
                map[i][j] = idx - '0';
            }
        }

        bfs();

        System.out.println(map[N][M]);
    }

    public static void bfs() {
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[N+1][M+1];

        q.add(new Node(1, 1));
        visited[1][1] = true;

        while(!q.isEmpty()) {
            Node cur = q.poll();

            for(int i=0; i<4; i++) {
                int nextX = cur.x + dx[i];
                int nextY = cur.y + dy[i];

                if(nextX > M || nextY > N || nextX < 1 || nextY < 1) continue;
                if(map[nextY][nextX] == 0 || visited[nextY][nextX]) continue;

                visited[nextY][nextX] = true;
                map[nextY][nextX] = map[cur.y][cur.x] + 1;
                q.add(new Node(nextX, nextY));
            }
        }
    }
}
