package contestv1;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int m = scanner.nextInt();
        int k2 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int n2 = scanner.nextInt();
//        double checkIfFloorsDif = Math.ceil(k2 * 1.0 / n2) * (n2 - 1);
        if (m * (p2 - 1) + n2 > k2 || Math.ceil(k2 * 1.0 / n2) * (n2 - 1) > k2) System.out.println("-1 -1");
        else {
            if (n2 == 1) {
                if (m == 1) System.out.println("0 1");
                else System.out.println("0 0");
            } else {
                int apartmentsPerFloor = (int) Math.ceil(k2 * 1.0 / n2);
                int apartmentsPerBuilding = m * apartmentsPerFloor;
                int p1 = (int) Math.ceil(k1 * 1.0 / apartmentsPerBuilding);
                int n1 = (int) Math.ceil((k1 - (apartmentsPerBuilding * (p1 - 1))) * 1.0 / apartmentsPerFloor);
                System.out.println(p1 + " " + n1);
            }
        }
    }
}
