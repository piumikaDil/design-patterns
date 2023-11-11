package lk.ijse.gdse.desing_patterns.creational.singleton;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject object2 = SingletonObject.getInstance();
        object2.showMessage();
    }
}
