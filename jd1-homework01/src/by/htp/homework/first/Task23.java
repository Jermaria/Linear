package by.htp.homework.first;

public class Task23 {

	// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
	
	public static void main(String[] args) {
		
		double r1;
		double r2;
		double s1;
		double s2;
		double sRing;
		
		r1 = 5;
		r2 = 7;
		
		s1 = Math.PI * r1 * r1;
		s2 = Math.PI * r2 * r2;
		
		sRing = s2 - s1;
		
		System.out.println("S = " + sRing);
		
	}
}
