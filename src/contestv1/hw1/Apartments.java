/*
Бригада скорой помощи выехала по вызову в один из отделенных районов. К сожалению, когда диспетчер получил вызов,
он успел записать только адрес дома и номер квартиры K1, а затем связь прервалась. Однако он вспомнил, что по
этому же адресу дома некоторое время назад скорая помощь выезжала в квартиру K2, которая расположена в подъезда
P2 на этаже N2. Известно, что в доме M этажей и количество квартир на каждой лестничной площадке одинаково.
Напишите программу, которая вычилсяет номер подъезда P1 и номер этажа N1 квартиры K1.
* */


package contestv1.hw1;

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
