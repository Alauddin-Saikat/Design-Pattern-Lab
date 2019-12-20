/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author User
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        
        return null;
    }
    
}
