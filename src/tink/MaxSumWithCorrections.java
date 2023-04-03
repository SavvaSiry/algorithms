package tink;

import java.util.*;

public class MaxSumWithCorrections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        long newSum = 0;

        ArrayList<Integer> arrayList = new ArrayList<>(n);
        StringBuffer stringBuffer = new StringBuffer();

        while (count != n) {
            count++;
            stringBuffer.append(scanner.next());
            int num = Integer.parseInt(stringBuffer.toString());
            parse(arrayList, stringBuffer.length(), num);
            stringBuffer.setLength(0);
        }

        arrayList.sort(Collections.reverseOrder());
        if (arrayList.size() < k) k = arrayList.size();
        for (int i = 0; i < k; i++) {
            newSum += arrayList.get(i);
        }
        System.out.println(newSum);
    }

    public static void parse(ArrayList<Integer> list, int len, int num) {
        int difference = getMax(len) - num;
        if (num > 0) {
            int factor = 0;
            while (difference != 0) {
                list.add((int) (difference % 10 * Math.pow(10, factor)));
                difference = difference / 10;
                factor++;
            }
        }
    }

    public static int getMax(int n) {
        return switch (n) {
            case 1 -> 9;
            case 2 -> 99;
            case 3 -> 999;
            case 4 -> 9999;
            case 5 -> 99999;
            case 6 -> 999999;
            case 7 -> 9999999;
            case 8 -> 99999999;
            case 9 -> 999999999;
            default -> 0;
        };
    }
}
