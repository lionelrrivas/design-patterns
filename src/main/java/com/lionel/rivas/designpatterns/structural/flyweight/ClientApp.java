package com.lionel.rivas.designpatterns.structural.flyweight;

public class ClientApp {
    
    public static void main(String[] args) {
        
        WordProcessor wordProcessor = new WordProcessor();
        
        String text = "Hellllooooo I'mmmmm aaaa wwwwwoooooorrrdddprocccesssorr.";
        int length = text.length();
        
        LetterFactory letterFactory = new LetterFactory();
        
        for (int i = 0; i < length; i++) {
            String value = text.substring(i, i+1);
            wordProcessor.addLetter(letterFactory.createLetter(value));
        }
        
        wordProcessor.printLetters();
    }
}
