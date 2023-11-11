package lk.ijse.gdse.desing_patterns.structural.decorator;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
