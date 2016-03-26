import java.util.Scanner;

public class Problem11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputString = console.nextLine().split("\\s+");
        String[] commands = console.nextLine().split("\\s+");
        int oddEvenCount = Integer.parseInt(commands[1]);
        int[] inputNumbers = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++) {
            inputNumbers[i] = Integer.parseInt(inputString[i]);
        }

        int numbersCount = Integer.parseInt(commands[1]);
        int currentNumberCount = 0;

        switch (commands[2]) {
            case "odd":
                for (int number : inputNumbers) {
                    if (currentNumberCount < numbersCount) {
                        if (number % 2 == 1) {
                            System.out.print(number + " ");
                            currentNumberCount++;
                        }
                    } else
                        break;
                }
            case "even":
                for (int number : inputNumbers) {
                    if (currentNumberCount < numbersCount) {
                        if (number % 2 == 0) {
                            System.out.print(number + " ");
                            currentNumberCount++;
                        }
                    } else
                        break;
                }
            default:
                break;
        }
    }
}
