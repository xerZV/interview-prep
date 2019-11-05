package com.simitchiyski.interviewprep.designPatterns.structural.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void testToString() {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
        assertEquals("Main: /main\n" +
                "Safety: /safety\n" +
                "Claims: /claims\n" +
                "Personal Claim: /personalClaims\n", mainMenu.toString());
    }
}