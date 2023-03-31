/*
* Дан словарь из слов N, длина каждого не превосходит К
* В записи каждого из M слов может быть пропущена одна буква,
* для каждого слова сказать входить ли оно в словарь с учетом опечатки
* */


import java.util.HashSet;

public class WordInDic {
    public static void main(String[] args) {
        String[] dic = {"dock", "dog", "cat"};
        HashSet<String> set = new HashSet<>();
        for (String s : dic) {
            String[] arr = s.split("");
            for (int i = 0; i < arr.length; i++) {
                set.add(s.substring(0, i) + s.substring(i + 1));
            }
        }

    }
}
