package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {

        for (int i = 0; i < left.length; i++) {
            left[i] = left[left.length - 1];
            right[i] = right[left.length - 1];
            if (left[i] == right[i]) {
                return true;
            }
        }
        return false;
    }
}
