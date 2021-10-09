package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4Then1() {
        int[] data = {5, 4, 3, 2};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas1Then4() {
        int[] data = {5, 4, 3, 2, 1, 0};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind7() {
        int[] data = new int[] {5, 2, 1, 2, 4, 5, 6, 10, 2};
        int el = 10;
        int start = 5;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind2() {
        int[] data = new int[]{3, 4, 5, 15, 7, 8, 10, 1};
        int el = 15;
        int start = 4;
        int finish = 7;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);

    }
}