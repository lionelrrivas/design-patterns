package com.lionel.rivas.designpatterns.behavioral.memento;

/**
 * This class is a participant in the Memento Design Pattern. It is responsible for shielding the Memento from direct 
 * access by clients. 
 * 
 * @author lionelrivas
 */
public class ConnectionSolverCareTaker {
    
    private ConnectionSolverMemento connectionSolverMemento;
    
    public void saveState(ConnectionSolver connectionSolver) {
        connectionSolverMemento = connectionSolver.createMemento();
    }
    
    public void restoreState(ConnectionSolver connectionSolver) {
        connectionSolver.setMemento(connectionSolverMemento);
    }
}
