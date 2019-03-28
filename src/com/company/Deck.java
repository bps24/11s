package com.company;

import java.util.*;

public class Deck {

    private int size;
    private ArrayList <Card> cards;

    public Deck( String [] ranks, String [] suits, int [] pointValues) throws NullPointerException
    {
        cards = new ArrayList<Card>();
        for (int j = 0; j < ranks.length; j++) {
            for (String suitString : suits) {
                cards.add(new Card(ranks[j], suitString, pointValues[j]));
            }
        }
        size = cards.size();
        shuffle();
    }

    public void shuffle() {
        Card[] cards2= Shuffler.toArray(cards);
        Shuffler.selectionShuffle(cards2);
        cards=Shuffler.toList(cards2);
    }

    public boolean isEmpty() { return (size==0); }

    public int size() { return size; }

    public Card deal() {
        if (isEmpty()) return null;
        size--;
        return cards.get(size);
    }

    @Override
    public String toString(){
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }
        rtn = rtn + "\n";
        return rtn;
    }
}
