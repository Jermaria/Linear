package by.htp.homework.first;

public class Task32 {

	// Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
	// Какое время будут показывать часы через р ч q мин r с?
	
	public static void main(String[] args) {
		
		int m, n, k;
		int p, q, r;
		
		m = 3;
		n = 30;
		k = 45;
		
		p = 2;
		q = 40;
		r = 20;
		
		int hour, min, sec;
		
		hour = 0;
		min = 0;
		
		if (k + r < 60) {
			sec = k + r;
		} else {
			sec = k + r - 60;
			min = min + 1;
		}
		
		if (n + q + min < 60) {
			min = min + n + q;
		} else {
			min = min + n + q - 60;
			hour = hour + 1;	
		}
		
		if (m + p + hour < 24) {
			hour = hour + m + p;		
		} else {
			hour = hour + m + p - 24;
		}
		
		System.out.println("время: " + hour + "ч " + min + "мин " + sec + "с");
		
	}
}
