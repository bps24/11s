
package com.company;

public class Card {

    private String suit, rank;

    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.suit=cardSuit;
        this.rank=cardRank;
        this.pointValue=cardPointValue;
    }

    public String suit() { return this.suit; }

    public String rank() { return this.rank; }

    public int pointValue() { return this.pointValue; }

    public boolean matches(Card otherCard) {
        return otherCard.suit.equals(this.suit)&&
                otherCard.rank.equals(this.rank)&&
                otherCard.pointValue==this.pointValue;
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}