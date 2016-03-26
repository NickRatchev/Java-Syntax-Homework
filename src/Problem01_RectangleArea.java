import java.util.Scanner;

public class Problem01_RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sideOne = console.nextInt();
        int sideTwo = console.nextInt();

        System.out.printf("Rectangle area is: %d", sideOne * sideTwo);
    }
}
