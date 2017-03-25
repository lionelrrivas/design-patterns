package com.lionel.rivas.designpatterns.creational.builder;

/**
 * This class implements the {@link Query} interface for a traditional 
 * SQL query. 
 * 
 * @author lionelrivas
 */
public class SqlQuery implements Query {

    private String fromClause;
    
    private String whereClause;
    
    @Override
    public void execute() {
        System.out.println("Executing " + getClass().getSimpleName() + ". from = " + fromClause + ", where = " + whereClause);
    }

    public void setFromClause(String fromClause) {
        this.fromClause = fromClause;
    }

    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }   
}