
public class Sequence2 {
    public int firstNumber = 0;
    public int secondNumber = 1;
    public int nextNumber;
    public final int SEQUENCE_LIMIT = 100;
    public final int SEQUENCE_COUNT = 10;

    public void displaySequence() {

        System.out.println(firstNumber + " ");
        System.out.println(secondNumber + " ");
        nextNumber = firstNumber + secondNumber;

        for (int count = 2; count < SEQUENCE_COUNT; count++) {
            System.out.println(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
        System.out.println();
    }
}