package com.lionel.rivas.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrates the Flyweight Design pattern. It simulates the use
 * of sharing to support large numbers of fine-grained object in an efficient 
 * manner. 
 * 
 * @author lionelrivas
 */
public class LetterFactory {
    
    private final Map<String, Letter> letterMap = new HashMap<>();
    
    public Letter createLetter(String key) {
        Letter letter = letterMap.get(key);
        if (letter == null) {
            letter = new Letter(key);
            letterMap.put(key, letter);
        }
        return letter;
    }
}
