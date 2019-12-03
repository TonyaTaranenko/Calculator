import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(" Welcome to Java Calculator v0.1 \n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Please, enter two numbers");
        System.out.print("\n First number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("\n Second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
        String operation = scanner.next();

//        if (operation == "*") {
//            showResult('*', firstNumber * secondNumber);
//        } else if (operation == "/") {
//            showResult('/', (double) firstNumber / secondNumber);
//        } else if (operation == "+") {
//            showResult('+', firstNumber + secondNumber);
//        } else if (operation == "-") {
//            showResult('-', firstNumber - secondNumber);
//        } else {
//            System.out.println("\n Please select a valid character");
//        }

        switch (operation) {
            case "*":
                showResult('*', firstNumber * secondNumber);
                break;
            case "/":
                showResult('/', (double) firstNumber / secondNumber);
                break;
            case "+":
                showResult('+', firstNumber + secondNumber);
                break;
            case "-":
                showResult('-', firstNumber - secondNumber);
                break;
            default: System.out.println("\n Please select a valid character");
        }

        scanner.close();
        System.out.println(" Closing Application ");
    }

    public static void showResult(char operation, double result)
    {
        String prefixText = "You have selected ";

        System.out.println(prefixText + "* \n Your Result: "+ result);
    }

}