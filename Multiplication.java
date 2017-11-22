import java.util.Scanner;

public class Multiplication {


    public static void main(String[] args) {
        int i1;
        int i2;
        int suma;
        int mnozenie;

        Scanner sc = new Scanner(System.in);
        System.out.println("podaje pierwszą liczbę:");
        i1 = sc.nextInt();
        System.out.println("podaje drugą liczbę:");
        i2 = sc.nextInt();
        suma = i1 + i2;
        System.out.println("Wynik dodawania = " + suma);
        mnozenie = i1 * i2;
        System.out.println("Wynik mnożenia =  " + mnozenie);
    }
}
