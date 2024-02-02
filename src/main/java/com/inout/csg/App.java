package com.inout.csg;

import com.inout.csg.interfaces.countwords.ICountwords;
import com.inout.csg.services.countwords.Countwords;

/**
 * Main Class!
 */
public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // start processing the words
        ICountwords cw = new Countwords(args);
        System.out.println("---- START ----");
        System.out.println("Processing data");
       
        System.out.println("Total words start with M is :" + Integer.toString(cw.StartWith("M")));
       
        String[] rgmt = cw.GetMoreThan(5);
        if (rgmt.length > 0 ){
            System.out.println("Word with more than 5 char is :");
            for(String w : rgmt) {
                System.out.println(w);
            }
        } else {
            System.out.println("No Word with more than 5 char.");
        }
        // scan.close();

        // add some words to separate 
        System.out.println("---- END ----");
        System.out.println("Thank You!");
    }
}
