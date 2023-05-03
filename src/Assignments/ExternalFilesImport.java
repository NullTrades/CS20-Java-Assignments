package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Sources that we used to help with our code and our guide
//https://www.kaggle.com/datasets/jacksonbarreto/higher-education-institutions-in-the-usa
//https://www.javatpoint.com/how-to-read-csv-file-in-java
//https://stackoverflow.com/questions/1505311/how-can-i-clean-up-misaligned-columns-in-text
//Dilshaan was also a significant helper in this endeavour

public class ExternalFilesImport {

    //These ArrayLists are used to store each column of data from the .csv file
    private static ArrayList<Integer> schoolID = new ArrayList<>();
    private static ArrayList<String> schoolRegion = new ArrayList<>();
    private static ArrayList<String> schoolName = new ArrayList<>();
    private static ArrayList<String> schoolCategory = new ArrayList<>();
    private static ArrayList<String> schoolURL = new ArrayList<>();

    public static void main(String[] args)  {

        divider();
        importingData();

    }

    //This method is in charge of importing the data from the csv file
    private static void importingData() {

        try {
            //BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("src\\universityData.csv"));

            //This skips the first line (header information) in the .csv file
            String line = br.readLine();

            while((line = br.readLine()) != null) { // returns a Boolean Value
                //This line splits the data with commas
                String[] schoolData = line.split(",");

                //The following adds the first, second, etc., element to the ArrayLists at the start of the program
                schoolID.add(Integer.valueOf(schoolData[0]));
                schoolRegion.add(schoolData[1]);
                schoolName.add(schoolData[2]);
                schoolCategory.add(schoolData[3]);
                schoolURL.add(schoolData[4]);
            }
            //try/catch blocks to handle any exceptions that may occur while reading the files.
        } catch(IOException e) {
            e.printStackTrace();
        }

        cleanData();
        //cleaningData();
        printData();

        //Test code to print
        //This displays the ArrayLists with all the data provided on the command line
        //System.out.println(schoolID);
        //System.out.println(schoolRegion);
        //System.out.println(schoolName);
        //System.out.println(schoolCategory);
        //System.out.println(schoolURL);

    }

    //This method is in charge of stripping the "https?://" part of the URL in the .csv file
    private static void cleanData() {
        //For loop that iterates through schoolURL
        for(int i = 0; i < schoolURL.size(); i++) {
            //Assigns the index of schoolURL to url to clean URL links
            String url = schoolURL.get(i);
            //Following code takes place if the URL starts with "https://" or "http://"
            if(url.startsWith("https://") || url.startsWith("http://")) {
                //Using regex "?" for both "https://" and "http://" occurrences, we remove them from the URL
                url = url.replaceFirst("https?://", "");
                //As some links only include "https://" without being followed by a "www.", it can lead to a false URL
                //This is prevented with the addition of adding a "www." to links without a "www." in the string
            }
            if(!url.startsWith("www.")) {
                url = "www." + url;
            }
            //This makes it so that "url" replaces the instances of "i" in the .csv file to give us clean up links
            schoolURL.set(i, url);
            //This is text code to see if the URL printing works
            //System.out.println(schoolURL.get(i));
        }
    }

    private static void printData() {
        //used %n instead of \n as we used printf to format the Arraylist that is being outputted in a new a line
        for (int i = 0; i < schoolID.size(); i++) {
            System.out.printf("%-25d %-25s %-25s %-25s %-25s%n" , schoolID.get(i) , schoolRegion.get(i)  , schoolName.get(i) , schoolCategory.get(i)  , schoolURL.get(i));
        }
    }

    private static void divider() {
        System.out.println("---------------");
    }

}
