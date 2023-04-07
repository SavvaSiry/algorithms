package yandex_lectures;/*
 * Игра yandex_lectures.PitCraft происходит в двумерном мире, который состоит из блоков 1 на 1 метр. Остров игрока представляет собой набор столбцов различной высоты,
 * состоящий из блоков камня и окруженный морем. Над островом прошел сильный дождь, который заполнил водой все низины, а не поместившаяся в них вода
 * стекла в море, не увеличив его уровень.
 *
 * По ландшафту острова определите, сколько блоков воды осталось после дождя в низинах на острове
 *
 * */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PitCraft {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] blocksArr = reader.readLine().split(" ");
            int[] blocks = Arrays.stream(blocksArr).mapToInt(Integer::parseInt).toArray();
            int max = 0;
            int index = 0;
            int sum = 0;
            HashMap<String, ArrayList<Integer>> blockMap = new HashMap<>();
            for (int i = 0; i < blocks.length; i++) {

                if (max < blocks[i]) max = blocks[i];

                for (int j = 0; j < max; j++) {

                    ArrayList<Integer> integers = blockMap.get(String.valueOf(j + 1));

                    if (integers == null) {
                        ArrayList<Integer> list = new ArrayList<>();
                        blockMap.put(String.valueOf(j + 1), list);
                        for (int k = 0; k < i; k++) {
                            list.add(0);
                        }
                        list.add(1);
                    }

                    else if (j + 1 <= blocks[i]) integers.add(1);
                    else integers.add(0);
                }
            }
        }
    }
}

/*for (int i = 0; i < blocks.length; i++) {
        if (blocks[i] >= max) {
        if (max != 0) sum += (i - index - 1) * blocks[i] - max;
        max = blocks[i];
        index = i;
        }
        }*/
