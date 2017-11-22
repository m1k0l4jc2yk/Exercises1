 import java.util.Scanner;


public class CalcAverage {

   public static void main (String args[]) {
	
   	Scanner sc = new Scanner (System.in);
	System.out.println();
	System.out.println("Podaj trzy liczby oddzielone spacją: (np 2 15 45)");
	int i1 = sc.nextInt();
	int i2 = sc.nextInt();
	int i3 = sc.nextInt();
	int avg = (i1 + i2 + i3)/3;
	System.out.println();
		
	System.out.println("Srednia = " + avg);
   }
}