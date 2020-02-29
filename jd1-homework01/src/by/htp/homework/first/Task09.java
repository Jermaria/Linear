package by.htp.homework.first;

public class Task09 {
	
	// Вычислить значение выражения по формуле
	
	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
		float d;
		float temp;
		
		a = 1;
		b = 3;
		c = 2;
		d = 4;
		
		temp = a / c * b / d;
		temp = temp - (a * b - c) / c / d;
				
		System.out.println(temp);
		
	}
}
