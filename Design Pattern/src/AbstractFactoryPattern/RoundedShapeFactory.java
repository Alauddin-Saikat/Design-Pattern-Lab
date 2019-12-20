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
public class RoundedShapeFactory extends AbstractFactory{

    RoundedShapeFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shape getShape(String shapeType) {
        
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }
        
        return null;
    }
    
}
