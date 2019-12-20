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
public class RedShapeDecorator extends ShapeDecorator{
    
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    public void draw(){
        decoratedShape.draw();
        redborder(decoratedShape);
    }
    
    public void redborder(Shape decoratedShape){
        System.out.println("Border color : RED");
    }
}
