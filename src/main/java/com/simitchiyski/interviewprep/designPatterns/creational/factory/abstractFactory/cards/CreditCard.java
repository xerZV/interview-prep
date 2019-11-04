package com.simitchiyski.interviewprep.designPatterns.creational.factory.abstractFactory.cards;

public abstract class CreditCard {

    private int cardNumberLength;

    private int cscNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }

}
