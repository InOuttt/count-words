package com.inout.csg.interfaces.countwords;

public interface ICountwords {
    int StartWith(String[] words, String letter);
    String[] GetMoreThan(String[] words, int min);
}
