package by.htp.homework.first;

public class Task14 {
	
	// Вычислить длину окружности и площадь круга 
	// одного и того же заданного радиуса R.
	
	public static void main(String[] args) {
		
		double r;
		double l;
		double s;
		
		r = 2.5;
		l = 2 * Math.PI * r;
		s = Math.PI * r * r;
		
		System.out.println("l = " + l + "; s = " + s);
		
	}
}
