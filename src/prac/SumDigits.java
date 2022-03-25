package prac;

import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = stdin.nextInt();
        int one = number % 10;               // 1의 자리 숫자
        int ten = number / 10 % 10;          // 10의 자리 숫자
        int hundred = number / 10 / 10 % 10; // 100의 자리 숫자
        int sum = one + ten + hundred;
        System.out.printf("정수 %d의 각 자릿수의 총합: %d", number, sum);        
        stdin.close();
    }

}
