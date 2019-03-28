package com.company

import java.util.List;
import java.util.ArrayList;

public class ElevensBoard {

    private static final int BOARD_SIZE = 9;
    private static final String[] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    private static final String[] SUITS = {"spades", "hearts", "diamonds", "clubs"};
    private static final int[] POINT_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
    private Card[] cards;
    private Deck deck;
    private static final boolean I_AM_DEBUGGING = false;

    public ElevensBoard() {
        cards = new Card[BOARD_SIZE];
        deck = new Deck(RANKS, SUITS, POINT_VALUES);
        if (I_AM_DEBUGGING) {
            System.out.println(deck);
            System.out.println("----------");
        }
        dealMyCards();
    }

    public void newGame() {
        deck.shuffle();
        dealMyCards();
    }

    /**
     * Accesses the size of the board.
     * Note that this is not the number of cards it contains,
     * which will be smaller near the end of a winning game.
     * @return the size of the board
     */
    public int size() { return cards.length; }

    public boolean isEmpty()
    {
        for (int k = 0; k < cards.length; k++)
            if (cards[k] != null)
                return false;
        return true;
    }

    public void deal(int k) { cards[k] = deck.deal(); }

    public int deckSize() { return deck.size(); }

    public Card cardAt(int k) { return cards[k]; }

    public void replaceSelectedCards(List<Integer> selectedCards)
    {
        for (Integer k : selectedCards)
            deal(k.intValue());
    }


    public List<Integer> cardIndexes()
    {
        List<Integer> selected = new ArrayList<Integer>();
        for (int k = 0; k < cards.length; k++)
            if (cards[k] != null)
                selected.add(new Integer(k));
        return selected;
    }

    /**
     * Generates and returns a string representation of this board.
     * @return the string version of this board.
     */
    public String toString() {
        String s = "";
        for (int k = 0; k < cards.length; k++) {
            s = s + k + ": " + cards[k] + "\n";
        }
        return s;
    }

    /**
     * Determine whether or not the game has been won,
     * i.e. neither the board nor the deck has any more cards.
     * @return true when the current game has been won;
     *         false otherwise.
     */
    public boolean gameIsWon()
    {
        if (deck.isEmpty())
        {
            for (Card c : cards)
                if (c != null)
                    return false;
            return true;
        }
        return false;
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    public boolean isLegal(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    public boolean anotherPlayIsPossible() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    }


    /**
     * Deal cards to this board to start the game.
     */
    private void dealMyCards() {
        for (int k = 0; k < cards.length; k++) {
            cards[k] = deck.deal();
        }
    }

    private boolean containsPairSum11(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    }

    private boolean containsJQK(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    }

    public static void printCards(ElevensBoard board)
    {
        List <Integer> cIndexes = board.cardIndexes();
        for(int i=0;i<cIndexes.size();i++)
            System.out.print(board.cardAt(cIndexes.get(i)));
    }

}