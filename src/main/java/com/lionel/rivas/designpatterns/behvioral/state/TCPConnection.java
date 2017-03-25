package com.lionel.rivas.designpatterns.behvioral.state;

/**
 * This class represents a network connection. It's uses the State Design Pattern to extract the state conditions that 
 * must be considered when the methods that affect its state are invoked. It's state is handled by a {@link TCPConnectionState}.
 * 
 * @author lionelrivas
 */
public class TCPConnection {
    
    private TCPConnectionState connectionState = new ClosedTCPConnectionState(this);
    
    
    public void open() {
        connectionState.open();
    }
    
    public void close() {
        connectionState.close();
    }
    
    public void acknowledge() throws Exception {
        connectionState.acknowledge();
    }
    
    public void setConnectionState(TCPConnectionState connectionState) {
        this.connectionState = connectionState;
    }
}
