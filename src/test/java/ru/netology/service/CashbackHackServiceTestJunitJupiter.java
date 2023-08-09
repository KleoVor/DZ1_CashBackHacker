package ru.netology.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTestJunitJupiter {

    @Test
    public void account999() {

        //готовим систему

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        //выполняем целевое действие

        int actual = service.remain(amount);
        int expected = 1;

        // сравниваем ожидаемый и фактический

        assertEquals(expected, actual);
    }

    @Test
    public void account1001() {

        //готовим систему

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        //выполняем целевое действие

        int actual = service.remain(amount);
        int expected = 999;

        // сравниваем ожидаемый и фактический

        assertEquals(expected, actual);
    }
}