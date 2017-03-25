package com.lionel.rivas.designpatterns.behvioral.state;

/**
 *
 * This class is a demonstration of the State Design Pattern. The state of the {@link TCPConnection} is extracted into 
 * implementations of {@link TCPConnectionState}.
 * 
 * @author lionelrivas
 */
public class ClientApp {
    
    public static void main(String[] args) throws Exception {
        TCPConnection connection = new TCPConnection();
        connection.open();
        
        connection.acknowledge();
        
        connection.close();
        
        //Expect exception to be thrown here. 
        connection.acknowledge();
    }
}
