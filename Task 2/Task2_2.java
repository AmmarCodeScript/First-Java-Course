
import java.util.Scanner;
public class Task2_2 {
    public Task2_2(){
       //Reading data from the keyboard
        Scanner scan = new Scanner (System.in);
        System.out.println("Ge ett heltal");
        int heltal= scan.nextInt ();
        System.out.println("Ge ett realtal");
        double realtal = scan.nextDouble();
        System.out.println("Ge ett tecken");
        scan.nextLine();
        String tecken = scan.nextLine();
    }
    
}
