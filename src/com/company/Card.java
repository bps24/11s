
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
        if(this.pointValue+otherCard.pointValue==11) return true;
        else return false;
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}