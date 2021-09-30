package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void day8error() {
        int day = 8;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void day3wednesday() {
        int day = 3;
        String expected = "Среда";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(result, expected);
    }
}