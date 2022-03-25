package prac;

public class PositionCalculator {
    public static void main(String[] args) {
        // 변수 생성
        double time = 5.0;               // 이동 시간
        double gravity = -9.8;          // 중력 가속도
        double initialVelocity = 0.0;    // 초기 속도
        double initialPosition = 10000.0; // 초기 위치

        double finalPosition = 0.5 * gravity * time * time;
        finalPosition += initialVelocity * time;
        finalPosition += initialPosition;

        // 결과 출력
        System.out.printf("%.2f초 후 위치: %.1fm\n", time, finalPosition);
        
        time = 10.0;               // 이동 시간   
        initialVelocity = 0.0;    // 초기 속도
        initialPosition = 10000.0; // 초기 위치

        finalPosition = 0.5 * gravity * time * time;
        finalPosition += initialVelocity * time;
        finalPosition += initialPosition;
        // 결과 출력
        System.out.printf("%.2f초 후 위치: %.1fm\n", time, finalPosition);
        
        time = 30.0;               // 이동 시간   
        initialVelocity = 0.0;    // 초기 속도
        initialPosition = 10000.0; // 초기 위치

        finalPosition = 0.5 * gravity * time * time;
        finalPosition += initialVelocity * time;
        finalPosition += initialPosition;
        // 결과 출력
        System.out.printf("%.2f초 후 위치: %.1fm\n", time, finalPosition);
        
    }

}
