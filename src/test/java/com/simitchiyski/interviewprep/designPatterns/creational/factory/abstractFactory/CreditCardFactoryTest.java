package com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CardType;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.amex.*;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.visa.VisaBlackCreditCard;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.visa.VisaFactory;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.visa.VisaGoldCreditCard;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.visa.VisaValidator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CreditCardFactoryTest {
    private static CreditCardFactory amexFactory;
    private static CreditCardFactory visaFactory;

    @BeforeClass
    public static void setUp() throws Exception {
        amexFactory = CreditCardFactory.getCreditCardFactory(775);
        visaFactory = CreditCardFactory.getCreditCardFactory(600);
    }

    @Test
    public void testGetCreditCardFactory() {
        assertTrue(amexFactory instanceof AmexFactory);
        assertTrue(visaFactory instanceof VisaFactory);
    }

    @Test
    public void testGetCreditCard() {
        assertTrue(amexFactory.getCreditCard(CardType.GOLD) instanceof AmexGoldCreditCard);
        assertTrue(amexFactory.getCreditCard(CardType.PLATINUM) instanceof AmexPlatinumCreditCard);

        assertTrue(visaFactory.getCreditCard(CardType.GOLD) instanceof VisaGoldCreditCard);
        assertTrue(visaFactory.getCreditCard(CardType.PLATINUM) instanceof VisaBlackCreditCard);
    }

    @Test
    public void testGetValidator() {
        assertTrue(amexFactory.getValidator(CardType.GOLD) instanceof AmexGoldValidator);
        assertTrue(amexFactory.getValidator(CardType.PLATINUM) instanceof AmexPlatinumValidator);

        assertTrue(visaFactory.getValidator(CardType.GOLD) instanceof VisaValidator);
        assertTrue(visaFactory.getValidator(CardType.PLATINUM) instanceof VisaValidator);

    }
}