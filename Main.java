package Akif;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();

        int a = r.nextInt(100) *(-1); // It will generate -99 to 0
        int b = r.nextInt(100); // It will generate 0 to 99
        Ran
        Bisection.bisect(a,b,0.001);

        while(!Bisection.isOK(a,b)){
            a = r.nextInt(100) *(-1);
            b = r.nextInt(100);
            Bisection.bisect(a,b,0.001);
        }


        // Calling Using Constructor
//        Bisection b = new Bisection(1,2,0.001);
//        FalsePosition f = new FalsePosition(1,2,30);
//        NewtonRaphson n = new NewtonRaphson(0,0.005);
//        Secant s = new Secant(-5,100,0.0005);

//        double X[] = { 95, 85, 80, 70, 60 };
//        double Y[] = { 90, 80, 70, 65, 60 };

//        LeastSquare ls = new LeastSquare(X,Y);




        //Calling Using Static Class
//        Bisection.bisect(1,5,0.001);
//        FalsePosition.FalsePosition(-5,5,30);
//        NewtonRaphson.NewtonRaphson(0,0.005);
//        Secant.Secant(-5,100,0.0005);

    }

}
