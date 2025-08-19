import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0);

        double result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': 
                if (b != 0) result = a / b; 
                else System.out.println("Division by zero not allowed!");
                break;
            default: System.out.println("Invalid Operation");
        }

        System.out.println("Result: " + result);
    }
}
