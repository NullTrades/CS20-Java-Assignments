package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

//import static java.util.Collections.addAll;

public class gradebook {
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Integer> gradeNum = new ArrayList<>();
    private static ArrayList<Double> exam1 = new ArrayList<>();
    private static ArrayList<Double> exam2 = new ArrayList<>();
    private static ArrayList<Double> exam3 = new ArrayList<>();

    public static void main(String[] args) {
        names.addAll(Arrays.asList("Dilshaan", "Chelsea", "Daniel", "Damien", "John", "Dhvanay"));
        gradeNum.addAll(Arrays.asList(10, 10, 11, 11, 12, 12));
        exam1.addAll(Arrays.asList(67.0, 38.0, 79.0, 27.0, 87.0, 32.0));
        exam2.addAll(Arrays.asList(83.0, 87.0, 90.0, 50.0, 72.0, 56.0));
        exam3.addAll(Arrays.asList(92.0, 67.0, 100.0, 56.0, 90.0, 97.0));
        System.out.printf("/*********************Attending Students***********/ %n");
        printStudentResults();
        giveBonusMarks();
        printUpdatedMarks();
        printNonSeniors();
        printExam1Failures();
        classAverages();
        extraChallenge();

    }

    private static double roundNumber(double value) {
        // create a rounding method

        double a = ((Math.round(value)) * 100.0) / 100.0;
        return a;
    }

    private static double avg(double a, double b, double c, int extent) {
        double r = (a + b + c)/extent;
        return r;
    }

    private static void printStudentResults() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + "  " + gradeNum.get(i) + " \t\t" + exam1.get(i) + " " + exam2.get(i) + " " + exam3.get(i));
        }
    }

    private static void giveBonusMarks() {
        for (int i = 0; i < names.size(); i++) {
            exam3.set(i, exam3.get(i) + ((int) (Math.random() * 8) + 1));
        }
        for (int i = 0; i < names.size(); i++) {
            exam1.set(i, exam1.get(i) + 3.5);
        }
    }

    private static void printUpdatedMarks() {
        System.out.printf("/*********************Updated Exam 3 Marks***********/ %n");
        printStudentResults();
    }

    private static void printNonSeniors() {
        System.out.printf("/*********************Filtered Print - Grade 10s and 11s***********/ %n");
        for (int i = 0; i < names.size(); i++) {
            if (gradeNum.get(i) != 12) {
                System.out.println(names.get(i) + "\t\t" + gradeNum.get(i));
            }
        }

    }

    private static void printExam1Failures() {
        System.out.printf("/*********************Filtered Print - Exam 1 failures***********/ %n");
        for (int i = 0; i < names.size(); i++) {
            if (exam1.get(i) < 50) {
                System.out.println(names.get(i) + "\t\t" + exam1.get(i));
            }
        }
    }

    private static void classAverages() {
        System.out.printf("/*********************Class Averages - Final 20%%*********************/ %n");

        double classAvg1 = 0;
        double classAvg2 = 0;
        double classAvg3 = 0;

        //modularize this
        for (int i = 0; i < names.size(); i++) {
            classAvg1 = classAvg1 + exam1.get(i);
        }
        double averageExam1 = roundNumber((classAvg1 / exam1.size()));
        System.out.println("Exam 1 Average: " + averageExam1);

        for (int i = 0; i < names.size(); i++) {
            classAvg2 = classAvg2 + exam2.get(i);
        }
        double averageExam2 = roundNumber((classAvg2 / exam2.size()));
        System.out.println("Exam 2 Average: " + averageExam2);

        for (int i = 0; i < names.size(); i++) {
            classAvg3 = classAvg3 + exam3.get(i);
        }
        double averageExam3 = roundNumber((classAvg3 / exam3.size()));
        System.out.println("Exam 3 Average: " + averageExam3);

    }

    private static void extraChallenge() {
        System.out.printf("/*********************Extra Challenges***********/ %n");
        //Dilshaan
//        double meanGrade = roundNumber((exam1.get(0) + exam2.get(0) + exam3.get(0)) / 3);

        for (int i = 0; i < names.size(); i++) {
            double meanGrade = roundNumber(avg(exam1.get(i), exam2.get(i), exam3.get(i), 3));
            System.out.println(names.get(i) + "'s average is: " + meanGrade);
        }
    }
}
