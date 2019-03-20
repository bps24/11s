package com.company;

public class CardTester {

    public static void main(String[] args) {
        Card a = new Card("Nine", "spade", 9);
        Card b = new Card("Eight", "heart", 8);
        Card c = new Card("Three", "club", 3);

        System.out.println(a.suit());
        System.out.println(a.rank());
        System.out.println(a.pointValue());
        System.out.println(a.matches(b));
        System.out.println(a.toString());

        System.out.println(b.suit());
        System.out.println(b.rank());
        System.out.println(b.pointValue());
        System.out.println(b.matches(c));
        System.out.println(b.toString());

        System.out.println(c.suit());
        System.out.println(c.rank());
        System.out.println(c.pointValue());
        System.out.println(c.matches(a));
        System.out.println(c.toString());
    }
}
