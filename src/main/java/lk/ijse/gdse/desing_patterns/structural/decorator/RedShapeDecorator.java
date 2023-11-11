package lk.ijse.gdse.desing_patterns.structural.decorator;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedShape(decoratorShape);
    }

    private void setRedShape(Shape redShape){
        System.out.println("Set Red Border");
    }
}
