import java.util.Scanner;
public class B_1008 {
    public static void main(String[] args) {
        in Scanner = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        
        System.out.print(A/B);
    }
}
////이 문제에서 핵심. 너무 쉬운 문제지만 int를 사용하느냐 double을 사용하느냐의 차이다 double을 사용함으로써 정확한 나눗셈 결과를 얻고 소수점 이하의 값도 고려가 된다. (double은 소수점 자리를 나타낼때 사용하는 메서드) 
// ex) 1/3은 소수로 표현을 해야하는데 이걸 int로 했을 때 결과는 0으로 처리가 된다. 하지만 double을 사용하면 소수점 이하까지 정확한 값으로 표현이 가능하당