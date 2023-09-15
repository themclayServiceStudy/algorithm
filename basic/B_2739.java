import java.util.Scanner;

//for 문 돌려서 하나씩 계산 식 도출하가
//진짜 미친 거 아닌가.. 결론 도출할때 띄어쓰기 안 됐다고 틀림

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        for(int i = 1; i < 10; i++) {
            System.out.println(s + " * " + i + " = " + (s * i) );
        }
    }
}