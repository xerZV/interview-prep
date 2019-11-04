package com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.visa;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.CreditCardFactory;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.Validator;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CardType;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CreditCard;

import java.util.Objects;

public class VisaFactory implements CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        Objects.requireNonNull(cardType);

        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
