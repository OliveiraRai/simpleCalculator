import java.util.Scanner;

public class InputValidation {
    public static boolean isOperator(String input){
        return input.matches("^[1-4]$");
    }

    public static double getDouble(Scanner scanner, String prompt){
        double value = 0.0;
        boolean isValid = false;

        do {
            System.out.print(prompt);
            String inputLine = scanner.nextLine();

            if(inputLine.trim().isEmpty()){
                System.out.println("Please, make sure to digit something.\n");
                continue;
            }

            try {
                value = Double.parseDouble(inputLine);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input detected!\n");
            }
        } while(!isValid);

        return  value;
    }
}
