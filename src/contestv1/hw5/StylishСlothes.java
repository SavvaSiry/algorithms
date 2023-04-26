/*
* Глеб обожает шоппинг. Как-то раз он загорелся идеей подобрать себе майку и штаны так, чтобы выглядеть в них максимально стильно. В понимании Глеба стильность одежды тем больше, чем меньше разница в цвете элементов его одежды.

В наличии имеется N (1 ≤ N ≤ 100 000) маек и M (1 ≤ M ≤ 100 000) штанов, про каждый элемент известен его цвет (целое число от 1 до 10 000 000). Помогите Глебу выбрать одну майку и одни штаны так, чтобы разница в их цвете была как можно меньше.
*
* Сначала вводится информация о майках: в первой строке целое число N (1 ≤ N ≤ 100 000) и во второй N целых чисел от 1 до 10 000 000 — цвета имеющихся в наличии маек. Гарантируется, что номера цветов идут в возрастающем порядке (в частности, цвета никаких двух маек не совпадают).

Далее в том же формате идёт описание штанов: их количество M (1 ≤ M ≤ 100 000) и в следующей строке M целых чисел от 1 до 10 000 000 в возрастающем порядке — цвета штанов.
*
* Выведите пару неотрицательных чисел — цвет майки и цвет штанов, которые следует выбрать Глебу. Если вариантов выбора несколько, выведите любой из них.
* */

package contestv1.hw5;

import java.util.Scanner;

public class StylishСlothes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nArr = readFromConsole(scanner, n);
        int m = scanner.nextInt();
        int[] mArr = readFromConsole(scanner, m);
        System.out.println(findStylishSet(nArr, mArr));
    }

    private static String findStylishSet(int[] nArr, int[] mArr) {
        int i = 0;
        int j = 0;
        int diff = Math.abs(nArr[0] - mArr[0]);
        String answer = nArr[0] + " " + mArr[0];
        while (nArr.length + mArr.length - 2 > i + j) {
            if (i != nArr.length - 1 && j != nArr.length - 1 && nArr[i] < mArr[j]) {
                i++;
            } else if (j != mArr.length - 1) {
                j++;
            } else i++;

            if (Math.abs(nArr[i] - mArr[j]) < diff) {
                diff = Math.abs(nArr[i] - mArr[j]);
                answer = nArr[i] + " " + mArr[j];
            }
        }
        return answer;
    }

    private static int[] readFromConsole(Scanner scanner, int n) {
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

}
