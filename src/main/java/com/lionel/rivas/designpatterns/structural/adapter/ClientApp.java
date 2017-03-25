package com.lionel.rivas.designpatterns.structural.adapter;

public class ClientApp {
    
    public static void main(String[] args) {
        ClientApp clientApp = new ClientApp();
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter legacyRectangleAdapter = new LegacyRectangleAdapter(legacyRectangle);
        clientApp.determineSize(legacyRectangleAdapter);;
    }
    
    /**
     * Determines the size of a {@link Rectangle}. 
     * 
     * @param rectangle the rectangle to determine the size of. 
     */
    public void determineSize(Rectangle rectangle) {
        System.out.println("Rectangle size is " + rectangle.determinSize());
    }
}
