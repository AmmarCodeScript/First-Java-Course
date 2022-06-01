import java.util.Scanner;
  import java.lang.Math;

public class Task3_1 {

    public  Task3_1 () {
        //Trigonometry and conditions
        float aa,m,v,aaa,bbb,n,a;
        double div, din;



        Scanner s = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("                          ");
        System.out.println("Detta program beräknar längden på hypotenusan för given katet och vinkel i en rätvinklig triangel");
        System.out.println("Vilken katet är bekant? (1 = närliggande katet, 2 = motstående katet):");
        a = s.nextFloat();


        if (a == 1){
            System.out.print("Ange längden på närliggande katet:");
            n= s.nextFloat();
            System.out.print("Ange vinkeln:");
            v = s.nextFloat();

            div = n/Math.cos(v*Math.PI/180);
            System.out.println("Hypotenusan c = "+div);
        }


        else if  (a == 2) {
            System.out.print("Ange längden på motstående katet :");
            m= s.nextFloat();

            System.out.print("Ange vinkeln:");
            v = s.nextFloat();

            din = m/Math.sin(v*Math.PI/180);
            System.out.println("Hypotenusan c ="+din);
        }

        else if  (a >2) {
            System.out.print("Felskriven! Prova på nytt antingen 1 eller 2:");
        }

        System.out.println("     ");
        System.out.println("---------------------------------");

    }
}


