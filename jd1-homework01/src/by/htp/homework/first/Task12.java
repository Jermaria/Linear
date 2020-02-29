package by.htp.homework.first;

public class Task12 {

	// Вычислить расстояние между двумя точками с 
	// данными координатами (х1, у1)и (x2, у2).
	
	public static void main(String[] args) {
		
		double x1;
		double x2;
		double y1;
		double y2;
		double temp;
		
		x1 = 3;
		x2 = 2;
		y1 = 2;
		y2 = -3;
		
		temp = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		temp = Math.sqrt(temp);
		
		System.out.println("distance = " + temp);
		
	}
}
