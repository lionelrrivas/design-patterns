package com.lionel.rivas.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup implements Graphic {

    private final List<Graphic> graphicItems = new ArrayList<>();
    
    @Override
    public void draw() {
        graphicItems.stream().forEach((graphic) -> {
            graphic.draw();
        });
    }
    
    public List<Graphic> getGraphics() {
        return graphicItems;
    }
    
}
