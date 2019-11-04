package com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.amex;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.CreditCardFactory;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.Validator;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CardType;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CreditCard;

import java.util.Objects;

public class AmexFactory implements CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        Objects.requireNonNull(cardType);

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                break;
        }

        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
        }

        return null;
    }
}
