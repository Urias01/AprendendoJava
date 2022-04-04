package entities;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;
    public double media;
    public double foul;

    public double media() {
        media = note1 + note2 + note3 ;
        return media ;
    }

    public double foul(){
        foul = 100.00 - media() ;
        return foul ;
    }
    
    public String toString(){
        if(media() >= 60.00){
            System.out.println("\n\nFinal Media: " + String.format("%.2f", media()));
            System.out.println("Pass");
        }else{
            System.out.println("\n\nFinal Media: " + String.format("%.2f", media()));
            System.out.println("Missing: " + String.format("%.2f", foul()));
            System.out.println("Failed");
        }
        return "\n\nName: "
            + name 
            + "\nNota 1: "
            + note1 
            + "\nNota 2: "
            + note2 
            + "\nNota 3: "
            + note3 ;
    
    }

}
