import java.util.Locale;
import java.util.Scanner;

public class Problem04_CalculateExpression {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double formula1Result = Math.pow((a * a + b * b) / (a * a - b * b), (a + b + c) / Math.sqrt(c));
        double formula2Result = Math.pow(a * a + b * b - c * c * c, a - b);
        double difference = (a + b + c) / 3 - (formula1Result + formula2Result) / 2;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formula1Result, formula2Result, difference);
    }
}
