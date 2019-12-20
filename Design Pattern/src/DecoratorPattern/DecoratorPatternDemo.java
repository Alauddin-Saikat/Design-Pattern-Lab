/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author User
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        
        Shape circle = new Circle();
        Shape redcircle = new RedShapeDecorator(new Circle());
        circle.draw();
        redcircle.draw();
        
        Shape rectangle = new Rectangle();
        Shape greenrectangle = new GreenShapeDecorator(new Rectangle());
        //rectangle.draw();
        greenrectangle.draw();
        
    }
    
}
