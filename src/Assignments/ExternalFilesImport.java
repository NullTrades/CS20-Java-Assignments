package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExternalFilesImport {

    private static ArrayList<Integer> schoolID = new ArrayList<>();
    private static ArrayList<String> schoolRegion = new ArrayList<>();
    private static ArrayList<String> schoolName = new ArrayList<>();
    private static ArrayList<String> schoolCategory = new ArrayList<>();

    //https://www.kaggle.com/datasets/jacksonbarreto/higher-education-institutions-in-the-usa
    //https://www.javatpoint.com/how-to-read-csv-file-in-java
    //https://stackoverflow.com/questions/1505311/how-can-i-clean-up-misaligned-columns-in-text
    public static void main(String[] args)  {

        String line = "";

        try {
            //BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("src\\universityData.csv"));

            //Skips the first line (header information) in the .csv file
            line = br.readLine();

            while((line = br.readLine()) != null) { // returns a Boolean Value
                String[] schoolData = line.split(",");

                schoolID.add(Integer.valueOf(schoolData[0])); // add first element to schoolId and other lists
                schoolRegion.add(schoolData[1]); //Add second element to schoolName lists
                schoolName.add(schoolData[2]);
                schoolCategory.add(schoolData[3]);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(schoolID);
        System.out.println(schoolRegion);
        System.out.println(schoolName);
        System.out.println(schoolCategory);

    }

}
