package by.htp.homework.first;

public class Task30 {

	// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
	
	public static void main(String[] args) {
		
		double r1;
		double r2;
		double r3;
		double resistance;
		
		r1 = 2;
		r2 = 4;
		r3 = 5;
		
		resistance = Math.pow(1 / r1 + 1 / r2 + 1 / r3, -1);
		
		System.out.println("сопротивление = " + resistance);		
		
	}
}
