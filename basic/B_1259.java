import java.util.Scanner;

//while반복문을 사용해야하는 이유 :  여러 개의 테스트 케이스가 있고 0이 나올때까지 반복해야하는데 반복문을 쓰지않으면 코드 한 번만 입력받고 종료된다.

// try ~ catch문 사용했다. 예외를 처리할 때 자주 사용하는 구문
// try문에서 예외가 발생하는 경우 catch로 빠져서 그 안의 실행문을 실행함
// 내가 하려했던 방식 :  1. 예외 처리(0일때)이후 정수입력을 문자열로 바꾸고  
//                     2. 문자열을 뒤집은 후 기존의 문자열과 뒤집은 문자열이 같은지

알게 된 것
Integer.toString(number) : 정수를 문자열로 바꿀 수 있는 메서드
StringBuilder : 문자열을 효율적으로 조작할 수 있는 클래스
equals : 문자열 객체(객체)간의 내용을 비교하는 메서드

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int number = scanner.nextInt();
            
                if (number == 0) {
                    break;
                }

                String strNumber = Integer.toString(number);
                StringBuilder stringBuilder = new StringBuilder(strNumber);
                stringBuilder.reverse();
//strNumber은 일반 문자열 vs stringBuilder은 문자열을 조작하는 용도의 객체!!!
                if (strNumber.equals(stringBuilder.toString())) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } catch (Exception e) {
                System.out.println(" ");
            }
        }

        scanner.close();
    }
}
