package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercise03 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Student Student = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.println("Student: ") ;

        System.out.print("Name: ");
        Student.name = sc.next();

        System.out.print("Note 1: ") ;
        Student.note1 = sc.nextDouble();
        
        System.out.print("Note 2: ") ;
        Student.note2 = sc.nextDouble();

        System.out.print("Note 3: ") ;
        Student.note3 = sc.nextDouble();

        System.out.println();
        System.out.println(Student);

        sc.close();

    }
    
}
