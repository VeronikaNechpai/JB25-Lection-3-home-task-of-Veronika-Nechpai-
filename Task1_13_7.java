package by.epam.lesson3.hometask3;
import java.util.Scanner;

public class Task1_13_7 {
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
int year = 0, month = 0, col_day = 0; 
System.out.print("Введите год: "); 
if (sc.hasNextInt()) { 
year = sc.nextInt(); 
} 
System.out.print("Введите номер месяца: "); 
if (sc.hasNextInt()) { 
month = sc.nextInt(); 
switch (month) { 
case 1: 
case 3: 
case 5: 
case 7: 
case 8: 
case 10: 
case 12:
col_day = 31; 
break; 
case 2: 
calcYear(year);
break; 
case 4: 
case 6: 
case 9: 
case 11: 
col_day = 30; 
break; 
} 
System.out.println("Количество дней равно - " + col_day); 
} 
}

private static void calcYear(double year) {
	int col_day;
	if (year % 4 == 0) { 
		col_day = 29; 
		} else { 
		col_day = 28; 
		} 
} 


}
