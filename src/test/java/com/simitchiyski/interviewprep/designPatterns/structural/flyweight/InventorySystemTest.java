package com.simitchiyski.interviewprep.designPatterns.structural.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventorySystemTest {

    @Test
    public void report() {
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Samsung TV", 323);
        ims.takeOrder("Roomba", 563);
        ims.takeOrder("Bose Headphones", 321);
        ims.takeOrder("Roomba", 234);
        ims.takeOrder("Samsung TV", 54);
        ims.takeOrder("Roomba", 34);
        ims.takeOrder("Bose Headphones", 365);
        ims.takeOrder("Samsung TV", 332);
        ims.takeOrder("Roomba", 456);

        ims.process();

        assertEquals("Total Item objects made: 3", ims.report());
        System.out.println();
        System.out.println(ims.report());
    }
}