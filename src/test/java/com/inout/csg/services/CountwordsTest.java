package com.inout.csg.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.inout.csg.services.countwords.Countwords;

class CountwordsTest {
    String[] words = new String[]{"Cool", "Apple", "banana", "asia"};
    Countwords cw = new Countwords(words);

    @Test
    void StartWitha_Return2() {
        // matching A and a
        assertEquals(2, cw.StartWith("a"));
    }
    void StartWithz_Return0() {
        // no match
        assertEquals(0, cw.StartWith("z"));
    }
    
    @Test
    void Given4Words_WhenGetMoreThan4_Return2() {
        String[] expected = new String[]{"Apple", "banana"};
        // matching 2 word
        Assertions.assertArrayEquals(expected, cw.GetMoreThan(4));
    }
    @Test
    void Given4Words_WhenGetMoreThan10_Return0() {
        String[] expected = new String[]{};
        // no match
        Assertions.assertArrayEquals(expected, cw.GetMoreThan(10));
    }
    @Test
    void Given4Words_WhenGetMoreThan0_Return4() {
        // match all
        Assertions.assertArrayEquals(words, cw.GetMoreThan(0));
    }
}
