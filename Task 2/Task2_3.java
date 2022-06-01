import java.util.Scanner;

public class Task2_3 {
    public Task2_3 () {
        //Arithmetic expressions    
        float l,v;
        double div;
        Scanner s = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.print("Give your length (in meters):");
        l = s.nextFloat();
        System.out.println(" ");
        System.out.print("Give your weight (in whole kg):");
        v = s.nextFloat();
        System.out.println("  ");
        div = (double)v / (l*l);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Your BMI is:" + div);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("BMI CATEGORIES:");
        System.out.println("Starvation: less than 15");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Ideal: 18.5 - 25");
        System.out.println("Overweight: Between 25 and 30");
        System.out.println("Morbidly Obese: Greater than 40");
        System.out.println("---------------------------------");

    }
}