package by.htp.homework.first;

public class Task35 {

	// Даны натуральные числа М и N. 
	// Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
	
	public static void main(String[] args) {
		
		double m;
		double n;
		double a;
		
		int lastInt;
		int firstFract;
		
		m = 1150;
		n = 16;
		
		a = m / n;
		
		System.out.println(a);
		
		
		
		lastInt = (int) a % 10;
		
		System.out.println("младшая цифра целой части " + lastInt);
		
		firstFract = (int)(a * 10 % 10);
		
		System.out.println("старшая цифра дробной части " + firstFract);
		
	}
}
