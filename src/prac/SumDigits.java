package prac;

import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = stdin.nextInt();
        int one = number % 10;               // 1�� �ڸ� ����
        int ten = number / 10 % 10;          // 10�� �ڸ� ����
        int hundred = number / 10 / 10 % 10; // 100�� �ڸ� ����
        int sum = one + ten + hundred;
        System.out.printf("���� %d�� �� �ڸ����� ����: %d", number, sum);        
        stdin.close();
    }

}
