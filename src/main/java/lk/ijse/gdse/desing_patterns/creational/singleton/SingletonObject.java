package lk.ijse.gdse.desing_patterns.creational.singleton;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject(){

    }

    public static SingletonObject getInstance(){
        return  instance;
    }

    public  void showMessage(){
        System.out.println("Hello Singleton DP!");
    }
}
