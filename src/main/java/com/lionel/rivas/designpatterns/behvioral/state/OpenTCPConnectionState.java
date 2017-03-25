package com.lionel.rivas.designpatterns.behvioral.state;

/**
 *
 * This class represents a open network connection. It is an implementation of the {@link TCPConnectionState} 
 * interface.
 * 
 * @author lionelrivas
 */
public class OpenTCPConnectionState implements TCPConnectionState {
    
    private final TCPConnection tcpConnection;

    public OpenTCPConnectionState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("open(): re-initializing connection.");
    }

    @Override
    public void close() {
        System.out.println("close(): Closing connection.");
        tcpConnection.setConnectionState(new ClosedTCPConnectionState(tcpConnection));
    }

    @Override
    public void acknowledge() throws Exception {
        System.out.println("acknowledge(): Acknowledging connection.");
    }   
}