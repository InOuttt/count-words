package com.inout.csg.services.countwords;

import java.util.ArrayList;
import java.util.List;

import com.inout.csg.interfaces.countwords.ICountwords;

public class Countwords implements ICountwords {

    String[] words;

    // init
    public Countwords(String[] w) {
        this.words = w;
    }

    /**
     * Count word that start with a letter
     * @param words list of words
     * @param letter the letter to check
     * @return int total words that start wit letter
     */
    public int StartWith(String letter) {
        int ret = 0;
        letter = letter.toLowerCase();
        for (String word : words) {
            if (word.toLowerCase().startsWith(letter)) {
                ret++;
            }
        }

        return ret;
    }

     /**
     * Count word that consist more than min
     * @param words list of words
     * @param min int minimum letter in the word
     * @return String[] words that have more than min
     */
    public String[] GetMoreThan(int min) {
        List<String> ret = new ArrayList<String>();
        for (String word : words) {
            if (word.length() > min) {
                ret.add(word);
            }
        }

        String[] resp = ret.toArray( new String[ ret.size() ] );
        return resp;
    }
}
