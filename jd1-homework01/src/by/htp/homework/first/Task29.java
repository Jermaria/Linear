package by.htp.homework.first;

public class Task29 {

	// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double alpha;
		double beta;
		double gamma;
		
		double alpha2;
		double beta2;
		double gamma2;
		
		double cosAlpha;
		double cosBeta;
		double cosGamma;
		
		a = 10;
		b = 15;
		c = 20;
				
		cosAlpha = (b * b + c * c - a * a) / 2 / b / c;
		cosBeta = (a * a + c * c - b * b) / 2 / a / c;
		cosGamma = (a * a + b * b - c * c) / 2 / a / b;
		
		alpha = Math.acos(cosAlpha);
		beta = Math.acos(cosBeta);
		gamma = Math.acos(cosGamma);
		
		System.out.println("углы в радианах: " + alpha + " " + beta + " " + gamma);
				
		alpha2 = alpha * 180 / Math.PI;
		beta2 = beta * 180 / Math.PI;
		gamma2 = gamma * 180 / Math.PI;
		
		System.out.println("углы в градусах: " + alpha2 + " " + beta2 + " " + gamma2);
		
	}
}
