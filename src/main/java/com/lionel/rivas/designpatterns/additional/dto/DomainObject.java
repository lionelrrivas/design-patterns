package com.lionel.rivas.designpatterns.additional.dto;

/**
 * This class represents a domain object. 
 * 
 * @author lionelrivas
 */
public class DomainObject {
    
    private String publicProperty;
    
    private String privateProperty;

    public String getPublicProperty() {
        return publicProperty;
    }

    public void setPublicProperty(String publicProperty) {
        this.publicProperty = publicProperty;
    }

    public String getPrivateProperty() {
        return privateProperty;
    }

    public void setPrivateProperty(String privateProperty) {
        this.privateProperty = privateProperty;
    }
}