package Akif;

public class NewtonRaphson {

   double initial_guess = 5;
   double EPSILON = 0.001;
    //Constructor
    NewtonRaphson(double a,double EPSILON){
       this.initial_guess = a;
       this.EPSILON = EPSILON;
        NewtonRaphson(initial_guess,EPSILON);
    }

    // A function just holding the equation
    public static double func(double x) {
        return x * x * x - 2 * x - 5;
    }

    public static double funcDerivatives(double x) {
        return 3 * x * x - 2;
    }

    public static void NewtonRaphson(double a, double EPSILON) {

        double root = 0;

        System.out.println("\nUsing Newton Raphson Method : \n");
        int iteration = 0;

        double h = func(a) / funcDerivatives(a); // F(Xn) / F'(Xn)

        while (Math.abs(h) >= EPSILON) {

            h = func(a) / funcDerivatives(a);
            a = a - h; // As the formula is : Xn+1 = Xn - (F(Xn) / F'(Xn))
            root = a;
            System.out.println("Iteration :" + (++iteration) + ", Root = " + a);
        }

        System.out.println("Finally the root using Newton Raphson is : " +root);
    }



}

