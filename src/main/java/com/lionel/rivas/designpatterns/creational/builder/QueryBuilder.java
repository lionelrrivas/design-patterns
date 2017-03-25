package com.lionel.rivas.designpatterns.creational.builder;

/**
 * This interface defines the contract for building the parts of a {@link Query}.
 * 
 */
public interface QueryBuilder {
    
    /**
     * Sets the from clause of a {@link Query}.
     * @param from 
     */
    public void from(String from);
    
    /**
     * Sets the where clause of a {@link Query}.
     * @param where 
     */
    public void where(String where);
    
    /**
     * Gets a {@link Query}.
     * 
     * @return {@link Query}
     */
    public Query getQuery();
}
