package by.htp.homework.first;

public class Task34 {

	// Дана величина А, выражающая объем информации в байтах. 
	// Перевести А в более крупные единицы измерения информации.
	
	public static void main(String[] args) {
		
		double a;
		double kb;
		double mb;
		double gb;
		double tb;
		
		a = 1073741824;
		
		kb = a / Math.pow(2, 10);
		mb = a / Math.pow(2, 20);
		gb = a / Math.pow(2, 30);
		tb = a / Math.pow(2, 40);
		
		System.out.println("в килобайтах " + kb);
		System.out.println("в мегабайтах " + mb);
		System.out.println("в гигабайтах " + gb);
		System.out.println("в терабайтах " + tb);
		
	}
}
