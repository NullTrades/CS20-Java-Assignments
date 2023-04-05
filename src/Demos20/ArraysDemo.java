package Demos20;

import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {

        int studentID[] = {10001, 11111, 12221, 13331, 14441, 15551, 16661, 17771, 18881, 19991};
        double finalGPA[] = {3.02, 2.76, 2.93, 3.04, 2.76, 2.86, 2.87, 2.86, 3.08, 3.02};
        System.out.println("Enter a student ID number: ");
        Scanner reqStudent = new Scanner(System.in);
        int studentIDValue = reqStudent.nextInt();

        for(int i = 0; i < studentID.length; i++){
            if(studentIDValue == studentID[i]){
                System.out.println("Student ID: " + studentID[i] + " has a final GPA of " + finalGPA[i]);
            }
        }

//

    }
}
