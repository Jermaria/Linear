package by.htp.homework.first;

public class Task24 {

	// Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double angle;
		double x; // основание треугольника (отрезок принадлежащий основанию а трапеции)
		double h;
		double s;
		
		a = 10;
		b = 6;
		angle = 1;
				
		x = (a - b) / 2;
		
		h = x * Math.tan(angle);
		
		s = (a + b) / 2 * h;
		
		System.out.println("S = " + s);
		
	}
}
