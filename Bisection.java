package Akif;

public class Bisection {
    double left_guess = -5;
    double right_guess = 5;
    double EPSILON = 0.001;

    //Constructor
    Bisection(double a, double b, double EPSILON) {
        this.left_guess = a;
        this.right_guess = b;
        this.EPSILON = EPSILON;
        bisect(left_guess, right_guess, EPSILON);
    }

    // A function just holding the equation

    public static boolean isOK(double a, double b) {
        if (func(a) * func(b) >= 0) {
            return false;
        }
        return true;
    }

    public static double func(double x) {
        return Equation.solve(x);
    }


    public static void bisect(double a, double b, double EPSILON) {

        double root = 0;
        System.out.println("\nUsing Bisection Method:\n");

        // Case 1 : If initial guess is wrong
        if (func(a) * func(b) >= 0) {
            System.out.println("Initial guess is wrong.(A=" + a + ",B=" + b + ")");
            return;
        }


        int iteration_count = 0;

        while (b - a >= EPSILON) {

            System.out.print("Iteration : " + (++iteration_count) + " | ");

            root = ((a + b) / 2);

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

            System.out.println("a = " + a + ", b = " + b + ", root = " + root);
        }
        System.out.println("\nFinally, Using Bisection Method, the root is " + root);


    }
}
