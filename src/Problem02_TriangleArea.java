import java.util.Scanner;

public class Problem02_TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;

        x1=console.nextInt();
        y1=console.nextInt();
        console.nextLine();
        x2=console.nextInt();
        y2=console.nextInt();
        console.nextLine();
        x3=console.nextInt();
        y3=console.nextInt();

        double triangleArea = Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);
        System.out.printf("Triangle area is: %.0f", triangleArea);
    }
}
