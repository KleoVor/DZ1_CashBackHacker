package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTestJunit4 {

    @Test
   public void amount900(){

        // готовим систему
       CashbackHackService service = new CashbackHackService();
       int amount = 900;

       // выполняем целевое действие

        int actual = service.remain(amount);
        int expected = 100;

        //сравнение ожидаемого и фактического результата

        assertEquals(expected, actual);

    }

    @Test
    public void amount1001(){

        // готовим систему
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        // выполняем целевое действие

        int actual = service.remain(amount);
        int expected = 999;

        //сравнение ожидаемого и фактического результата

        assertEquals(expected, actual);

    }

    @Test
    public void amount999(){

        // готовим систему
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        // выполняем целевое действие

        int actual = service.remain(amount);
        int expected = 1;

        //сравнение ожидаемого и фактического результата

        assertEquals(expected, actual);

    }

    @Test
    public void amount1000(){

        // готовим систему
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        // выполняем целевое действие

        int actual = service.remain(amount);
        int expected = 0;

        //сравнение ожидаемого и фактического результата

        assertEquals(expected, actual);

    }
}