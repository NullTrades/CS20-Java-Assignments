package Assignments;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class ExternalFilesImport {
    //    https://www.kaggle.com/datasets/jacksonbarreto/higher-education-institutions-in-the-usa
//    https://www.javatpoint.com/how-to-read-csv-file-in-java

    private static ArrayList<String> fileImport = new ArrayList<>();

    public static void main(String[] args) {
        divider();
        dataReader();

        fileImport = dataReader("universityData.csv");
        System.out.println(fileImport.get(1));

    }

    //Used for importing dataset
    private static ArrayList<String> dataReader(String "universityData.csv") {
        ArrayList<String> temp = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("universityData.csv"));
            while(br.ready()) {
                temp.add(br.readLine());
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return temp;
    }

    private static void divider() {
        System.out.println("---------------");
    }

}
