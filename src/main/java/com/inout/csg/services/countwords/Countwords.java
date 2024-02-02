package com.inout.csg.services.countwords;

import java.util.ArrayList;
import java.util.List;

import com.inout.csg.interfaces.countwords.ICountwords;

public class Countwords implements ICountwords {
    public int StartWith(String[] words, String letter) {
        int ret = 0;
        letter = letter.toLowerCase();
        for (String word : words) {
            if (word.toLowerCase().startsWith(letter)) {
                ret++;
            }
        }

        return ret;
    }

    public String[] GetMoreThan(String[] words, int min) {
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
