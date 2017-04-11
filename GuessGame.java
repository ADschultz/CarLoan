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
public class GuessGame  {
    // Number that the user is trying to guess
    int num;
    // Number user has guessed
    int guess;
    // Number of tries
    int tries;
    
    public int[] a = new int[500];
    // Generate a new number for the user to guess
    public void generateNum() {        
        Random a = new Random();
        int b = a.nextInt(1000) + 1;
        num = b;
        tries = 0;
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
        
        tries = tries + 1;
        return tries;
    }

    
    

    public void setTries(int tries) 
    {
        this.tries = tries;
    }
    

   
    
}
