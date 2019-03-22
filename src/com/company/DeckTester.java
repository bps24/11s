package com.company;

import java.util.Arrays;

public class DeckTester {

    public static void main(String[] args) {
        String [] a1 = new String[]{"a", "b", "c","d"};
        String [] a2 = new String[]{"red", "blue", "green"};
        int [] a3 = new int[]{1,2,3,4,5,6,7,8};

        String [] b1 = new String[]{"a", "b", "c","d"};
        String [] b2 = new String[]{"red"};
        int [] b3 = new int[]{1,2,3,4};

        String [] c1 = new String[]{"a", "b", "c","d"};
        String [] c2 = new String[]{"red", "blue"};
        int [] c3 = new int[]{1,2,3,4};

        Deck a = new Deck(a1,a2,a3);
        Deck b = new Deck(b1,b2,b3);
        Deck c = new Deck(c1,c2,c3);

        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);

        System.out.println(Arrays.toString(a3));
        Shuffler.perfectShuffle(a3);
        System.out.println(Arrays.toString(a3));




    }
}