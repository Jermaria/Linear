package by.htp.homework.first;

public class Task27 {

	// Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, 
	// получить значение а^8 за три операции и а^10 за четыре операции.
	
	public static void main(String[] args) {
		
		int a;
		int a8;
		int a10;
		int a2;
		int a4;
		
		a = 2;
		
		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;
		
		a10 = a8 * a2;
		
		System.out.println(a8);
		System.out.println(a10);
		
	}
}
