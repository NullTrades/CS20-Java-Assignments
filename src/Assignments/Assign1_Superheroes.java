package Assignments;

import com.diogonunes.jcolor.Attribute;

import java.util.*;

import static com.diogonunes.jcolor.Ansi.colorize;


public class Assign1_Superheroes {

    public static ArrayList<String> heroes = new ArrayList<>();
    public static ArrayList<String> superpowers = new ArrayList<>();
    public static ArrayList<Boolean> isHuman = new ArrayList<>();

    public static void main(String[] args) {
        //      1. Create a five item ArrayList that holds the names of superheroes.
        heroes.add("Robin");
        heroes.add("Black Panther");
        heroes.add("The Martian Manhunter");
        heroes.add("The Flash");
        heroes.add("Miles Morales");

        printHeroes();
        giveModernNames();
        makeParallelArrays();
        filteredPrint();
        leagueMembers();
        greenGoo();
    }

    //end of main method


    private static void printHeroes() {
        //      2. Print all of your Heroes ArrayList using a FOR loop.
        System.out.printf("%nThe only available heroes to save the world are: \n");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }
    }

    private static void giveModernNames() {
        //      3. Two of your superheroes have decided they want more modern and cooler names
        //      Using the SET function, write 2 lines of code that changes the names of only
        //      the first and last superhero to something better.  allNames.set(?, ?);
        heroes.set(0, "Nightwing");
        heroes.set(4, "Spiderman");

        //      4. Use the cheat print code to reprint all of your Heroes to prove the changes worked.
        System.out.println("\n" + heroes);

    }

    private static void makeParallelArrays() {
        //      5. Set up 2 additional parallel ArrayLists that store the superpowers and
        //      an isHuman variable for the 5 characters in your original ArrayList
        //      Superpower ArrayList should store Strings isHuman ArrayList should store Booleans.
        //      Hint: ArrayList<Boolean>

        superpowers.add("Staff");
        superpowers.add("Heart-Shaped Herb");
        superpowers.add("Shape-shifting");
        superpowers.add("Speed");
        superpowers.add("Attributes of spider");


        isHuman.add(true);
        isHuman.add(true);
        isHuman.add(false);
        isHuman.add(true);
        isHuman.add(true);

        //        6a.
        //        Printline the following:
        //        Name				Power			They are human?
        //        printf help - https://teamtreehouse.com/community/what-does-s-n-mean-in-the-displayprogress-method#:~:text=They%20are%20format%20specifiers%20used,it%20in%20a%20new%20line.

        System.out.printf("\nName\t\t\t\tPower\t\t\t\tThey are human?%n");
        //        Using a SINGLE for loop, print out all the characters so that it reads like the following.
        //        Do not worry about getting everything to line up neatly.

        for (int i = 0; i < heroes.size(); i++) {

            System.out.printf("\n" + heroes.get(i) + "\t\t\t\t" + superpowers.get(i) + "\t\t\t\t" + isHuman.get(i));

        }
        //         6b.  Alter the above print statements so that it also prints
        //         the (i) value beside the superheroes.

        System.out.printf("%n\n\t\tName\t\t\t\t\tPower\t\t\t\tThey are human?%n");

        for (int i = 0; i < heroes.size(); i++) {
            // String.valueOf -- turns the int value to a string so the colorize function can work
            System.out.printf("\n" + colorize(String.valueOf(i), Attribute.BRIGHT_BLUE_BACK(), Attribute.BLACK_TEXT()) + "\t\t" + heroes.get(i) + "\t\t\t\t" + superpowers.get(i) + "\t\t\t\t" + isHuman.get(i));

        }
        System.out.println(" ");

    }

    private static void filteredPrint() {
        System.out.printf("%n\nName\t\t\t\t\tPower\t\t\t\t" + colorize("They are human?%n", Attribute.BRIGHT_MAGENTA_TEXT()));
        for (int i = 0; i < heroes.size(); i++) {
            //          7.  Use a filtered print to only print humans.  Reminder, ‘filtered print’
            //          just means to use an IF statement inside your FOR loop.
            //          Hint: if(isHuman.get(i)){

            //  unclear whether to continue to include the index in the table, opted to remove it from here on
            if (isHuman.get(i)) {

                System.out.printf("\n" + "\t\t" + heroes.get(i) + "\t\t\t\t" + superpowers.get(i) + "\t\t\t\t" + isHuman.get(i));

            }


        }
        System.out.println(" "); //create a space between this step and the next

        //           8.  Use a filtered print to only print those with military affiliations
        //           (name contains ‘Captain’ or name contains ‘Sergeant’, etc.)
        //           OR some other filter you can think of.
        //           Hint: 	if(allNames.get(i).contains(“???”)    || allNames.get(i).contains(“???”)  ) {
        //           Above this print, add a println such as the following:
        //           /*********************Filtered Print - Military Heroes***********/

        //I changed this step to only print members of the justice league - filtered with "The" at the start of their name


    }

    private static void leagueMembers() {
        System.out.println(" ");

        System.out.println(colorize("/*********************Filtered Print - Justice League Members***********/", Attribute.BRIGHT_BLUE_TEXT()));
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).contains("The ")) {
                System.out.printf("\n" + heroes.get(i) + "\t\t\t\t" + superpowers.get(i) + "\t\t\t\t" + isHuman.get(i));

            }
        }
    }

    private static void greenGoo() {
        for (int i = 0; i < heroes.size(); i++) {
            if (!isHuman.get(i)) {
                superpowers.set(i, colorize("NONE", Attribute.BRIGHT_RED_TEXT()));
            }
        }
        System.out.println(" "); //insert new line
        System.out.printf(colorize("\nName\t\t\t\tPower\t\t\t\tThey are human?", Attribute.BRIGHT_YELLOW_TEXT()));

        for (int i = 0; i < heroes.size(); i++) {

            System.out.printf("\n" + heroes.get(i) + "\t\t\t\t" + superpowers.get(i) + "\t\t\t\t" + isHuman.get(i));

        }
        System.out.println(""); // gap between the "process finished" exit code
    }
}
