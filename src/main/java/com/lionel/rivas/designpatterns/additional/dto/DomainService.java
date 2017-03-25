package com.lionel.rivas.designpatterns.additional.dto;

/**
 * This class is a participant in the Data Transfer Object Design Pattern. It simulates a call to a database
 * to retrieve a domain object and a specific property value is transfered from the {@link DomainObject} onto 
 * a corresponding property on the {@link DomainObjectDTO}. 
 * 
 * @author lionelrivas
 */
public class DomainService {
    
    public DomainObjectDTO getData() {
        
        //simulates a call to a database.
        DomainObject domainObject = getDomainObject();
        DomainObjectDTO domainObjectDTO = new DomainObjectDTO();
        domainObjectDTO.setPublicProperty(domainObject.getPublicProperty());
        return domainObjectDTO;
    }
    
    private DomainObject getDomainObject() {
        return new DomainObject();
    }
}
