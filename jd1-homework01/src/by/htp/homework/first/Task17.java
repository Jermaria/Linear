package by.htp.homework.first;

public class Task17 {

	// Даны два числа. Найти среднее арифметическое кубов этих чисел 
	// и среднее геометрическое модулей этих чисел.
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double average;
		double geometric;
		
		double temp;
		
		a = 7;
		b = -11;
		
		temp = Math.pow(a, 3) + Math.pow(b, 3);
		average = temp / 2;
		
		temp = Math.abs(a) * Math.abs(b);
		geometric = Math.sqrt(temp);
		
		System.out.println("СА = " + average);
		System.out.println("СГ = " + geometric);
		
	}
}
