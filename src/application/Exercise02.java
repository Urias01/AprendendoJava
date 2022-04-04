package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employment;

public class Exercise02 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employment Employment = new Employment();

        System.out.print("Name: ") ;
        Employment.name = sc.next();

        System.out.print("GlossSalary: ");
        Employment.glossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        Employment.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + Employment);
        
        System.out.println("Which percentage to increase salary? ");
        Employment.percentage = sc.nextDouble();
        
        System.out.println();
        System.out.println("Employee: " + Employment);

        sc.close();

    }
    
}
