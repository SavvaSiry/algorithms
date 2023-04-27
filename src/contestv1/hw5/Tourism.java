/*
* Напомним, что Александр живет в плоском мире. Горная цепь состоит из отрезков, соединяющих точки на плоскости, каждая из которых
         находится строго правее предыдущей (x-координата следующей точки больше, чем у предыдущей). Трассой на горной цепи называется
         её часть между двумя фиксированными концами отрезков.
         *
      Участок, на котором при движении по трассе координата y (высота) всегда возрастает, называется подъемом, величиной подъема
         называется разность высот между начальной и конечной точками участка.
         *
  Туристическая компания предлагает на выбор несколько трасс на одной горной цепи. Александр из-за финансовых трудностей может
         выбрать для поездки только одну из этих трасс. Вы решили помочь ему с выбором. Александру важно для каждой трассы определить
         суммарную высоту подъемов на ней. Обратите внимание, что трасса может идти как слева-направо, так и справа-налево.
         *
* */

package contestv1.hw5;

import java.util.Scanner;

public class Tourism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n + 1];
        scanner.next();
        int preY = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            scanner.next();
            int y = scanner.nextInt();
            nums[i] = y - preY;
            preY = y;
        }

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            findPrintRes(nums, scanner);
        }
    }

    private static void findPrintRes(int[] nums, Scanner scanner) {
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sum = 0;
        if (l < r) {
            for (int j = l; j < r; j++) {
                if (nums[j] > 0) sum += nums[j];
            }
        } else {
            for (int j = r; j < l; j++) {
                if (nums[j] < 0) sum += nums[j];
            }
        }
        System.out.println(Math.abs(sum));
    }
}
