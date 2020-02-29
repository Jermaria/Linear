package by.htp.homework.first;

public class Task22 {

	// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
	// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
	// ННч ММмин SSc.
	
	public static void main(String[] args) {
		
		int t;
		int sec;
		int min;
		int hour;
		
		t = 3708;
		
		hour = t / 3600;
		min = t / 60 % 60;
		sec = t - min*60 - hour*3600;

		if (hour < 10) {
			System.out.print("0" + hour + "ч ");
		} else {
			System.out.print(hour + "ч ");
		}
		
		if (min < 10) {
			System.out.print("0" + min + "мин ");
		} else {
			System.out.print(min + "мин ");
		}
		
		if (sec < 10) {
			System.out.print("0" + sec + "с ");
		} else {
			System.out.print(sec + "с ");
		}
		
	}
}
