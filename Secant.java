package Akif;

public class Secant {

    double x0 = 5;
    double x1 = 10;
    double EPSILON = 0.001;

    //Constructor
    Secant(double x0, double x1, double EPSILON){
        this.x0 = x0;
        this.x1 = x1;
        this.EPSILON = EPSILON;
        Secant(x0,x1,EPSILON);
    }

    // A function just holding the equation
    public static double func(double x) {
        return Equation.solve(x);
    }

    public static void Secant(double x0, double x1, double EPSILON) {
        System.out.println("Using Secant Method : \n");

        double root = 0;

        int iteration = 0;

        if (func(x0) * func(x1) > 0) {
            System.out.println("Wrong Guess");
            return;
        }


        while (Math.abs(x1 - x0) >= EPSILON) {
            double x2 = ((x0 * func(x1)) - (x1 * func(x0))) / (func(x1) - func(x0));
            x0 = x1;
            x1 = x2;
            root = x2; //Just saving
            System.out.println("Iteration :" + (++iteration) + ", Root = " + x2);
        }
        System.out.println("Finally the root using Secant Method is : " +root);

    }


}

