package Demos20;

import java.util.Scanner;

public class calculator {
    private static Scanner input; //variable declaration


    public static void main(String[] args) {

        input = new Scanner(System.in);
        //Variable  initialization

        //IPO - Input Process Output

        int num1 = intValidator();
        int num2 = intValidator();
        runEquation(num1, num2);
        //way for the user to decide which method they want to use

        //ask for user input (find a method to ensure it is one of the provided equations)



        input.close();
    }


    private static void runEquation(double first, double second) {
        // TODO Auto-generated method stub
        boolean equationEntered = false;
        int failedAttempts = 0;

        while (!equationEntered) {
            System.out.println("which equation would you like to perform (sum, difference, product, quotient, modulus): ");
            String equationChosen = input.nextLine();
            if (equationChosen.equals("sum")) {
                System.out.println("The sum of your numbers is: " + Math.round((first + second)* 100.00)/ 100.00);
                equationEntered = true;
            } else if (equationChosen.equals("difference")) {
                System.out.println("The difference of your numbers is: " + Math.round((first - second)* 100.00)/ 100.00);
                equationEntered = true;
            } else if (equationChosen.equals("product")) {
                System.out.println("The product of your numbers is: " + Math.round((first * second)* 100.00)/ 100.00);
                equationEntered = true;
            } else if (equationChosen.equals("quotient")) {
                System.out.println("The quotient of your numbers is: " + Math.round((first / second) * 100.00) / 100.00);
                equationEntered = true;
            } else if (equationChosen.equals("modulus")) {
                System.out.println("The remainder of your numbers is: " + Math.round((first % second) * 100.00) / 100.00);
                equationEntered = true;
            } else {
                System.out.println("Invalid Input. Please select one of the provided equations.");
                failedAttempts++;
//                if(failedAttempts >= 3) {
//                    System.out.println("Are you okay???!!! CHOSE AN EQUATION");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
                if(failedAttempts >= 2) {
                    System.out.println("You're Done");
                    delayTime(2000);
                    System.exit(0);
                }
            }
        }

    }

    private static int intValidator() {
        boolean numberEntered = false;

        //numberEntered==false	-	have not entered a number yet
        while (!numberEntered) {
            System.out.print("Enter a number: ");
            if (input.hasNextInt()) {
                numberEntered = true;
            } else { //it was not an int
                System.out.println("Invalid Input. Please enter a number.");
                input.nextLine();


            }

        }
        int num = input.nextInt();
        input.nextLine(); //clears out the new line character!
//		System.out.println("Your number was: " + num);
        return num;
    }
    private static int delayTime(int delayValue) {
        try {
            Thread.sleep(delayValue);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return delayValue;
    }

}
