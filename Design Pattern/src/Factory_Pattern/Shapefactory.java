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
public class Shapefactory {

    //use getShape method to get object of typeShape
    

    Shape getShape(String shapeType) {
        if (shapeType == null )
            return null;
        
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        
        
        return null;
    }
    
}
