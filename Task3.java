package by.epam.lesson3.hometask3;
import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		double f;
		double x=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Введите x: ");
		if (sc.hasNextDouble()) {
			x=sc.nextDouble();
		}
		f=0;
		if (x<=-3){
			f=9;
		}
		else if (x>3) {
				f=1/(x*x)+1;
			} else {
				System.out.println("Введите x<= -3 или >3");
				f=Double.NaN;
		        return;
			}
			System.out.println("F(x)= " + f);
		}
	}
