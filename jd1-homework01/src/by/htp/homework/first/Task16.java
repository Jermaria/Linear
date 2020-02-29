package by.htp.homework.first;

public class Task16 {

	// Найти произведение цифр заданного четырехзначного числа.
	
	public static void main(String[] args) {
		
		int number;
		int first;
		int second;
		int third;
		int fourth;
		
		int mult;
		
		number = 1234;
		
		first = number / 1000;
		second = number % 1000 / 100;
		third = number % 100 / 10;
		fourth = number % 10;
				
		mult = first * second * third * fourth;
				
		System.out.println(mult);
		
	}
}
