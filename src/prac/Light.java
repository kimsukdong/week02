package prac;

public class Light {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lightspeed=300000, distance;
		
		distance = lightspeed * 60*8;
		System.out.println("�¾��� �Ÿ��� : "+distance + "km");
		
		long time = distance /100/24/365;
		System.out.println("�ڵ����� �ɸ��� �ð���  : "+time + "�� �ҿ�");
		
		
	}
}
