package Akif;

public class FalsePosition {

    double left_guess = -5;
    double right_guess = 5;
    int maxIteration = 20;

    //Constructor
    FalsePosition(double a,double b,int maxIteration){
        this.left_guess = a;
        this.right_guess = b;
        this.maxIteration= maxIteration;
        FalsePosition(left_guess,right_guess,maxIteration);
    }


    // A function just holding the equation
    public static double func(double x){
        return Equation.solve(x);
    }


    public static void FalsePosition(double a, double b, double maxIteration) {

        double root =0;
        System.out.println("Using False Position Method:\n");

        // Case 1 : If initial guess is wrong
        if (func(a) * func(b) >= 0) {
            System.out.println("Initial guess is wrong.(A="+a+",B="+b);
            return;
        }


        int iteration_count = 0;

        while (iteration_count<maxIteration) {

            System.out.print("Iteration : " + (++iteration_count) + " | ");

            // Formula : (af(b) - bf(a)) / (f(b) - f(a))
            root = (a* func(b) - b* func(a)) / (func(b)- func(a));

            // Case 2: Root is exactly at middle point
            if (func(root) == 0.0) {
                break;

                // Case 3: F(a)*F(root) < 0
            } else if (func(a) * func(root) < 0) {
                b = root;
            }

            // Case 4: F(a)*F(root) > 0
            else {
                a = root;
            }
            System.out.println("a = " + a + ", b = " +b + ", root = " + root);
        }
        System.out.println("\nFinally, Using False Position Method, the root is " +root);


    }
}
