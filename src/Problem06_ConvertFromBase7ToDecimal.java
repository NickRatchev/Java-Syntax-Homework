import java.util.Scanner;

public class Problem06_ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        long baseSevenNumber = console.nextLong();
        long decimalNumber = 0;
        int baseSevenLenght = String.valueOf(baseSevenNumber).length();

        for (int i = 0; i < baseSevenLenght; i++) {
            decimalNumber += (baseSevenNumber % 10) * Math.pow(7, i);
            baseSevenNumber /= 10;
        }

        System.out.print("Decimal: " + decimalNumber);
    }
}
