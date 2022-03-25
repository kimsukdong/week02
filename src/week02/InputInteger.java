package week02;
import java.util.Scanner;
public class InputInteger {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);		
		System.out.print("키를 입력 : "); 		
		int data = stdIn.nextInt();		
		
		System.out.println("입력한 값은 " + data);
	}
}
