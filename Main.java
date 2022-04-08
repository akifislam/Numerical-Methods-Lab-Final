package Akif;

public class Main {

    public static void main(String[] args) {

        // Calling Using Constructor
        Bisection b = new Bisection(1,2,0.001);
        FalsePosition f = new FalsePosition(1,2,30);
        NewtonRaphson n = new NewtonRaphson(0,0.005);
        Secant s = new Secant(-5,100,0.0005);




        //Calling Using Static Class
//        Bisection.bisect(1,5,0.001);
//        FalsePosition.FalsePosition(-5,5,30);
//        NewtonRaphson.NewtonRaphson(0,0.005);
//        Secant.Secant(-5,100,0.0005);

    }

}
