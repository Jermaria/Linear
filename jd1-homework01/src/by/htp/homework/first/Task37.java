package by.htp.homework.first;

public class Task37 {

	//Составить линейную программу, печатающую значение true, 
	// если указанное высказывание является истинным, и false — в противном случае:
	
	public static void main(String[] args) {
		
		int z;
		z = 67;
		
		even(z);
		
		
		int p;
		p = 2332;
		
		sum(p);
		
		
		int l;
		l = 748;
		
		sumThree(l);
		
		
		int x;
		int m;
		int n;
		
		x = 8;
		m = 9;
		n = 12;
		
		belong(x, m, n);
		
		
		int q;
		q = 238;
		
		equal(q);
		
		
		int first;
		int second;
		int third;
		
		first = 12;
		second = 13;
		third = 12;
		
		triangle(first, second, third);
		
		
		int num;
		num = 279;
		
		equalsThird(num);
		
		
		double base = 2;
		double deg = 16;
		
		degree(base, deg);
		
		
		int a, b, c;
		int t, u;
		
		a = 7;
		b = 3;
		c = -10;
		
		t = 1;
		u = 0;
		
		cross(a, b, c, t, u);
		
	}
	
	// Целое число N является четным двузначным числом.
	
	public static void even(int a) {
		
		if ((a % 2 == 0) && (a > 9) && (a < 100)) {
			System.out.println("true");
		} else {			
			System.out.println("false");	
		}	
	}
	
	// Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
	public static void sum(int x) {
		
		int a, b, c, d;
		
		a = x / 1000;
		b = x % 1000 / 100;
		c = x % 100 / 10;
		d = x % 10;
		
		if (a + b == c + d) {	
			System.out.println("true");
		} else {			
			System.out.println("false");			
		}		
	}
	
	//  Сумма цифр данного трехзначного числа N является четным числом.
	
	public static void sumThree(int y) {
		
		int a, b, c;
		int sum;
		
		a = y / 100;
		b = y % 100 / 10;
		c = y % 10;
		
		sum = a + b + c;
		
		if (sum % 2 == 0) {			
			System.out.println("true");			
		} else {			
			System.out.println("false");			
		}	
	}
	
	// Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
	
	public static void belong(int x, int m, int n) {
		
		if((x >= m) && (x <= n)) {			
			System.out.println("true");			
		}else {			
			System.out.println("false");			
		}		
	}

	// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
	
	public static void equal(int num) {
		
		int sqr;
		double cube;
		int a, b, c;
		
		double sum;
		
		sqr = num * num;
		
		a = num / 100;
		b = num % 100 / 10;
		c = num % 10; 
		
		sum = a + b + c;
		cube = Math.pow(sum, 3);
		
		if (sqr == cube) {			
			System.out.println("true");			
		} else {			
			System.out.println("false");			
		}		
	}
	
	// Треугольник со сторонами а,b,с является равнобедренным.
	
	public static void triangle(int a, int b, int c) {
		
		if((a == b) || (a == c) || (b == c)) {			
			System.out.println("true");		
		} else {		
			System.out.println("false");		
		}		
	}
	
	// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
	
	public static void equalsThird(int num) {
		
		int a, b, c;
		
		a = num / 100;
		b = num % 100 / 10;
		c = num % 10; 
		
		if ((a + b == c) || (b + c == c)) {			
			System.out.println("true");			
		} else {			
			System.out.println("false");			
		}		
	}
		
	// Заданное число N является степенью числа а 
	// (показатель степени может находиться в диапазоне от 0 до 4).
		
	public static void degree(double a, double n) {
			
		if ((n == 1) || (n == Math.pow(a, 1)) || (n == Math.pow(a, 2)) 
					 || (n == Math.pow(a, 3)) || (n == Math.pow(a, 4)) ) {		
			System.out.println("true");			
		} else {		
			System.out.println("false");			
		}		
	}
		
	// График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
		
	public static void cross(int a, int b, int c, int x, int y) {
			
		int result;
		result = a * x * x + b * x + c;
			
		if (y == result) {		
			System.out.println("true");		
		} else {	
			System.out.println("false");				
		}			
	}
}
