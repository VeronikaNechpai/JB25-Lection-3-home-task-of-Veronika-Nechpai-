package by.epam.lesson3.hometask3;

public class Task2 {
	
	public static void main(String[] args) {
		int a=1;
		int b=5;
		double f=0;
	   double y = 0;
	   double h=0.5;
			
		for (double x=1; x>=a && x<=b; x=x + h) {
			f=2*(Math.tan((x/2)+1));
			y=x;
			System.out.println("|" + y +"| "+ f + "|" );
		}
		
	}
	}