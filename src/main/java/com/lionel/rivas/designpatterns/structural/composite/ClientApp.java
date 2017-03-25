package com.lionel.rivas.designpatterns.structural.composite;

public class ClientApp {
    
    public static void main(String[] args) {
        GraphicItemGroup graphicItemGroup = new GraphicItemGroup();
        graphicItemGroup.getGraphics().add(new Line());
        graphicItemGroup.getGraphics().add(new Rectangle());
        graphicItemGroup.draw();
        
        GraphicItemGroup graphicItemGroup2 = new GraphicItemGroup();
        graphicItemGroup2.getGraphics().add(graphicItemGroup);
        
        graphicItemGroup2.getGraphics().add(new Rectangle());
        
        graphicItemGroup2.draw();
    }
}
