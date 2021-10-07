package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
        char wordSimvol = word[word.length - 1 - i];
        char postSimvol = post[post.length - 1 - i];
         if (wordSimvol != postSimvol) {
             result =  false;
         }
        }

        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}
