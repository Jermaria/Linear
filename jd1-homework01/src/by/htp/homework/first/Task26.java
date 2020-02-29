package by.htp.homework.first;

public class Task26 {

	// Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double y;
		double s;
		
		a = 8;
		b = 12;
		y = 1.5;
		
		s = 0.5 * a * b * Math.sin(y);
		
		System.out.println("S = " + s);
		
	}
}
