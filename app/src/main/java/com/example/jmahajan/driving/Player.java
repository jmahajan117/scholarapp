package com.example.jmahajan.driving;

import java.io.Serializable;

/**
 * Created by jmahajan on 4/25/2019.
 */

public class Player implements Serializable{

    public int money;

    public Player(int m)
    {
        money = m;
    }

    public int getMoney()
    {
        return money;
    }
    public void decreaseMoney(int amount)
    {
        money -= amount;
    }
}
