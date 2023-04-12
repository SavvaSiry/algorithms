/*
* Аня и Боря любят играть в разноцветные кубики, причем у каждого из них свой набор
* и в каждом наборе все кубики различны по цвету. Однажды дети заинтересовались,
* сколько существуют цветов таких, что кубики каждого цвета присутствуют в обоих
* наборах. Для этого они занумеровали все цвета случайными числами. На этом их
* энтузиазм иссяк, поэтому вам предлагается помочь им в оставшейся части. Номер
* любого цвета — это целое число в пределах от 0 до 10^9.
*
* В первой строке входного файла записаны числа N и M — количество кубиков у Ани и Бори соответственно.
*  В следующих N строках заданы номера цветов кубиков Ани. В последних M строках номера цветов кубиков Бори.
*
*
* Выведите сначала количество, а затем отсортированные по возрастанию номера цветов таких,
* что кубики каждого цвета есть в обоих наборах, затем количество и отсортированные по
* возрастанию номера остальных цветов у Ани, потом количество и отсортированные по возрастанию
* номера остальных цветов у Бори.
* */

package contestv1.hw3;

import java.util.*;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> nSet = readSetFromConsole(scanner, n);
        Set<Integer> mSet = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            if (nSet.contains(num)) {
                nSet.remove(num);
                common.add(num);
            } else mSet.add(num);
        }

        printSet(common);
        printSet(nSet);
        printSet(mSet);
    }

    private static Set<Integer> readSetFromConsole(Scanner scanner, int count) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(scanner.nextInt());
        }
        return set;
    }

    private static void printSet(Set<?> set) {
        System.out.println(set.size());
        set.stream().sorted().forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }
}
