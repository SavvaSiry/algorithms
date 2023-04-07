package contestv1;

import java.util.Scanner;

public class AirConditioner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tStart = scanner.nextInt();
        int tEnd = scanner.nextInt();
        String mode = scanner.next();
        System.out.println(res(tStart, tEnd, mode));
    }

    public static int res(int tStart, int tEnd, String mode) {
        return switch (mode) {
            case "freeze" -> Math.min(tStart, tEnd);
            case "heat" -> Math.max(tStart, tEnd);
            case "auto" -> tEnd;
            case "fan" -> tStart;
            default -> 0;
        };
    }
}
