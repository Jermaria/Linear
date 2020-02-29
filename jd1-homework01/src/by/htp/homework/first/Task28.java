package by.htp.homework.first;

public class Task28 {

	// Составить программу перевода радианной меры угла в градусы, минуты и секунды.
	
	public static void main(String[] args) {
		
		double rad;
		double grad;
		double min;
		double sec;
		
		rad = 2;
		
		grad = rad * 180 / Math.PI;
		min = (grad - (int) grad) * 60;
		sec = (min - (int) min) * 60;
		
		grad = (int) grad;
		min = (int) min;
		sec = (int) sec;
		
		System.out.println("2 радиана = " + grad + " градусов " + min + " минут " + sec + " секунд");
		
	}
}
