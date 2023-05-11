package tink.test;

import java.util.*;

public class Some {

    final static String test = null;

    public static void main(String[] args) {
        short i1 = Short.MAX_VALUE;
        long i2 = Long.MAX_VALUE;
        int diff = (short) (i1 - i2);
        System.out.println(diff);

        int k = 5;
        for (short i = 0; i < 5; ) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            k += 3;
        }
        System.out.println(k);

        Test test = new Test();
        System.out.println(test instanceof Some);

//        ArrayList<String> catNames = (ArrayList<String>) Arrays.asList("Mira", "Aisa");
//        catNames.add("sss");
//        catNames.add("Jiko");
//        System.out.println(catNames);

        new Thread(() -> System.out.println("Thread 1")).start();
        System.out.println("Thread 0");

        String str = "d";
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            str += "e";
        } finally {
            str += "f";
        }
        System.out.println(str);

        String str1 = "d";
        try {
            throw new RuntimeException();
        } catch (Error e) {
            str1 += "e";
        } catch (RuntimeException e) {
            str1 += "f";
        }
        System.out.println(str1);

        Map<Integer, Integer> relations = new HashMap<>();
        relations.put(1, 2);
        relations.put(3, 4);
        relations.forEach((f, v) -> relations.put(v, f));


//        Integer[] ageArray;
//        try {
//            String age = "29";
//            ageArray = new Integer[]{Integer.parseInt(age)};
//        } catch (NumberFormatException nfe) {
//            System.out.println("Error parsing age");
//        }
//        System.out.println(Arrays.toString(ageArray));
    }

    public final Integer doNothingForNow(boolean needSum, int... numbers) {
        return null;
    }
}

class Test extends Some {

}

interface Somes {

}


