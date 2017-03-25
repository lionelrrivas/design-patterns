package com.lionel.rivas.designpatterns.creational.builder;

public class Client {
    
    public static void main(String[] args) {
        QueryBuildDirector director = new QueryBuildDirector();
        SqlQueryBuilder sqlQueryBuilder = new SqlQueryBuilder();
        
        String from = "employee";
        String where = "employee.name = lionel";
        
        director.buildQuery(from, where, sqlQueryBuilder);
        
        sqlQueryBuilder.getQuery().execute();
        
        MongoDBQueryBuilder mongoDBQueryBuilder = new MongoDBQueryBuilder();
        director.buildQuery(from, where, mongoDBQueryBuilder);
        
        mongoDBQueryBuilder.getQuery().execute();
    }
}