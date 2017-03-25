package com.lionel.rivas.designpatterns.creational.prototype;

/**
 * This class is a class of the GUI framework.
 * 
 * @author lionelrivas
 */
public class GraphicTool {
    
    private Graphic prototype;
    
    public GraphicTool(Graphic graphic) {
        this.prototype = graphic;
    }
    
    public Graphic createGraphic() {
        return prototype.clone();
    }
    
    public void setProtoType(Graphic prototype) {
        this.prototype = prototype;
    }   
}