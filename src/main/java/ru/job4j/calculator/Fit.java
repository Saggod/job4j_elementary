package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(short height) {
        double rs2 = (height - 110) * 1.15;
        return rs2;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }
}


