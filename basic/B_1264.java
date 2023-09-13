import java.util.Scanner;

접근 방법 : 1. 입력받은 문자열들을 소문자로 변환 후 배열로 바꾸기
            2. 그리고 for문을 돌려서 모음 찾기(그 모음들 변수에 넣어서 수 세기) 
사용한 메서드
    while문, .toLowerCase(), ||, toCharArray(), equals(), for문

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String fuck = scanner.nextLine();
            
            if (fuck.equals("#")) {
                break;
            }
            
            fuck = fuck.toLowerCase();
            
            char[] characters = fuck.toCharArray();
            
            int count = 0;
            
            for (char c : characters) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}

//---------------------------------------------------------------------------
//다른 사람의 예시
import java.util.Scanner;

//switch문을 써서 풀었음!@!@!

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;) {
            String str = sc.nextLine();
            int count = 0;
            if(str.equals("#")) {
                break;
            }

            str = str.toLowerCase();

            for(int i=0; i<str.length(); i++) {
               switch(str.charAt(i)) {
                     case 'a':
                     case 'e':
                     case 'i':
                     case 'o':   
                     case 'u':
                        count++;
                    default: 
                        break;
               }
            }            
            System.out.println(count);
        }
    }
}