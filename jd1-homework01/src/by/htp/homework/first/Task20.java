package by.htp.homework.first;

public class Task20 {

	// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
	
	public static void main(String[] args) {
		
		double l;
		double r;
		double s;
		
		l = 30;
		
		r = l / 2 / Math.PI;
		s = Math.PI * r * r;
		
		System.out.println("S = " + s);
		
	}
}
