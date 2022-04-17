package Akif;

public class LagrangeInterpolation {

    double [] x;
    double [] y;
    double value;

    LagrangeInterpolation(double []x, double []y,double value){
        this.x = x;
        this.y = y;
        this.value = value;
        lag(x,y,value);
    }

    public static void lag(double []x, double []y,double value){
        double ans = 0;

        for (int i = 0; i < x.length; i++) {
            double term= y[i];
            for (int j = 0; j < x.length; j++) {
                if(i!=j){
                    term*=((value-x[j])/(x[i]-x[j]));
                }
            }
            ans+=term;
        }
        System.out.println("Lagrange Interpolation : " +ans);
    }


}
