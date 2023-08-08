package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void calculateAmount1000() {
        // подготовка

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        //выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 1000;

        //сравнение ожидаемого результата и факического

        assertEquals(actual, expected);

    }

    @Test
    void calculateAmount999() {
        // подготовка

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        //выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 1;

        //сравнение ожидаемого результата и факического

        assertEquals(actual, expected);

    }

    @Test
    void calculateAmount1001() {
        // подготовка

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        //выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 999;

        //сравнение ожидаемого результата и факического

        assertEquals(actual, expected);

    }

    @Test
    void calculateAmount1() {
        // подготовка, будем "ронять"

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        //выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 999;

        //сравнение ожидаемого результата и факического

        assertEquals(actual, expected);

    }

}