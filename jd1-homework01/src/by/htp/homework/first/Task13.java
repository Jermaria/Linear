package by.htp.homework.first;

public class Task13 {

	// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). 
	// Найти его периметр и площадь.
	
	public static void main(String[] args) {
		
		double x1;
		double x2;
		double x3;
		double y2;
		double y3;
		
		double side1;
		double side2;
		double side3;
		
		double p;
		double half;
		double s;
				
		double temp;
		
		x1 = 3;
		x2 = 4;
		x3 = 5;
		y2 = 1;
		y3 = 4;
		
		temp = Math.pow(x2 - x1, 2) + Math.pow(y2 - y2, 2);
		side1 = Math.sqrt(temp);
		
		temp = Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2);
		side2 = Math.sqrt(temp);
		
		temp = Math.pow(x3 - x1, 2) + Math.pow(y3 - y2, 2);
		side3 = Math.sqrt(temp);
		
		
		p = side1 + side2 + side3;
		
		half = p / 2;
		
		temp = half * (half - side1) * (half - side2) * (half - side3);
		s = Math.sqrt(temp);
		
		System.out.println("S = " + s + "; P = " + p);
		
	}
}
