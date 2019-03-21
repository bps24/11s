package com.company;

import java.util.*;

public class Deck {

    private int size;
    private ArrayList <Card> cards;

    public Deck( String [] ranks, String [] suits, int [] pointValues) throws NullPointerException
    {
        cards = new ArrayList<>();
        for(int rank=0;rank<ranks.length;rank++)
            for(int suit=0;suit<suits.length;suit++)
                cards.add(new Card(ranks[rank],suits[suit],pointValues[rank]));
        this.size=cards.size();
    }

    public void Shuffle() { }

    public boolean isEmpty() { return (size==0); }

    public int size() { return size; }

    public Card deal() {
        size--;
        return cards.get(size);
    }

    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--)
        {
            rtn += cards.get(k);
            if (k != 0)
                rtn += ", ";
            if ((size - k) % 2 == 0)
                rtn += "\n";
        }

        rtn +="\nDealt cards: \n";

        for (int k = cards.size() - 1; k >= size; k--)
        {
            rtn += cards.get(k);
            if (k != size)
                rtn += ", ";
            if ((k - cards.size()) % 2 == 0)
                rtn += "\n";

        }

        return rtn + "\n";
    }
}
