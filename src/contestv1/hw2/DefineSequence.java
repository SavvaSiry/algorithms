/*
По последовательности чисел во входных данных определите ее вид:

CONSTANT – последовательность состоит из одинаковых значений
ASCENDING – последовательность является строго возрастающей
WEAKLY ASCENDING – последовательность является нестрого возрастающей
DESCENDING – последовательность является строго убывающей
WEAKLY DESCENDING – последовательность является нестрого убывающей
RANDOM – последовательность не принадлежит ни к одному из вышеупомянутых типов
* */

package contestv1.hw2;

import java.io.IOException;
import java.util.*;

public class DefineSequence {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>(List.of("CONSTANT", "ASCENDING", "WEAKLY ASCENDING", "DESCENDING", "WEAKLY DESCENDING"));

        int previous;
        int next = scanner.nextInt();

        while (scanner.hasNext()) {
            previous = next;
            next = scanner.nextInt();
            if (next == -2000000000 || previous == -2000000000) break;

            if (previous > next) list.remove("WEAKLY ASCENDING");
            if (previous >= next) list.remove("ASCENDING");

            if (previous != next) list.remove("CONSTANT");

            if (previous < next) list.remove("WEAKLY DESCENDING");
            if (previous <= next) list.remove("DESCENDING");

        }
        if (list.size() == 1) System.out.println(list.get(0));
        else if (list.size() == 2) {
            if (list.get(0).contains("ASCENDING") && list.get(1).contains("ASCENDING")) System.out.println("ASCENDING");
            else if (list.get(0).contains("DESCENDING") && list.get(1).contains("DESCENDING")) System.out.println("DESCENDING");
        } else if (list.contains("CONSTANT")) {
            System.out.println("CONSTANT");
        } else System.out.println("RANDOM");
    }
}
