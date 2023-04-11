/*
* Напишите программу, которая находит в массиве элемент, самый близкий по величине к  данному числу.
*
* В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива.
* Во второй строке содержатся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000).
* В третьей строке вводится одно целое число x, не превосходящее по модулю 1000.
* */

package contestv1.hw2;

import java.util.Scanner;

public class FindCloseNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int searchNum = scanner.nextInt();
        int index = 0;
        int min = Math.abs(searchNum - numbers[index]);
        for (int i = 0; i < numbers.length; i++) {
            int localMin = Math.abs(searchNum - numbers[i]);
            if (localMin < min) {
                min = localMin;
                index = i;
            }
        }
        System.out.println(numbers[index]);
    }
}
