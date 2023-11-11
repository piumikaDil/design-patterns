package lk.ijse.gdse.desing_patterns.behaviaral.strategy;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("Add : "+context.executeOperation(5,2));

        Context context1 = new Context(new Substract());
        System.out.println("Sub : "+context1.executeOperation(5,2));

        Context context2 = new Context(new Multplyoperation());
        System.out.println("Multy : "+context2.executeOperation(5,2));
    }
}
