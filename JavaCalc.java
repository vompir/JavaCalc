import java.util.Scanner;
public class JavaCalc {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number (base for log): ");
        double num2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter operation: ");
        String op = sc.nextLine();
        switch (op) {
            case "+":
                System.out.println(sum(num1, num2));
                break;
            case "-":
                System.out.println(sub(num1, num2));
                break;
            case "*":
                System.out.println(mul(num1, num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero!");
                } else {
                    System.out.println(div(num1, num2));
                }
                break;
            case "^":
                if (num1 == 0 && num2 == 0) {
                    System.out.println("Error!");
                } else {
                    System.out.println(pow(num1, num2));
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.println("Error!");
                } else {
                    System.out.println(rem(num1, num2));
                }
                break;
            case "log":
                if (num1 <= 0 || num2 <= 0 || num2 == 1) {
                    System.out.println("Error!");
                } else {
                    System.out.println(log(num1, num2));
                }
                break;
            case "tetr":
                if (num2 <= 0) {
                    System.out.println("Error!");
                } else {
                    System.out.println(tetr(num1, num2));
                }
                break;
            default:
                System.out.println("Enter correct operation");
        }
    }
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }
    public static double mul(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        return a / b;
    }
    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }
    public static double rem(double a, double b) {
        return a % b;
    }
    public static double log(double value, double base) {
        return Math.log(value) / Math.log(base);
    }
    public static double tetr(double base, double iter) {
        if (iter == 1) {
            return base;
        }
        return Math.pow(base, tetr(base, iter));
    }
}
