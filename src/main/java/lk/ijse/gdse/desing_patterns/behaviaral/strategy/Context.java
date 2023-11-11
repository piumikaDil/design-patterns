package lk.ijse.gdse.desing_patterns.behaviaral.strategy;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public int executeOperation(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
