package com.lionel.rivas.designpatterns.creational.builder;

public class SqlQueryBuilder implements QueryBuilder {

    private final SqlQuery query = new SqlQuery();
    
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