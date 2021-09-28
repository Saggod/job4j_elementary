package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rsl;
        int divTwo = number % 2;
        int divThree = number % 3;

        if (divTwo == 0) {
            if (divThree == 0) {
                rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число не делится на 3, но является четным.";
            }
        } else {
            if (divThree != 0) {
                rsl = "Исходное число не делится на 3 и не является четным.";
            } else {
                rsl =  "Исходное число делится на 3, но не является четным.";
            }
        }
        return rsl;
    }
}
