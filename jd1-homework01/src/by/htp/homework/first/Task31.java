package by.htp.homework.first;

public class Task31 {

	// Составить программу для вычисления пути, пройденного лодкой, 
	// если ее скорость в стоячей воде v км/ч, 
	// скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
	
	public static void main(String[] args) {
		
		float vBoat;
		float vStream;
		float tLake;
		float tUpstream;
		float distLake;
		float distUpstream;
		float vUpstream;
		float distTotal;
		
		vBoat = 40;
		vStream = 10;
		tLake = 3;
		tUpstream = 4;
		
		vUpstream = vBoat - vStream;
		
		distUpstream = vUpstream * tUpstream;
		distLake = vBoat * tLake;
		
		distTotal = distUpstream + distLake;
		
		System.out.println("путь составит " + distTotal + " км");
		
	}
}
