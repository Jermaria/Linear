package by.htp.homework.first;

public class Task36 {

	// Найти частное произведений четных и нечетных цифр четырехзначного числа.
	
	public static void main(String[] args) {
		
		int x;
		int a, b, c, d;
		int multEven;
		int multOdd;
		double divided;
		
		x = 1234;
		
		a = x / 1000;
		b = x % 1000 / 100;
		c = x % 100 / 10;
		d = x % 10;
				
		if ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0) && (d % 2 == 0)) {
			
			multOdd = 0;
			multEven = a * b * c * d;
			
		} else if ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0) && (d % 2 != 0)) {
			
			multEven = 0;
			multOdd = a * b * c * d;
			
		} else {
			
			multEven = 1;
			multOdd = 1;
			
			if (a % 2 == 0) {
				multEven = multEven * a;
			} else {
				multOdd = multOdd * a;
			}
			
			if (b % 2 == 0) {
				multEven = multEven * b;	
			} else {
				multOdd = multOdd * b;		
			}
			
			if (c % 2 == 0) {				
				multEven = multEven * c;			
			} else {			
				multOdd = multOdd * c;			
			}
			
			if (d % 2 == 0) {
				multEven = multEven * d;	
			}else {
				multOdd = multOdd * d;		
			}
			
		}
				
		divided = (double) multEven / multOdd;
		
		System.out.println(divided);
	}
}
