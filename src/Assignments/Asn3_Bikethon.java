package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Asn3_Bikethon {

    private static final String ANSI_BLUE = "\u001b[34m";
    private static final String ANSI_BOLD_GREEN = "\u001b[1;32m";
    private static final String ANSI_RESET = "\u001b[0m";

    private static final ArrayList<String> names = new ArrayList<>();
    private static final ArrayList<Double> amounts = new ArrayList<>();
    private static final ArrayList<Boolean> formReturned = new ArrayList<>();

    public static void main(String[] args) {
        grantNames();
        printStudentsInfo();
        teamFinancials();
        insufficiencies();
        desperationAward();
        goldenFanAward();
    }


    private static void grantNames() {
        names.addAll(Arrays.asList("Dilshaan", "Chelsea", "Daniel", "Damien", "John", "Daksh", "Dhvanay", "Pythagorous", "Jared", "Ezekiel"));
        amounts.addAll(Arrays.asList(505.00, 350.00, 525.00, 175.00, 100.00, 120.00, 150.00, 250.00, 300.00, 140.00));
        formReturned.addAll(Arrays.asList(true, true, false, true, true, false, true, false, false, true));
    }

    private static void printStudentsInfo() {
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("\n" + names.get(i) + "\t\t" +ANSI_BOLD_GREEN + "$" + amounts.get(i) + ANSI_RESET + "\t\t" + "Form Status: " + formReturned.get(i));
        }
    }

    private static void teamFinancials() {
        //total amount raised by team
        double amountsTotal = 0;
        for (int i = 0; i < amounts.size(); i++) {
            amountsTotal = amountsTotal + amounts.get(i);
        }
        System.out.printf("\n\nTotal amount raised by team: $" + ANSI_BOLD_GREEN +amountsTotal + ANSI_RESET); //Total amount raised by the team
        System.out.printf("\nAverage amount raised by member: $" + amountsTotal / amounts.size()); //The average amount raised per student
    }

    private static void insufficiencies() {
        int shortAmount = 0;
        for (int i = 0; i < names.size(); i++) { //loop for each person
            if (amounts.get(i) < 120) { //check if the amount is less than 120
                shortAmount = shortAmount + 1;
            }
        }
        if (shortAmount > 2) {
            System.out.printf("\nAmount of students below $120: " + shortAmount);
            System.out.printf("\nLiving Room Location: Closet"); // Living conditions
        }
        System.out.printf(ANSI_BLUE + "\n\nThe following students have not submitted their forms: " + ANSI_RESET); // The names of students who have not yet returned their forms
        for (int i = 0; i < names.size(); i++) {
            if (!formReturned.get(i)) {
                System.out.printf("\n" + names.get(i));
            }
        }
    }

    private static void desperationAward() {
        //print the highest amount raised and that person's name
        //print if they get a power outlet??
        double maxValue = 0;
        String desperateMember = " ";
        for (int i = 0; i < names.size(); i++) { // fix the loop to find the highest value
            if (amounts.get(i) > maxValue) {
                maxValue = amounts.get(i);
                desperateMember = names.get(i);
            }
        }
        System.out.printf("\n\n" + desperateMember + " raised the highest amount in their group and has earned a power outlet for their team. They raised $" + maxValue); //insertValue - the highest person
    }

    private static void goldenFanAward() {
        System.out.printf(ANSI_BLUE + "\n\nThe following students have received a Golden Fan: " + ANSI_RESET);
        for (int i = 0; i < names.size(); i++) {
            if (amounts.get(i) > 500) {
                System.out.printf("\n" + names.get(i));
            }
        }
        System.out.println(" ");// create a gap between the "Process finished" message
    }

}
