package lk.ijse.gdse.desing_patterns.behaviaral.strategy;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class Substract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;

    }
}
