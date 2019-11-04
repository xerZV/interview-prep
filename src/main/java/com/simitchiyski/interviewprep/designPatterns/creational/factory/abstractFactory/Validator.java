package com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory;

import com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
