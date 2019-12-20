/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Pattern;

/**
 *
 * @author User
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        
        Shapefactory shapeFactory = new Shapefactory();
        
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        
        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
        
        
    }
}
