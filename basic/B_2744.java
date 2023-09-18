import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String keyword = scanner.nextLine();

        String answer = keyword.toLowerCase() ? keyword.toUpperCase() : keyword.toLowerCase();

        System.out.print(answer);
    }
}
--------> 삼항연산자가 안 됐음 왜 안 됐을까?


import java.util.Scanner;

char은 한 글자만 저장할 수 있는 변수
charAt는 String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
Character은 문자열의 문자를 다루는데 도움을 주는 자바의 내장 클래스중 하나이다.(여기선 대소문자 변환, 문자속성확인), 여기서 isUpperCase 또는 toLowerCase등 쓸 수 있따
@문자열@ 길이 확인 메소드 : length()
배열길이는 length

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String keyword = scanner.nextLine();
        String answer = "";

        for(int i = 0; i < keyword.length(); i++) {
            char indexValue = keyword.charAt(i);
             if(Character.isUpperCase(indexValue)) {
                answer += Character.toLowerCase(indexValue);
        }else {
            answer += Character.toUpperCase(indexValue);
        }
        }
       System.out.print(answer);
    }
}