package by.htp.homework.first;

public class Task21 {

	// Дано действительное число R вида nnn.ddd 
	// (три цифровых разряда в дробной и целой частях). 
	// Поменять местами дробную и целую части числа и вывести полученное значение числа.
	
	public static void main(String[] args) {
		
		double r1;
		double r2;
		double integer, fractional;
	
		r1 = 123.456;
		
		integer = r1 * 1000 % 1000; 		// 456
		fractional = (int)r1 / 1000.0;      // 0.123 
		r2 = integer + fractional;
		
		System.out.println(r2);
		
	}
}
