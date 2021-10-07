package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
            for (int i = 0; i < pref.length; i++) {
                char letterWord = word[i];
                char letterPref = pref[i];
                if (letterWord != letterPref) {
                    result = false;
                }
            }
        return result;
    }
}
