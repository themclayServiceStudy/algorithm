import java.util.Scanner;

1. 입력받은 7개의 숫자들을 배열로 받는다 
2. 배열들을 for문으로 돌리고 그 for문 안에서 홀수들의 합을 구하고 거기서 가장 작은 홀수를 선별한다.
3. 예외처리로 홀수가 없을경우, 즉 홀수의 합이 0일경우 -1을 출력하도록한다.
@알게된 메서드
Integer.MAX_VALUE(범위에서 가장 큰 값) : 최솟값 초기화시 사용-> 최솟값을 저장함
 Integer.MIN_VALUE(범위에서 가장 작은 값) : 최댓값 초기화시 사용

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[7];
        
        int oddSum = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 != 0) {
                oddSum += numbers[i];
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        
        if (oddSum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(oddSum);
            System.out.println(min);
        }
    }
}