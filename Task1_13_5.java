package by.epam.lesson3.hometask3;
import java.util.Scanner;

public class Task1_13_5 {
	public static void main (String[] args) {
		int n=10;
		double y=0;
		Scanner sc=new Scanner(System.in);
		String max = "", min = "", str = "";
		for (int i=0;i<n;i++) {
		 System.out.print("> ");
		 if (sc.hasNextLine()) {
			 str=sc.nextLine();
			 if (i==0) {
				 min=str;
				 if (str.length()>max.length()){
			maxLgth(str);}
			 } else if (str.length()<min.length())
				 min=str;
		 }
		}
		 System.out.println("max string = " + max + " length=" + max.length());
		 System.out.println("min string = " + min + " length=" + min.length());}
		public static void maxLgth(String str) {
			String max="";
			 max=str;
		}
	}
			
