package Akif;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
//
//        while(true){
//            int a = r.nextInt(5) *(-1);
//            int b = r.nextInt(5);
//            Bisection bs = new Bisection(a,b,0.001);
//            if(Bisection.isOK(a,b)) break;
//        }


        // Calling Using Constructor
//        Bisection b = new Bisection(1,2,0.001);
//        FalsePosition f = new FalsePosition(1,2,30);
//        NewtonRaphson n = new NewtonRaphson(0,0.005);
//        Secant s = new Secant(-5,100,0.0005);

        double X[] = { 0, 1, 2, 5};
        double Y[] = { 2, 3, 12, 147};
//        LagrangeInterpolation l = new LagrangeInterpolation(X,Y,3);


        double P[] = { 0, 1, 2};
        double Q[] = { 1,6, 17};
        PolynomialLS pl = new PolynomialLS(P,Q);
//        LeastSquare ls = new LeastSquare(X,Y);




        //Calling Using Static Class
//        Bisection.bisect(1,5,0.001);
//        FalsePosition.FalsePosition(-5,5,30);
//        NewtonRaphson.NewtonRaphson(0,0.005);
//        Secant.Secant(-5,100,0.0005)
//        ;

    }

}
