package by.htp.homework.first;

public class Task10 {

	// Вычислить значение выражения по формуле
	
	public static void main(String[] args) {
		
		double x;
		double y;
		double temp;
		
		x = 2;
		y = 3;
		
		temp = Math.sin(x) + Math.cos(y);
		temp = temp / (Math.cos(x) - Math.sin(y));
		temp = temp * Math.tan(x * y);
		
		System.out.println(temp);
		
	}
}
