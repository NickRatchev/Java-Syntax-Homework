import java.util.Locale;
import java.util.Scanner;

public class Problem03_FormattingNumbers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner console = new Scanner(System.in);
        int numberOne = console.nextInt();
        double numberTwo = console.nextDouble();
        double numberThree = console.nextDouble();
        String binaryStr = String.format("%10s", Integer.toBinaryString(numberOne)).replace(' ', '0');
        System.out.printf("|%-10x|%10s|%10.2f|%-10.3f|", numberOne, binaryStr, numberTwo, numberThree);
    }
}
