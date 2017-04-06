/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Random;

/**
 *
 * @author mochan
 */
public class GuessGame {
    // Number that the user is trying to guess
    int num;
    // Number user has guessed
    int guess;
    // Number of tries
    int tries;
    
    // Generate a new number for the user to guess
    public void generateNum() {        
        Random a = new Random();
        int b = a.nextInt(1000) + 1;
        num = b;
    }
    
    // Getters and setters
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getTries() 
    {
       tries = 1;
       for(int i = 0; i < tries; i++)
       {
           i = tries + 1;
           i = tries;
       }
       return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    
    
}
