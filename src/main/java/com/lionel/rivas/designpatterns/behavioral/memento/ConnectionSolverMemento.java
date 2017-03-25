package com.lionel.rivas.designpatterns.behavioral.memento;

import java.awt.geom.Point2D;

/**
 *
 * This class is a participant in the Memento Design Pattern. It is responsible for maintaining the internal state
 * of a {@link ConnectionSolver}. 
 * 
 * @author lionelrivas
 */
public class ConnectionSolverMemento {
    
    private final Point2D pointOne;
    private final Point2D pointTwo;

    public ConnectionSolverMemento(Point2D pointOne, Point2D pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Point2D getPointOne() {
        return pointOne;
    }

    public Point2D getPointTwo() {
        return pointTwo;
    }
    
    
}
