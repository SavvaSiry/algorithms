package tink.test_contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutPieBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<xy> list = new ArrayList<>(n);
        double min = 1000;
        double max = 0;
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            list.add(new xy(x, y));
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.printf("%.10f",round(binarySearch(list, min, max)));
    }

    public static double binarySearch(List<xy> list, double min, double max) {
        double l = min;
        double r = max;
        double m = 0;
        double half = getSquare(list) / 2;
        double square = 0;
        while (round(square) != round(half)) {
            m = (r - l) / 2 + l;
            square = getSquare(separate(list, m));
            if (square > half) r = m;
            else l = m;
        }
        return m;
    }

    public static double round(double value) {
        double scale = Math.pow(10, 10);
        return Math.ceil(value * scale) / scale;
    }

    public static List<xy> separate(List<xy> list, double x) {
        List<xy> sublistL = new ArrayList<>();
//        List<xy> sublistR = new ArrayList<>();
        double yl = 0;
        double yr = 0;
        double x1;
        double x2;
        double y1;
        double y2;

        for (int i = 0; i < list.size(); i++) {

            if (i != list.size() - 1) {
                x1 = list.get(i).x;
                x2 = list.get(i + 1).x;
                y1 = list.get(i).y;
                y2 = list.get(i + 1).y;
            } else {
                x1 = list.get(i).x;
                x2 = list.get(0).x;
                y1 = list.get(i).y;
                y2 = list.get(0).y;
            }

            if (x1 < x) sublistL.add(list.get(i));
//            else sublistR.add(list.get(i));

            if (x1 <= x && x < x2) {
                yl = (x - x1) / (x2 - x1) * (y2 - y1) + y1;
            } else if (x < x1 && x2 <= x) {
                yr = (x - x1) / (x2 - x1) * (y2 - y1) + y1;
            }
        }

        sublistL.add(new xy(x, yl));
        sublistL.add(new xy(x, yr));
        return sublistL;
//        sublistR.add(0, new xy(x, yl));
//        sublistR.add(0, new xy(x, yr));

//        System.out.println("Square = " + getSquare(sublistL));
//        sublistL.forEach(xy -> System.out.println(xy.x + " " + xy.y));

//        System.out.println("Square = " + getSquare(sublistR));
//        sublistR.forEach(xy -> System.out.println(xy.x + " " + xy.y));
    }


    private static double getSquare(List<xy> list) {
        double square = 0;
        square += list.get(0).x * (list.get(1).y - list.get(list.size() - 1).y);
        for (int i = 1; i < list.size() - 1; i++) {
            square += list.get(i).x * (list.get(i + 1).y - list.get(i - 1).y);
        }
        square += list.get(list.size() - 1).x * (list.get(0).y - list.get(list.size() - 2).y);
        return Math.abs(square / 2.0);
    }

    private static class xy {
        double x;
        double y;

        public xy(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
