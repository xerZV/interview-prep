package com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CardType;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CreditCard;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.amex.AmexFactory;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.visa.VisaFactory;

//AbstractFactory
public interface CreditCardFactory {

    static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    CreditCard getCreditCard(CardType cardType);

    Validator getValidator(CardType cardType);
}
