package com.company;

import java.util.*;

public class Deck {

    public int size;
    public ArrayList lst;

    public Deck() {
        ArrayList lst = new ArrayList<Card>();
        for(int i=1;i<10;i++)
            lst.add(new Card(Integer.toString(i),"spade",i));
        for(int i=1;i<10;i++)
            lst.add(new Card(Integer.toString(i),"heart",i));
        for(int i=1;i<10;i++)
            lst.add(new Card(Integer.toString(i),"diamond",i));
        for(int i=1;i<10;i++)
            lst.add(new Card(Integer.toString(i),"club",i));
        lst.add((new Card("King", "spade",12));
        lst.add(new Card("Queen", "spade",12));
        lst.add(new Card("Jack", "spade",12));
        lst.add(new Card("Ace", "spade",1));
        lst.add(new Card("King", "heart",12));
        lst.add(new Card("Queen", "heart",12));
        lst.add(new Card("Jack", "heart",12));
        lst.add(new Card("Ace", "heart",1));
        lst.add(new Card("King", "diamond",12));
        lst.add(new Card("Queen", "diamond",12));
        lst.add(new Card("Jack", "diamond",12));
        lst.add(new Card("Ace", "diamond",1));
        lst.add(new Card("King", "club",12));
        lst.add(new Card("Queen", "club",12));
        lst.add(new Card("Jack", "club",12));
        lst.add(new Card("Ace", "club",1));
        this.size=lst.size();
    }

    public void Shuffle() { }

    public boolean isEmpty() { return (size==0); }

    public int size() { return size; }

    public Card deal() {
        size--;
        return (Card)lst.get(size);
    }
}
