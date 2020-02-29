package by.htp.homework.first;

public class Task39 {

	// Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, 
	// кроме умножения, сложения и вычитания, вычислите за минимальное число операций: 
	// 2 * x^4 - 3 * x^3 + 4 * x^2 - 5 * x + 6
	
	public static void main(String[] args) {
		
		int x;
		int result;
		
		x = 2; 
		
		result = x * (x * ((2 * x * x - 3 * x) + 4) - 5) + 6;   // 9 вместо 14
		
		System.out.println(result);
				
	}
}