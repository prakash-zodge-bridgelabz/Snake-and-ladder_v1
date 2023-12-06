package com.bridgelabz;

public class Snake_And_Ladder {
    // Global variables
    public static final int noPlay = 0; //UC 3
    public static final int ladder = 1;     //UC 3
    public static final int snake = 2; //UC 3
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        //Snake and Ladder game played with single player at start position 0
        int start = 0; //UC 1

        //UC2
        // Roll the dice
        int diceRoll = (int) (Math.random() * 6) + 1;
        //UC 4 starts
        do{
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
        }while(start<100);
        //UC 4 ends
    }
}
