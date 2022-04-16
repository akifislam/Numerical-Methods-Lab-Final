package Akif;

class Trapezoidal {

    public static float f(float x) {
        // f(x) = 1/(1+x*x)
        return 1 / (1 + x * x);
    }

    // Function to evaluate the value of integral
    public static float trapezoidal(float a, float b, float n) {
        // Grid spacing
        float h = (b - a) / n;

        // Computing sum of first and last terms
        // in above formula
        float s = f(a) + f(b);

        // Adding middle terms in above formula
        for (int i = 1; i < n; i++)
            s += 2 * f(a + i * h);

        // h/2 indicates (b-a)/2n. Multiplying h/2 with s.
        return (h / 2) * s;
    }

    public static void main(String[] args) {
        float x0 = 0;
        float xn = 1;
        int n = 6;
        System.out.println(trapezoidal(x0,xn,n)); //AKIF STYLE
        System.out.println("Value of integral is " +(Math.round(trapezoidal(x0, xn, n) * 10000.0) / 10000.0)); //GFG Style
    }
}

