package Simple;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number x : ");
        double x = scanner.nextDouble();

        System.out.print("Enter Operation (+ - * / % ^) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter Number y : ");
        double y = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                    validOperation = false;
                }
                break;
            case '%':
                if (y != 0) {
                    result = x % y;
                } else {
                    System.out.println("Error: Modulo by zero is undefined.");
                    validOperation = false;
                }
                break;
            case '^':
                result = Math.pow(x, y);
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}