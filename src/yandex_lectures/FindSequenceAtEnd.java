package yandex_lectures;/*
 *  Дано: последовательность положительных чисел
 *  Найти последнее вхождение числа X в последовательность
 *  или вывести -1, если X не встретилось.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSequenceAtEnd {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            char[] sequence = reader.readLine().toCharArray();
            char num = reader.readLine().toCharArray()[0];
            int index = -1;
            for (int i = sequence.length - 1; i > 0; i--) {
                if (num == sequence[i]) {
                    index = i;
                    break;
                }
            }
            System.out.println(index);
        }
    }
}
