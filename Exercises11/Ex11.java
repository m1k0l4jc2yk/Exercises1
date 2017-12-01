
import java.util.Scanner;

public class Ex11 {
    public static void main (String [] args){

        Scanner sc  = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku ");
        double b1 = sc.nextDouble();
        System.out.println("Podaj długość drugiego boku ");
        double b2 = sc.nextDouble();

        System.out.println("Obwód = " + 2*(b1 +b2));
        System.out.println("Pole = " + b1*b2);
    }

}
