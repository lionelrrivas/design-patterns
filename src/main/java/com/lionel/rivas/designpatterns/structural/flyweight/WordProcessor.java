package com.lionel.rivas.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * This class simulates a word processor. 
 * 
 * @author lionelrivas
 */
public class WordProcessor {
    
    private final List<Letter> letters = new ArrayList<>();
    
    public void addLetter(Letter letter) {
        this.letters.add(letter);
    }
    
    public void printLetters() {
        letters.stream().forEach((letter) -> {
            System.out.print(letter.getValue());
        });
    }
}
