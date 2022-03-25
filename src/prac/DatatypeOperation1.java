package prac;
import java.util.Scanner;
public class DatatypeOperation1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력 : ");
		double first = stdin.nextDouble();
		System.out.print("두 번째 수를 입력 : ");
		double  second = stdin.nextDouble();
		double a1 = first+second  ;
		double a2 = first-second  ;
		double a3 = first*second  ;
		double a4 = first/second  ;

		System.out.println("덧셈 : "+first+"+"+second+" = "+a1+" 입니다");
		System.out.println("뺄셈 : "+first+"-"+second+" = "+a2+" 입니다");
		System.out.println("곱셈 : "+first+"*"+second+" = "+a3+" 입니다");
		System.out.println("나눗셈 : "+first+"/"+second+" = "+a4+" 입니다");
		System.out.println("평균값 : "+(first+second)/2.0 + " 입니다");
		
		stdin.close();
	}
}
