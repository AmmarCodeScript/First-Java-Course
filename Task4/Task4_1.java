import java.util.Scanner;
import java.util.Random;

public class Task4_1 {
    
    public  Task4_1() {
    //Repetition rates
        Scanner kbd = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("GISSNINGSSPELET VERSION 1.1\n");

        System.out.println("Instruktioner:");
        System.out.println("---------------------------------");
        System.out.println("Gissa ett tal mellan 1 och M. Välj svårighetsgrad genom att ange ett värde för M:");
        double m = kbd.nextFloat();
        System.out.println("Spelet börjar!\n");
        System.out.println("Gissa ett tal mellan 1 och" + m);



        //Variables

        Random randomNumber = new Random();
        double computerValue =Math.floor (Math.random()*m)+1;
        int numberOfTries = 0;
        int success = 0;
        int guess = 0;

        //Logic and While Loop

        while (success ==0)
        {

            guess = kbd.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > m){
                System.out.println("Invalid input");
            }

            else if (guess == computerValue){
                success++;
                System.out.println("Grattis! Du hittade rätt svar! Du behövde " + numberOfTries + " gissningar: " );

            }
            else if (guess < computerValue){
                System.out.println("Högre!");
            }
            else if (guess > computerValue){
                System.out.println("Lägre!");
            }
        }
    }

}
