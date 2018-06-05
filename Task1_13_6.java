package by.epam.lesson3.hometask3;
import java.util.Scanner;

public class Task1_13_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int number=0;  
		int calc;   
		int calckv; 
	  System.out.print ("Введите число: ");
	  if (sc.hasNextInt()) { 
		  number=sc.nextInt();   
	  }
	  public static int calcC(int number) {
		  int calc=number % 10;
		  return calc;
	  }
	  public static int calcPosl (int number) {
		  int calckv=0;
	  switch (calcC(number)) {   
	  case 0:  
		  calckv = 0;  
		  break;   
	  case 1:    
		  calckv = 1;  
		  break;  
	  case 2: 
		  calckv = 4;
		  break;
	  case 3: 
		  calckv = 9;    
		  break;   
	  case 4: 
		  calckv = 6;
		  break;   
	  case 5:
		  calckv = 5;  
		  break; 
	  case 6:
		  calckv = 6; 
		  break;   
	  case 7:  
		  calckv = 9;  
		  break;  
	  case 8:   
		  calckv = 4;  
		 break;  
	  case 9: 
		  calckv = 1; 
		  break;   
		 default: 
		 System.out.println("Что-то не то с программой.");
	  } 
	     return calckv;
	  }
	  System.out.println("Квадрат числа " + number + " равняется " + calcPosl); 
	  }
}

