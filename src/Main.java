import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables
        String operator;
        double firstNumber;
        double secondNumber;
        double result = 0;

        // welcome message
        System.out.print("\nSimple Java Calculator\n");
        System.out.println();

        // user input for operator
        do {
            System.out.println("which operator do you want to use? ");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println();
            System.out.print("Choice: ");
            operator = scanner.nextLine();

            if (!InputValidation.isOperator(operator)) {
                System.out.println("Please, make sure to choose between 1 to 4.\n");
                continue;
            }

            break;
        } while (true);

        System.out.println();

        // user input for first number
        firstNumber = InputValidation.getDouble(scanner, "Enter the first number: ");

        System.out.println();

        // user input for second number
        secondNumber = InputValidation.getDouble(scanner, "Enter the second number: ");

        System.out.println();

        switch (operator) {
            case "1" -> result = firstNumber + secondNumber;
            case "2" -> result = firstNumber - secondNumber;
            case "3" -> result = firstNumber * secondNumber;
            case "4" -> {

                    if (secondNumber == 0) {
                        System.out.println("Can't divide by 0.");
                        return;
                    } else {
                        result = firstNumber / secondNumber;
                    }

            }
        }

        if(result % 1 == 0){
            int intResult = (int) result;
            System.out.printf("The result is %d", intResult);
        }
        else {
            System.out.printf("The result is %.1f", result);
        }

        scanner.close();
    }
}