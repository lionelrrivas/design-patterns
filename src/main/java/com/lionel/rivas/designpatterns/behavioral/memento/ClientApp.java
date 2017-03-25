package com.lionel.rivas.designpatterns.behavioral.memento;

import java.awt.geom.Point2D;

/**
 * This class demonstrates the Memento Design Pattern. It simulates a line segment whose coordinates on a graph are
 * calculated, stored in a memento, moved, recalculated, and finally restored from the memento. 
 * 
 * @author lionelrivas
 */
public class ClientApp {

    public static void main(String[] args) {
        ConnectionSolver connectionSolver = new ConnectionSolver(new Point2D.Double(1.0, 1.0), new Point2D.Double(1.0, 5.0));
        ConnectionSolverCareTaker careTaker = new ConnectionSolverCareTaker();
        
        careTaker.saveState(connectionSolver);
        
        connectionSolver.calculateLine();
        
        connectionSolver = new ConnectionSolver(new Point2D.Double(2.0, 2.0), new Point2D.Double(1.0, 5.0));
        
        connectionSolver.calculateLine();
        
        ConnectionSolver connectionSolver2 = new ConnectionSolver(new Point2D.Double(), new Point2D.Double());
        
        careTaker.restoreState(connectionSolver2);
        
        connectionSolver2.calculateLine();
        
        careTaker.restoreState(connectionSolver);
        
        connectionSolver.calculateLine();
    }
}