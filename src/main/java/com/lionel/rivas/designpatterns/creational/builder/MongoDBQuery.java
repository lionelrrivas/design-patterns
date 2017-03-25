package com.lionel.rivas.designpatterns.creational.builder;

/**
 * This class is a {@link Query} implementation that represents a 
 * query for a MongoDB database. 
 * 
 * @author lionelrivas
 */
public class MongoDBQuery implements Query {

    private String fromClause;
    
    private String whereClause;
    
    @Override
    public void execute() {
        System.out.println("Executing " + getClass().getSimpleName() 
                + ". from = " + fromClause + ", where = " + whereClause);
    }

    public void setFromClause(String fromClause) {
        this.fromClause = fromClause;
    }

    public void setWhereClause(String whereClause) {
        this.whereClause = whereClause;
    }   
    
}
