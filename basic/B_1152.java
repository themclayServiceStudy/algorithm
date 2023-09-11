import java.util.Scanner;
import java.util.StringTokenizer;
 
// StringTokenizer클래스는 문자열을 지정된 구분자를 기준으로 나누는데 사용된다고 한다. 인수를 두 개 전달하는데 첫 번째 인수는 나눌 문자열이고, 두 번째 인수는 구분자 (위에선 공백을 구분자로 나누었다)
// countTokens()은 객체가 포함하는 토큰의 개수를 반환
// nextLine()은 Scanner클래스의 메서드로 키보드의 입력에서 다음 줄의 문자열을 읽어온다.

public class Main {
 
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
 
      String answer = in.nextLine();

      StringTokenizer countAnswer = new StringTokenizer(answer ," ");
      
         System.out.println(countAnswer .countTokens());   
      
   }
 
}
