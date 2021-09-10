package com.example.tdd.ch1;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public String currency() {
        return currency;
    }

}
