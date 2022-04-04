package entities;

import java.lang.Math;

public class Rectangle {
    

    public double width ;
    public double height ;
    public double area ;
    public double perimeter ;
    public double diagonal ;


    public double area(){
        return area = width * height ;
    }

    public double perimeter(){
        return perimeter = 2.0 * (height  + width);
    }

    public double diagonal(){
        return diagonal = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
    }
}
