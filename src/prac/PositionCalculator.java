package prac;

public class PositionCalculator {
    public static void main(String[] args) {
        // ���� ����
        double time = 5.0;               // �̵� �ð�
        double gravity = -9.8;          // �߷� ���ӵ�
        double initialVelocity = 0.0;    // �ʱ� �ӵ�
        double initialPosition = 10000.0; // �ʱ� ��ġ

        double finalPosition = 0.5 * gravity * time * time;
        finalPosition += initialVelocity * time;
        finalPosition += initialPosition;

        // ��� ���
        System.out.printf("%.2f�� �� ��ġ: %.1fm\n", time, finalPosition);
        
        time = 10.0;               // �̵� �ð�   
        initialVelocity = 0.0;    // �ʱ� �ӵ�
        initialPosition = 10000.0; // �ʱ� ��ġ

        finalPosition = 0.5 * gravity * time * time;
        finalPosition += initialVelocity * time;
        finalPosition += initialPosition;
        // ��� ���
        System.out.printf("%.2f�� �� ��ġ: %.1fm\n", time, finalPosition);
        
        time = 30.0;               // �̵� �ð�   
        initialVelocity = 0.0;    // �ʱ� �ӵ�
        initialPosition = 10000.0; // �ʱ� ��ġ

        finalPosition = 0.5 * gravity * time * time;
        finalPosition += initialVelocity * time;
        finalPosition += initialPosition;
        // ��� ���
        System.out.printf("%.2f�� �� ��ġ: %.1fm\n", time, finalPosition);
        
    }

}
