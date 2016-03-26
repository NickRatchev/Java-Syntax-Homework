import java.util.Scanner;

public class Problem10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputStrings = console.nextLine().split("\\s+");

        System.out.print(charMultiplier(inputStrings[0], inputStrings[1]));
    }

    private static long charMultiplier(String str1, String str2) {
        long result = 0;

        int lenght1 = str1.length();
        int lenght2 = str2.length();
        int char1Value, char2Value;

        for (int i = 0; i < Math.max(lenght1, lenght2); i++) {
            if (i < lenght1) {
                char1Value = str1.charAt(i);
            } else {
                char1Value = 1;
            }
            if (i < lenght2) {
                char2Value = str2.charAt(i);
            } else {
                char2Value = 1;
            }
            result += char1Value * char2Value;
        }

        return result;
    }
}
