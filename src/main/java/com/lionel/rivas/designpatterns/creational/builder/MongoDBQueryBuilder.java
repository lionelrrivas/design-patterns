package com.lionel.rivas.designpatterns.creational.builder;

public class MongoDBQueryBuilder implements QueryBuilder {

    private final MongoDBQuery query = new MongoDBQuery();
    
    @Override
    public void from(String from) {
        this.query.setFromClause(from);
    }

    @Override
    public void where(String where) {
        this.query.setWhereClause(where);
    }

    @Override
    public Query getQuery() {
        return query;
    }
    
}
