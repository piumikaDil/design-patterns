package lk.ijse.gdse.desing_patterns.structural.facade;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class ShapeMaker {
    private  Shape circle;
    private  Shape rectangle;
    private  Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void callCircle(){
        circle.draw();
    }

    public void callRectangle(){
        rectangle.draw();
    }

    public void callSquare(){
        square.draw();
    }
}
