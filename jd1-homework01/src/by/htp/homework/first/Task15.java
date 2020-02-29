package by.htp.homework.first;

public class Task15 {
	
	// Написать программу, которая выводит на экран
	// первые 4 степени числа π

	public static void main(String[] args) {
		
		double first;
		double second;
		double third;
		double fourth; 
		
		first = Math.PI;
		second = Math.pow(first, 2);
		third = Math.pow(first, 3);
		fourth = Math.pow(first, 4);
		
		System.out.println("1st = " + first);
		System.out.println("2nd = " + second);
		System.out.println("3rd = " + third);
		System.out.println("4th = " + fourth);
		
	}
}
