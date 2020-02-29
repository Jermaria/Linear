package by.htp.homework.first;

public class Task11 {

	// Вычислить периметр и площадь прямоугольного треугольника 
	// по длинам а и b двух катетов.
	
	public static void main(String[] args) {
		
		double a;
		double b; 
		double c;
		double s;
		double p;
		
		a = 3;
		b = 4;
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		p = a + b + c;
		s = a * b / 2;
		
		System.out.println("S = " + s +"; P = " + p);
		
	}
}
