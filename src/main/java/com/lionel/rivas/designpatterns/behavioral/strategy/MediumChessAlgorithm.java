package com.lionel.rivas.designpatterns.behavioral.strategy;

/**
 *
 * @author lionelrivas
 */
public class MediumChessAlgorithm implements ChessAlgorithm {

    @Override
    public int calculateNextStep() {
        return 2;
    }
    
}
