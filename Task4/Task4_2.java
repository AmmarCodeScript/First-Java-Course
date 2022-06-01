import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Task4_2 {
    public Task4_2(){
// Arrays and repetition sets
        Scanner scan = new Scanner(System.in);
        boolean feltall = false;
        System.out.print("Hur manga tall?");
        System.out.print("\t");

        while (feltall == false){
            int one = scan.nextInt();
            double summa = 0;
            double array[] = new double[one];
            if (5<= one && one <= 10) {
                // System.out.println("ange"+" " +one+ ""+" realtall");

                for (int i = 0; i < array.length; i++) {
                    System.out.print("Tall" + " " + (i + 1) + ":");
                    System.out.print("\t");
                    array[i] = scan.nextDouble();
                    summa = summa + array[i];
                }
                // System.out.println("arrayn i normal ordning");
                //System.out.print(array[i]);
                //System.out.println("Tall\t"+(i+1)+":");}
                //System.out.println((Arrays.toString(array)+"\n"));
                //System.out.println(Arrays.toString(array)+ ""+"\n");

                System.out.println("\n" + "\n" + "Tallen i omvand ordning:");
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.print(array[i] + " " + "\n");
                }
                double medeltall = summa / array.length;
                Arrays.sort(array);

                {
               // System.out.println("Största talet:" +" "+ array[array.length - 1]);
                System.out.println("\n" + "\n" + "Minsta talet:"+" " + array[0]);
               System.out.println("Största talet:" +""+ array[array.length - 1]);
                System.out.println("Medeltaltet på array:" +" "+ medeltall);}
                feltall = true;
            }
            else{
                System.out.print("Hur manga tall");
                System.out.print("\t");
            } }
    }
}
