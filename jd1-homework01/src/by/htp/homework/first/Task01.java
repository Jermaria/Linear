package by.htp.homework.first;

public class Task01 {

	// Даны два действительных числа х и у. 
	// Вычислить их сумму, разность, произведение и частное.

	public static void main(String[] args) {

		float x;
		float y;
		float sum;
		float subtract;
		float mult;
		float divided;

		x = 9;
		y = 4;

		sum = x + y;
		subtract = x - y;
		mult = x * y;
		divided = x / y;

		System.out.println("sum = " + sum);
		System.out.println("subtract = " + subtract);
		System.out.println("mult = " + mult);
		System.out.println("divided = " + divided);

	}
}
