package by.epam.lesson3.hometask3;
import java.util.Scanner;

public class Task_13_8 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int number = 0; 
		int digit = 0; 
		System.out.print("Введите число: "); 
		if (sc.hasNextInt()) 
		number = sc.nextInt();
		calcCifra(number); 
		if (digit % 2 == 0) { 
		System.out.println("В числе есть четная цифра."); }
	    else {
		System.out.println("В числе нет четных цифр."); }}
	private static int calcCifra(int number) {
		int digit=0;
		while (number != 0) { 
			digit = number % 10; 
			number = number / 10;
	} return digit;
	
}
	}
