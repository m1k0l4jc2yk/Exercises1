import java.util.Scanner;

public class PolePowierzchni {

    //public static double promien = 7.5;
    public static double promien;

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj promień koła");
        double promien = sc.nextDouble();

        double pole = Math.PI * promien * promien;
        double obwod = 2* Math.PI * promien;

        System.out.println("Pole powierzchni koła o promieniu " +promien +" = " +pole );
        System.out.println("Obwód koła o promieniu " + promien +" = " +obwod);

    }
}
