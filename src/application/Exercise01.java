package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercise01 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        Rectangle Rectangle = new Rectangle() ;

        System.out.println("Enter rectangle width and height: ");

        System.out.print("Width: ");
        Rectangle.width = sc.nextDouble() ;
        
        System.out.print("Height: ");
        Rectangle.height = sc.nextDouble() ;

        System.out.println();
        System.out.println("Area = " + Rectangle.area());
        
        System.out.println("Perimeter = " + Rectangle.perimeter());

        System.out.println("Diagonal = " + Rectangle.diagonal());
        System.out.println();

        sc.close();
    }
    
}
