package com.lionel.rivas.designpatterns.creational.builder;

public class QueryBuildDirector {
    
    /**
     * Builds a {@link Query}.
     * 
     * @param from the from clause
     * @param where the where clause
     * @param builder the type of {@link QueryBuilder}.
     * @return {@link Query}
     */
    public Query buildQuery(String from, String where, QueryBuilder builder) {
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}
