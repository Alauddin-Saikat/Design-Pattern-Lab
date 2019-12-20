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
public class GreenShapeDecorator extends ShapeDecorator{
    
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    public void draw(){
        decoratedShape.draw();
        greenborder(decoratedShape);
    }
    
    public void greenborder(Shape decoratedShape){
        System.out.println("Border color : Green");
    }
}
