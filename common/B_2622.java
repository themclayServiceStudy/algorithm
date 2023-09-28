import java.util.*;
import java.io.*;

public class B_2622 {
    public static int N = 8;
    public static Node[] questions;

    /**         Node 0                Node1
     *  /int score, int num / int score, int num /        /
     *
     * Integer, Character -> Node (int , int)
     *
     *    int, Integer
     *    char, Character
     *    primitive, reference
     *
     *    Node 0, Node 1 => 컴퓨터 알고리즘 정렬
     *
     *    Node
     */

    public static class Node implements Comparable<Node> {
        int score; // 점수
        int idx; // 인덱스

        Node(int score, int idx) {
            this.score = score;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node o) {
            return this.score - o.score;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        questions = new Node[8]; // 8

        for(int i=0; i<N; i++) { // questions[0] => Node(20, 1)
            questions[i] = new Node(Integer.parseInt(br.readLine()), i+1);
        }

        // 점수의 내림차순 정렬
        Arrays.sort(questions, Collections.reverseOrder()); // 기본 정렬은 항상 오름차순, 내림차순

        System.out.println("---점수의 내림차순 정렬---");

        for(Node q : questions) {
            System.out.println("score : " + q.score + ", idx : " + q.idx);
        }

        int ans = 0;

        for(int i=0; i<5; i++) {
            ans += questions[i].score;
        }

        System.out.println(ans);

        // idx -> ans

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<5; i++) {
            al.add(questions[i].idx);
        }

        System.out.println("인덱스의 오름차순 정렬 전");

        for(int a : al) {
            System.out.print(a + " ");
        }
        System.out.println();

        Collections.sort(al);

        System.out.println("인덱스의 오름차순 정렬 후");


        // 인덱스의 오름차순 정렬
        for(int num : al) {
            System.out.print(num + " ");
        }
    }
}
