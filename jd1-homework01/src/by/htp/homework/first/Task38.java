package by.htp.homework.first;

public class Task38 {

	// Для данных областей составить линейную программу, 
	// которая печатает true, если точка с координатами (х, у)
	// принадлежит закрашенной области, и false — в противном случае:
	
	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = -4;
		y = -3;
		
		// a) 
		
		boolean limit;
		boolean formula;
		
		limit = (Math.abs(x) <= 4) && (y >= 0) && (y <= 4);
		formula = (y <= - Math.abs(x) + 4);
		
		if (formula && limit) {		
			System.out.println("true");		
		} else {		
			System.out.println("false");		
		}
		
		// b)
		
		if ((Math.abs(x) <= 2) && (y >= 0) && (y <= 4) 
				|| (Math.abs(x) <= 4) && (y >= -3) && (y <= 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	
		// c)
		
		boolean limit1;
		boolean limit2;
		boolean circle1;
		boolean circle2;
		
		limit1 = (x >= 0) && (x <= 4) && (y >= 0) && (y <= 4);
		limit2 = (x >= 0) && (x <= 5) && (y >= -5) && (y <= 0);
		
		circle1 = (x * x + y * y <= 16);
		circle2 = (x * x + y * y <= 25);
		
		if(circle1 && limit1 || circle2 && limit2) {	
			System.out.println("true");		
		} else {	
			System.out.println("false");		
		}	
	}
}
