package by.htp.homework.first;

public class Task18 {

	// Дана длина ребра куба. Найти площадь грани, 
	// площадь полной поверхности и объем этого куба.
	
	public static void main(String[] args) {
		
		double len;
		double sSide;
		double sSurface;
		double v;
		
		len = 4;
		
		sSide = len * len;
		sSurface = sSide * 6;
		v = Math.pow(len, 3);
		
		System.out.println("S грани = " + sSide);
		System.out.println("S поверхности = " + sSurface);
		System.out.println("V куба = " + v);
		
	}
}
