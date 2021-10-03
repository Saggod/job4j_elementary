package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        } else {
            for (int i = 0; i < number; i++) {
                if ((number % number) == 0 & (number % 2) == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}

