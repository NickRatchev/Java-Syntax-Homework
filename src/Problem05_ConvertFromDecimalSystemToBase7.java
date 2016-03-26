import java.util.Scanner;

public class Problem05_ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        long decimalNumber = console.nextLong();
        String baseSevenNumber = "";

        do {
            switch ((int)decimalNumber % 7) {
                case 0:
                    baseSevenNumber = '0' + baseSevenNumber;
                    break;
                case 1:
                    baseSevenNumber = '1' + baseSevenNumber;
                    break;
                case 2:
                    baseSevenNumber = '2' + baseSevenNumber;
                    break;
                case 3:
                    baseSevenNumber = '3' + baseSevenNumber;
                    break;
                case 4:
                    baseSevenNumber = '4' + baseSevenNumber;
                    break;
                case 5:
                    baseSevenNumber = '5' + baseSevenNumber;
                    break;
                case 6:
                    baseSevenNumber = '6' + baseSevenNumber;
                    break;
                default:
                    break;
            }
            decimalNumber /= 7;
        }
        while (decimalNumber > 0);

        System.out.print("Base-7: " + baseSevenNumber);
    }
}
