package by.htp.homework.first;

public class Task19 {
	
	// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, 
	// его высоту, радиусы вписанной и описанной окружностей.
	
	public static void main(String[] args) {
		
		double a;
		double h;
		double s;
		double r;
		double rOpis;
		
		a = 5.6;
		
		h = a * Math.sqrt(3) / 2;
		s = 0.5 * a * h;
		rOpis = Math.pow(a, 3) / 4 / s;
		r = a * Math.sqrt(3) / 6;
		
		System.out.println("S = " + s);
		System.out.println("h = " + h);
		System.out.println("r = " + r);
		System.out.println("R = " + rOpis);
		
	}
}
