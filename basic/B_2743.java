import java.util.Scanner;

//처음 했던 방식 : 스케너 객체 생성 후 변수에 입력값 받기
// 배열로 만들고 for문 돌려서 새로 만든 변수에 하나씩 더해주기
//결국 하나하나 센 값을 결과로 도출 가능

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] length = input.toCharArray();
        int count = 0;
        
        for(int i = 0; i < length.length; i++) {
            count++
        }
        System.out.print(count);
    }
}

새로 알게 된 간단한 방법
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();         char[] fuck= input.toCharArray();         
        int length = 0;
        
        for (int i = 0; i < fuck.length; i++) {
            length++;         }
        
        System.out.println(length);
    }
}