package lk.ijse.gdse.desing_patterns.structural.facade;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.callCircle();
        shapeMaker.callRectangle();
        shapeMaker.callSquare();
    }
}
