package com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.amex;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.Validator;
import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CreditCard;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        //TODO
        return true;
    }

}
