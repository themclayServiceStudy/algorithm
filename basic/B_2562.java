import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nextInt메서드 사용해서 정수 값 입력받기
        int fuck  = scanner.nextInt();
        int[] arrayFuck = fuck.toCharArray();

        int max = arr[0];
        int indexOfMax = 0;

        for(int i = 1; i < arrayFuck.length; i++) {
            if(arrayFuck[i] > max) {
                max = arrayFuck[i];
                indexOfMax = i
            }
        }

        System.out.println(max);
        System.out.println(indexOfMax);
        
        scanner.close;
        
}

//---------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9]; // 9개의 자연수를 저장할 배열 생성

        // 9개의 자연수 입력받기
        for (int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int indexOfMax = 0;

        // 배열을 순회하며 최댓값 찾기
        for (int i = 1; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexOfMax = i;
            }
        }

        // 최댓값과 그 위치 출력
        System.out.println(max);
        System.out.println(indexOfMax + 1); // 인덱스는 0부터 시작하므로 1을 더해 출력

        scanner.close();
    }
}