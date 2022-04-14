package Akif;

import java.util.Arrays;

public class LeastSquare {
    public double A;
    public double B;

    LeastSquare(double [] x_coordinates, double [] y_coordinates){
        makeB(x_coordinates, y_coordinates);
        makeA(x_coordinates, y_coordinates);
        print();
    }


    void makeB(double[] x, double[] y) {

        int size_of_X = x.length;

        double sumX = Arrays.stream(x).sum();
        double sumY = Arrays.stream(y).sum();

        double sumXsumY = 0;


        double sum2 = 0;

        // Making Σxy
        for (int i = 0; i < size_of_X; i++) {

            sumXsumY += x[i] * y[i];
            sum2 += x[i] * x[i];
        }

        // b = ( nΣxy - ΣxΣy ) / (n*Σx^2 - ΣxΣx)
        double b = (double) (size_of_X * sumXsumY - sumX * sumY)/ (size_of_X * sum2 - sumX * sumX);

        B = b;
    }

    void makeA(double X[], double Y[]) {

        int n = X.length;

        double meanX = Arrays.stream(X).sum() / n;
        double meanY = Arrays.stream(Y).sum() / n;


        A = meanY - B * meanX;
    }

    public void print() {
        System.out.printf("\nUsing Least Square Method, Straight line goes through: \n\n( Y = %.4f  +  %.4f  *  X )\n\n",A,B);
    }

}