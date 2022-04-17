package Akif;

public class PolynomialLS {
    public static double ansA = 0;
    public static double ansB = 0;
    public static double ansC = 0;
    double [] x;
    double [] y;

    public static void printMatrix(double A[][]){
        System.out.println("--------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j<4; j++){
                System.out.print(String.format("%.2f ",A[i][j]));
            }
            System.out.println();
        }
        System.out.println("--------");
    }
    PolynomialLS(double [] x, double [] y){
        this.x = x;
        this.y = y;
        solve(x,y);
    }

    public static void solve(double []a , double []b){

        double n = a.length;
        double x=0,x2=0,x3=0,x4=0,y=0,xy=0,x2y=0;

        //Making Summation of X
        for (int i = 0; i < a.length; i++) {
            x +=a[i];
        }
        //Making Summation of X2
        for (int i = 0; i < a.length; i++) {
            x2 +=(a[i]*a[i]);
        }
        //Making Summation of X3
        for (int i = 0; i < a.length; i++) {
            x3 +=(a[i]*a[i]*a[i]);
        }
        //Making Summation of X4
        for (int i = 0; i < a.length; i++) {
            x4 +=(a[i]*a[i]*a[i]*a[i]);
        }
        //Making Summation of y
        for (int i = 0; i < a.length; i++) {
            y +=(b[i]);
        }
        //Making Summation of xy
        for (int i = 0; i < a.length; i++) {
            xy +=(a[i]*b[i]);
        }
        //Making Summation of xy
        for (int i = 0; i < a.length; i++) {
            x2y +=((a[i]*a[i])*b[i]);
        }

        // Matrix
        double [][] mat = new double[5][5];

        mat[0][0] = n;
        mat[0][1] = x;
        mat[0][2]= x2;
        mat[0][3] = y;

        mat[1][0] = x;
        mat[1][1] = x2;
        mat[1][2]= x3;
        mat[1][3] = xy;

        mat[2][0] = x2;
        mat[2][1] = x3;
        mat[2][2]= x4;
        mat[2][3] = x2y;

        printMatrix(mat);
        solve_eq(mat);

    }

    public static void solve_eq(double eq[][]) {

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (i != j) {
                    double b = eq[i][j] / eq[j][j];
                    for (int k = 0; k <= 3 + 1; k++) {
                        eq[i][k] = eq[i][k] - b * eq[j][k];
                    }
                }
            }
        }
        printMatrix(eq);
        ansA = eq[0][3]/eq[0][0];
        ansB = eq[1][3]/eq[1][1];
        ansC = eq[2][3]/eq[2][2];
        printFinalEq();
    }
    public static void printFinalEq(){
        System.out.println(String.format("%.1f",ansA) + "+" + String.format("%.1f",ansB) +" x +" + String.format("%.1f",ansC)+ " x^2");
    }

}
