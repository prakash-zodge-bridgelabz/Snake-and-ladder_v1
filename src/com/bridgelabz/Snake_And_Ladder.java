package com.bridgelabz;

import java.util.Random;

public class Snake_And_Ladder {
    // Global variables
    public static final int noPlay = 0; //UC 3
    public static final int ladder = 1;     //UC 3
    public static final int snake = 2; //UC 3
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        //Snake and Ladder game played with single player at start position 0
        int start1 = 0; //UC 1
        int start2 = 0; //UC 7
        int c1 = 0;      // UC 6
        int c2 = 0;        //UC 7
        c1 = whoWins(start1,c1);
        c2 = whoWins(start2,c2);
        System.out.println("throws taken by player1 :" + c1);
        System.out.println("throws taken by player1 :" + c2);
        if(c1>c2){
            System.out.println("Player 2 wins");
        }else{
            System.out.println("Player 1 wins");
        }
    }
    public static int whoWins(int start, int c){
        //UC 4 starts
        do{
            //UC2
            // Roll the dice
            int diceRoll = (int) (Math.random() * 6) + 1;
            // UC 3 starts
            int options = (int)(Math.random()*3);
            switch(options){
                case noPlay :
                    break;
                case ladder:
                    start += diceRoll;
                    if(start>100){
                        start -=diceRoll;//UC5
                    }
                    break;
                case snake:
                    start -= diceRoll;
                    if(start < 0){//UC4
                        start = 0;
                    }
                    break;
            }//UC 3 ends
            c++; //UC 6

        }while(start<100);
        //UC 4 ends
        return c;
    }
}
