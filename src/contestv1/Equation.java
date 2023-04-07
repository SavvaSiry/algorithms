package contestv1;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c < 0 || (c * c - b) % a != 0 || (c * c - b) / a < 0) System.out.println("NO SOLUTION");
        else if (a == 0) System.out.println("MANY SOLUTIONS");
        else System.out.println((c * c - b) / a);
    }
}
