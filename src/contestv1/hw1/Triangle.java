/*
Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами.
Если это возможно, выведите строку YES, иначе выведите строку NO.
Треугольник — это три точки, не лежащие на одной прямой.
* */


package contestv1.hw1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b <= c || b + c <= a || c + a <= b) System.out.println("NO");
        else System.out.println("YES");
    }
}
