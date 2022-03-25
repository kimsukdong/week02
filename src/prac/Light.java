package prac;

public class Light {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lightspeed=300000, distance;
		
		distance = lightspeed * 60*8;
		System.out.println("태양의 거리는 : "+distance + "km");
		
		long time = distance /100/24/365;
		System.out.println("자동차로 걸리는 시간은  : "+time + "년 소요");
		
		
	}
}
