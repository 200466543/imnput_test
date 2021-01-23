package com.company;

public class SkiTest {

    public int depth = 0;

    static boolean timeToSki(int depth){
        if(depth>30){
            return true;
        }
        else{
            return false;
        }

    }

    static void starPattern(int length){
        for (int i = 0; i <= length-1; i++) {
            for(int a = 0; a <= i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
