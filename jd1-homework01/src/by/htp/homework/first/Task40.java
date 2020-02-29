package by.htp.homework.first;

public class Task40 {
	
	// Дано значение х. Получить значения
	// -2*x + 3*x^2 - 4*x^3 � 1 + 2*x + 3*x^2 + 4*x^3
	// Позаботьтесь об экономии операций.
	
	public static void main(String[] args) {
		
		int x;
		int result1;
		int result2;
		
		x = 2;
		
		result1 = x * (x * (-4 * x + 3) - 2);
		
		result2 = x * (x * (4 * x + 3) + 2) + 1;
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
