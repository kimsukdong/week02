package prac;
import java.util.Scanner;
public class DatatypeOperation1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		double first = stdin.nextDouble();
		System.out.print("�� ��° ���� �Է� : ");
		double  second = stdin.nextDouble();
		double a1 = first+second  ;
		double a2 = first-second  ;
		double a3 = first*second  ;
		double a4 = first/second  ;

		System.out.println("���� : "+first+"+"+second+" = "+a1+" �Դϴ�");
		System.out.println("���� : "+first+"-"+second+" = "+a2+" �Դϴ�");
		System.out.println("���� : "+first+"*"+second+" = "+a3+" �Դϴ�");
		System.out.println("������ : "+first+"/"+second+" = "+a4+" �Դϴ�");
		System.out.println("��հ� : "+(first+second)/2.0 + " �Դϴ�");
		
		stdin.close();
	}
}
