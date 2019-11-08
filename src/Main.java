public class Main {
    public static void main(String[] args) {



        // 300 = 50(1.0025)^(x-5)";

               int a = 50;
               double b =1.0025;
               int y = 300;
               int c = -5;
               System.out.println(y + " = " + a + "(" + b + ")^x" + c );

             int z = (y/a);
              System.out.println(z + " = " +  "(" + b + ")^x" + c );

double  d = Math.log(z)/Math.log(b);
        System.out.println(d +" = " + "x" + c );
        double  w = d - c;
        System.out.println(w + " = " + "x");



        //       double  = Math.log10();
          //     double x = (log(y/a) / log(b)) - c;
       // System.out.println(myPreCalculusString + x);





    }
}
