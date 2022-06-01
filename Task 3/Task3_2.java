

import java.util.Scanner;
  import java.lang.Math;

public class Task3_2 {

    public Task3_2 () {
    //More trigonometry and conditions!

        Scanner s = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("                                 ");

        System.out.println("Ange längden på närliggande katet (ange 0 om obekant):");
        double a = s.nextFloat();
        System.out.println("Ange längden på motstående katet (ange 0 om obekant):");
        double b = s.nextFloat();
        System.out.println("Ange längden på hypotenusan (ange 0 om obekant):");
        double c = s.nextFloat();
        System.out.println("Ange vinkeln (ange 0 om obekant):");
        double v = s.nextFloat();

        if    (a == 0 && b ==0 && c == 0 && v ==0){
            System.out.print("Du bör ange minst 2 värden för den rätvinkliga triangeln för att beräkningar ska kunna utföras!");
        }  /* här är om if är bara 0*/
        else if (a >0 && b ==0 && c == 0 && v ==0){
            System.out.print("Du bör ange minst 2 värden för den rätvinkliga triangeln för att beräkningar ska kunna utföras!");
        }
        else if (a == 0 && b >0 && c == 0 && v ==0){
            System.out.print("Du bör ange minst 2 värden för den rätvinkliga triangeln för att beräkningar ska kunna utföras!");
        }
        else if (a == 0 && b ==0 && c > 0 && v ==0){
            System.out.print("Du bör ange minst 2 värden för den rätvinkliga triangeln för att beräkningar ska kunna utföras!");
        }
        else if (a == 0 && b ==0 && c == 0 && v >0){
            System.out.print("Ange längden på närliggande katet:");
        }


        else if (a > 0 && b >0 && c == 0 && v ==0) {
            double sats = (a * a) + (b * b);
            double sats1 = Math.sqrt(sats);
            double sats2 = Math.asin(b/sats1);
            double sats3 = Math.toDegrees(sats2);
            System.out.print("Närliggande katet = " + a );  System.out.println("                                 ");
            System.out.print("Motstående  =  " + b ); System.out.println("                                 ");
            System.out.print("Hypotenusan = "+ sats1); System.out.println("                                 ");
            System.out.print("Vinkeln = "+ sats3 +"grader"); System.out.println("                                 ");
        }
        else if (a > 0 && b ==0 && c > 0 && v ==0) {
            double sats = (c*c) - (a*a) ;
            double sats1 = Math.sqrt(sats);
            double sats2 = Math.asin(a/c);
            double sats3 = Math.toDegrees(sats2);
            System.out.print("Närliggande katet = " + a );  System.out.println("                           ");
            System.out.print("Motstående  =  " + sats1  ); System.out.println("                            ");
            System.out.print("Hypotenusan = "+ c ); System.out.println("                                   ");
            System.out.print("Vinkeln = "+ sats3 +"grader"); System.out.println("                          ");
        }
        else if (a > 0 && b ==0 && c ==0 && v >0) {
            double sats = Math.sin(Math.toRadians(v)) ;
            double sats1 = a/sats;
            double sats2 = -(a*a)+(sats1*sats1);
            double sats3 = Math.sqrt(sats2);
            System.out.print("Närliggande katet = " + a );  System.out.println("                         ");
            System.out.print("Motstående  =  " + sats3 ); System.out.println("                            ");
            System.out.print("Hypotenusan = "+ sats1 ); System.out.println("                              ");
            System.out.print("Vinkeln = "+ v +" grader"); System.out.println("                          ");
        }

        else if (a == 0 && b > 0 && c >0 && v ==0) {

            double sats = Math.cos(b/c);
            double sats1 = sats*(180/Math.PI);
            double sats11 = Math.toDegrees((sats));
            double sats2 = -(b*b)+(c*c);
            double sats3 = Math.sqrt(sats2);
            System.out.print("Närliggande katet = " + sats3 );  System.out.println("                         ");
            System.out.print("Motstående  =  " + b ); System.out.println("                            ");
            System.out.print("Hypotenusan = "+ c ); System.out.println("                              ");
            System.out.print("Vinkeln = "+ sats11+" grader"); System.out.println("                         ");
        }
        else if (a == 0 && b > 0 && c == 0 && v >0){
            double sats = Math.cos(Math.toRadians(v)) ;
            double sats1 = b/sats;
            double sats2 = -(b*b)+(sats1*sats1);
            double sats3 = Math.sqrt(sats2);
            System.out.print("Närliggande katet = " +sats3 );  System.out.println("                         ");
            System.out.print("Motstående  =  " + b ); System.out.println("                            ");
            System.out.print("Hypotenusan = "+ sats1 ); System.out.println("                              ");
            System.out.print("Vinkeln = "+ v +" grader"); System.out.println("                          ");
        }
        else if (a == 0 && b == 0 && c > 0 && v >0){
            double sats = Math.cos(Math.toRadians(v)) ;
            double sats1 = c*sats;
            double sats2 = (c*c)-(sats1*sats1);
            double sats3 = Math.sqrt(sats2);
            System.out.print("Närliggande katet = " + sats3 );  System.out.println("                         ");
            System.out.print("Motstående  =  " +sats1 ); System.out.println("                            ");
            System.out.print("Hypotenusan = "+ c ); System.out.println("                              ");
            System.out.print("Vinkeln = "+ v +" grader"); System.out.println("                          ");
        }

        else if (a > 0 && b > 0 && c > 0 && v ==0) {
            double sats = (a * a) + (b * b);
            double sats1 = Math.sqrt(sats);
            double sats2 = Math.asin(b / sats1);
            double sats3 = Math.toDegrees(sats2);
            System.out.print("Närliggande katet = " + a);
            System.out.println("                                 ");
            System.out.print("Motstående  =  " + b);
            System.out.println("                                 ");
            System.out.print("Hypotenusan = " + c);
            System.out.println("                                 ");
            System.out.print("Vinkeln = " + sats3 + "grader");
            System.out.println("          ");
        }
        else if (a > 0 && b > 0 && c == 0 && v >0){
                double sats = (a * a) + (b * b);
                double sats1 = Math.sqrt(sats);
                double sats2 = Math.asin(b/sats1);
                double sats3 = Math.toDegrees(sats2);
                System.out.print("Närliggande katet = " + a );  System.out.println("                                 ");
                System.out.print("Motstående  =  " + b ); System.out.println("                                 ");
                System.out.print("Hypotenusan = "+ sats1); System.out.println("                                 ");
                System.out.print("Vinkeln = "+ v +"grader"); System.out.println("                                 ");

        }
        else if (a > 0 && b == 0 && c > 0 && v >0){
                double sats = (c*c) - (a*a) ;
                double sats1 = Math.sqrt(sats);
                double sats2 = Math.asin(a/c);
                double sats3 = Math.toDegrees(sats2);
                System.out.print("Närliggande katet = " + a );  System.out.println("                           ");
                System.out.print("Motstående  =  " + sats1  ); System.out.println("                            ");
                System.out.print("Hypotenusan = "+ c ); System.out.println("                                   ");
                System.out.print("Vinkeln = "+ v+"grader"); System.out.println("                          ");
        }
        else if (a == 0 && b > 0 && c > 0 && v >0){
                double sats = Math.cos(Math.toRadians(v)) ;
                double sats1 = c*sats;
                double sats2 = (c*c)-(sats1*sats1);
                double sats3 = Math.sqrt(sats2);
                System.out.print("Närliggande katet = " + sats3 );  System.out.println("                         ");
                System.out.print("Motstående  =  " +b); System.out.println("                            ");
                System.out.print("Hypotenusan = "+ c ); System.out.println("                              ");
                System.out.print("Vinkeln = "+ v +" grader"); System.out.println("                          ");
        }




        System.out.println("    ");
        System.out.println("---------------------------------");
    }


}
