package com.inout.csg;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.inout.csg.interfaces.countwords.ICountwords;
import com.inout.csg.services.countwords.Countwords;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words is going to be?");
        boolean isInt = true;
        int leng = 0;
        while (isInt)
        {
            try
            {
                leng = scan.nextInt();
                isInt = false;
            }
            catch (InputMismatchException exception)
            {
                System.out.println("Integers only, please.");
                scan.nextLine();
            }
        }


        System.out.println("Input the words");
        String[] words = new String[leng];
        for (int i=0;i<leng;i++) {
            String word = scan.next();
            words[i] = word;
        }
        System.out.println("Processing data");

        ICountwords cw = new Countwords();
       
        System.out.println("Total words start with M is :" + Integer.toString(cw.StartWith(words, "M")));
       
        String[] rgmt = cw.GetMoreThan(words, 5);
        if (rgmt.length > 0 ){
            System.out.println("Word with more than 5 char is :");
            for(String w : rgmt) {
                System.out.println(w);
            }
        } else {
            System.out.println("No Word with more than 5 char.");
        }
        scan.close();

        System.out.println("---- END ----");
        System.out.println("Thank You!");
    }
}
