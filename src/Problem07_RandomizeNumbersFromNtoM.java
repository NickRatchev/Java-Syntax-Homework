import java.util.Random;
import java.util.Scanner;

public class Problem07_RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();
        Random rnd = new Random();

        int difference = Math.abs(firstNumber - secondNumber);
        int minNumber = Math.min(firstNumber, secondNumber);

        for (int i = 0; i < 30; i++) {
            int randomNumber = minNumber + rnd.nextInt(difference + 1);
            System.out.print(randomNumber + " ");
        }
    }
}
