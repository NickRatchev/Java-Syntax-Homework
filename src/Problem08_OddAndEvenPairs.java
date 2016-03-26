import java.util.Scanner;

public class Problem08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputStr = console.nextLine();

        String[] strArray = inputStr.split("\\s+");
        int arrayLenght = strArray.length;
        int[] intArray = new int[arrayLenght];

        if (arrayLenght % 2 == 1) {
            System.out.print("Invalid length");
        } else {
            for (int i = 0; i < arrayLenght; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            for (int i = 0; i < arrayLenght; i += 2) {
                if (intArray[i] % 2 == 1 && intArray[i + 1] % 2 == 1){
                    System.out.printf("%d, %d -> both are odd\n", intArray[i], intArray[i+1]);
                }
                else {
                    if (intArray[i] % 2 == 0 && intArray[i + 1] % 2 == 0){
                        System.out.printf("%d, %d -> both are even\n", intArray[i], intArray[i+1]);
                    }
                    else {
                        System.out.printf("%d, %d -> different\n", intArray[i], intArray[i+1]);
                    }
                }
            }
        }
    }
}
