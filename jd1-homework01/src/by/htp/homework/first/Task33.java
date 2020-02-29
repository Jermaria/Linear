package by.htp.homework.first;

public class Task33 {

	// Ввести любой символ и определить его порядковый номер, 
	// а также указать предыдущий и последующий символы.
	
	public static void main(String[] args) {
		
		char ch = 'a';
		int index;
		
		index = ch;
		
		System.out.println(index);
		System.out.println((char) (index - 1));
		System.out.println((char) (index + 1));
		
	}
	
}
