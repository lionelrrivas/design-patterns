package com.lionel.rivas.designpatterns.behvioral.state;

/**
 * This interface is a participant in the State Design Pattern. It defines the state contract for a {@link TCPConnection}.
 * It extracts the state from the {@link TCPConnection}, thereby reducing or avoiding the need for complex conditional logic. 
 * 
 * @author lionelrivas
 */
public interface TCPConnectionState {
    
    /**
     * Opens or re-initializes a {@link TCPConnection}.
     * 
     */
    void open();
    
    /**
     * Closes an open {@link TCPConnection}.
     * 
     */
    void close();
    
    /**
     * Acknowledges an open {@link TCPConnection}.
     * 
     * @throws Exception 
     */
    void acknowledge() throws Exception;
}
