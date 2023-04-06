package tink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutPieBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<xy> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new xy(scanner.nextDouble(), scanner.nextDouble()));
        }
        separate(list, 1);
    }

    public static void separate(List<xy> list, double x) {
        List<xy> sublistL = new ArrayList<>();
        List<xy> sublistR = new ArrayList<>();
        int left;
        int right;
        double yl;
        double yr;
        double x1;
        double x2;
        double y1;
        double y2;

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1){
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
            if (x1 <= x && x <= x2) {
                yl = (x - x1) / (x2 - x1) * (y2 - y1) + y1;
                left = i;
            } else if (x <= x1 && x2 <= x) {
                yr = (x - x1) / (x2 - x1) * (y2 - y1) + y1;
                right = i;
            }
        }

        sublistL.forEach(xy -> System.out.println(xy.x + " " + xy.y));
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
