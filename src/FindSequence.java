/*
Дано: последовательность чисел длиной N
Найти первое вхождение положительного числа X в нее
или вывести -1, если число Х не встретилось.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSequence {

    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sequenceStr = reader.readLine();
            String subStr = reader.readLine();
            char[] sequence = sequenceStr.toCharArray();
            char[] sub = subStr.toCharArray();
            int index = -1;
            int j = 0;
            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i] == sub[j]) {
                    if (index == -1) index = i;
                    if (j == sub.length - 1) break;
                    j++;
                } else {
                    index = -1;
                    j = 0;
                }
            }
            System.out.println(index);
        }
    }
}
