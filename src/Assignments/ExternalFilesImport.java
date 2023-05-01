package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;

public class ExternalFilesImport {

//    private static ArrayList<String> schoolData = new ArrayList<>();

    //https://www.kaggle.com/datasets/jacksonbarreto/higher-education-institutions-in-the-usa
    //https://www.javatpoint.com/how-to-read-csv-file-in-java
//    https://stackoverflow.com/questions/1505311/how-can-i-clean-up-misaligned-columns-in-text
    public static void main(String[] args) {

        String line = "";
        String splitBy = ",";

        try {
            //BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("src\\universityData.csv"));
            while((line = br.readLine()) != null) { // returns a Boolean Value
            String[] schoolData = line.split(splitBy);
            System.out.printf("\n School Name = " + schoolData[2] + "\t\t Region = " + schoolData[1] + "\t\t Type = " + schoolData[3] + "\t\t URL = " + schoolData[4]);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

}

