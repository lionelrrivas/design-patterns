package com.lionel.rivas.designpatterns.behavioral.memento;

import java.awt.geom.Point2D;

/**
 * This class represents a line that connects to objects in a diagram. 
 * 
 * @author lionelrivas
 */
public class ConnectionSolver {
    
    private Point2D pointOne;
    
    private Point2D pointTwo;
    
    public ConnectionSolver(Point2D pointOne, Point2D pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }
    
    /**
     * Calculates the line coordinates. 
     */
    public void calculateLine() {
        System.out.println("Calculating line between " + pointOne + " and " + pointTwo);
    }
    
    /**
     * Creates a Memento.
     * @return 
     */
    public ConnectionSolverMemento createMemento() {
        return new ConnectionSolverMemento(pointOne, pointTwo);
    }
    
    /**
     * Sets the Memento for this {@link ConnectionSolver}.
     * 
     * @param connectionSolverMemento 
     */
    public void setMemento(ConnectionSolverMemento connectionSolverMemento) {
        this.pointOne = connectionSolverMemento.getPointOne();
        this.pointTwo = connectionSolverMemento.getPointTwo();
    }
}
