/*
* https://contest.yandex.ru/contest/27794
*
* В центре города Че есть пешеходная улица - одно из самых популярных мест для прогулок жителей города. По этой улице очень приятно гулять, ведь вдоль улицы расположено n забавных памятников.
* Девочке Маше из города Че нравятся два мальчика из ее школы, и она никак не может сделать выбор между ними. Чтобы принять окончательное решение, она решила назначить обоим мальчикам свидание в одно и то же время. Маша хочет выбрать два памятника на пешеходной улице, около которых мальчики будут ее ждать. При этом она хочет выбрать такие памятники, чтобы мальчики не увидели друг друга. Маша знает, что из-за тумана мальчики увидят друг друга только в том случае, если они будут на расстоянии не более r метров.
* Маше заинтересовалась, а сколько способов есть выбрать два различных памятника для организации свиданий.
*
* */

package contestv1.hw5;

import java.util.Scanner;

public class CheCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int[] meter = new int[n];
        for (int i = 0; i < n; i++) {
            meter[i] = scanner.nextInt();
        }
        System.out.println(findStatue(r, meter));
    }

    public static long findStatue(int range, int[] meters) {
        int l = 0;
        int r = 1;
        long counter = 0;
        while (r != meters.length) {
            if (meters[r] - meters[l] > range) {
                counter += meters.length - r;
                if (r - 1 == l) {
                    l++;
                    r++;
                } else l++;
            } else {
                r++;
            }
        }
        return counter;
    }
}
