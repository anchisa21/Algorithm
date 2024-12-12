package fibonanci;

import java.util.Scanner;

public class fibonanci {
    public static void main(String[] args) {
        Scanner scanIn = new  Scanner(System.in);
        System.out.println("Enter a Fibonanci number:");
        int n = scanIn.nextInt();
        System.out.println("Caluting.......");
        scanIn.close();
        int f0 =0, f1 =1;

        if (n>= 0)
            System.out.println("f0 = " + f0);
        if (n >= 1)
            System.out.println("f1 = " + f1);
        for (int i = 2; i <= n; i++) {
            int fn = f0 + f1;
            System.out.println("f" + i + " = " +fn);
            f0 = f1;
            f1 = fn;
        }
        System.err.print("value of Fibonanci is " + f1);
    }
}
