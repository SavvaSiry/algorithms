/*
Уравнение: sqrt(ax + b) = c

Программа должна вывести все решения уравнения в порядке возрастания,
либо NO SOLUTION (заглавными буквами), если решений нет. Если решений
бесконечно много, вывести MANY SOLUTIONS.
*/


package contestv1;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c < 0)
            System.out.println("NO SOLUTION");
        else if (a == 0 && b == 0 && c == 0 || (a == 0 && c * c == b)) System.out.println("MANY SOLUTIONS");
        else {
            if (a != 0 && (c * c - b) * 1.0 / a % 1 == 0) System.out.println((c * c - b) / a);
            else System.out.println("NO SOLUTION");

        }
    }
}