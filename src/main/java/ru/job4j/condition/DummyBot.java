package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rs1;
        if ("Привет, Бот.".equals(question)) {
            rs1 = "Привет, умник!";
        } else if ("Пока.".equals(question)) {
            rs1 = "До скорой встречи.";
        } else {
            rs1 = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rs1;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}
