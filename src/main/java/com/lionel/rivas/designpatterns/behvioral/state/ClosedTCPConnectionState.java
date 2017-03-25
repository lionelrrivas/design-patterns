package com.lionel.rivas.designpatterns.behvioral.state;

/**
 *
 * This class represents a closed network connection. It is an implementation of the {@link TCPConnectionState} 
 * interface.
 * 
 * @author lionelrivas
 */
public class ClosedTCPConnectionState implements TCPConnectionState {
    
    private final TCPConnection tcpConnection;

    public ClosedTCPConnectionState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void open() {
        System.out.println("open(): Opening connection.");
        tcpConnection.setConnectionState(new OpenTCPConnectionState(tcpConnection));
    }

    @Override
    public void close() {
        System.out.println("close(): Connection is alread closed.");
    }

    @Override
    public void acknowledge() throws Exception {
        throw new IllegalStateException("Invalid usage of connection.");
    }
    
}
