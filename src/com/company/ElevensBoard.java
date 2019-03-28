package com.company;

import java.util.List;
import java.util.ArrayList;

public class ElevensBoard extends Board {

    private static final int BOARD_SIZE = 9;
    private static final String[] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    private static final String[] SUITS = {"spades", "hearts", "diamonds", "clubs"};
    private static final int[] POINT_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
    private static final boolean I_AM_DEBUGGING = false;

    public ElevensBoard() { super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES); }

    @Override
    public boolean isLegal(List<Integer> selectedCards) {
        if (selectedCards.size() == 2)
            return containsPairSum11(selectedCards);
        if (selectedCards.size() == 3)
            return containsJQK(selectedCards);
        return false;
    }

    @Override
    public boolean anotherPlayIsPossible() {
        List<Integer> cIndexes = cardIndexes();
        return containsPairSum11(cIndexes) || containsJQK(cIndexes);
    }

    private boolean containsPairSum11(List<Integer> selectedCards) {
        for (int sk1 = 0; sk1 < selectedCards.size(); sk1++)
            for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++)
                if (cardAt(selectedCards.get(sk1)).pointValue() + cardAt(selectedCards.get(sk2)).pointValue() == 11)
                    return true;
        return false;
    }

    private boolean containsJQK(List<Integer> selectedCards) {
        boolean foundJack = false;
        boolean foundQueen = false;
        boolean foundKing = false;
        for (Integer k : selectedCards)
        {
            if (cardAt(k).rank().equals("jack"))
                foundJack = true;
            else if (cardAt(k).rank().equals("queen"))
                foundQueen = true;
            else if (cardAt(k).rank().equals("king"))
                foundKing = true;
        }
        return foundJack && foundQueen && foundKing;
    }
}