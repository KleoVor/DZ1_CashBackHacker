package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void amount1000() {

    // готовим данные

    CashbackHackService servise1 = new CashbackHackService();
    int amount = 1000;

    // выполнение целевого действия

    int actual = servise1.remain(amount);
    int expected = 0;

    //сравнеиние актуальнго и ожидаемого результата

    Assert.assertEquals(actual, expected);

    }

    @Test
    public void amount999() {

        // готовим данные

        CashbackHackService servise1 = new CashbackHackService();
        int amount = 999;

        // выполнение целевого действия

        int actual = servise1.remain(amount);
        int expected = 1;

        //сравнеиние актуальнго и ожидаемого результата

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void amount1001() {

        // готовим данные

        CashbackHackService servise1 = new CashbackHackService();
        int amount = 1001;

        // выполнение целевого действия

        int actual = servise1.remain(amount);
        int expected = 999;

        //сравнеиние актуальнго и ожидаемого результата

        Assert.assertEquals(actual, expected);

    }

}