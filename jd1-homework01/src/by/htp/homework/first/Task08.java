package by.htp.homework.first;

public class Task08 {

	// Вычислить значение выражения по формуле
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double temp;
		
		a = 1;
		b = 2;
		c = 3;
		
		temp =  b + Math.sqrt(b * b + 4 * a * c);
		temp = temp / 2 / a;
		temp = temp - Math.pow(a, 3) * c;
		temp = temp + Math.pow(b, -2);
		
		System.out.println("result = " + temp);
		
	}
}
