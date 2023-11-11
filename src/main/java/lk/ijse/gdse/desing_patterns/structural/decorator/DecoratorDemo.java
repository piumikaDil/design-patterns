package lk.ijse.gdse.desing_patterns.structural.decorator;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redSapeCircle = new RedShapeDecorator(new Circle());
        Shape redSapeRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redSapeCircle.draw();
        redSapeRectangle.draw();
    }
}
