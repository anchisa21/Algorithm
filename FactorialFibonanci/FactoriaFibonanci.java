package factorial;

public class FactoriaFibonanci {
    public static int factorial(int n) {
        int result =1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.err.println(i + "! =" + result);
        }
        return result;
    }
}
