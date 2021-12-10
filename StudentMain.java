/*
Develop a Java program to create a class Student with members usn, name, an array 
credits and an array marks. Include methods to accept and display details and a
method to calculate SGPA of a student.
*/

import java.util.Scanner;
class Student {
    private String name;
    private String USN;
    private int n;
    private double SGPA = 0;
    private int total_credits = 0;
    private int credits[];
    private double marks[];
    Scanner in = new Scanner(System.in);

    void accept() {
        System.out.println("Enter full name of the student: ");
        
        name = in.nextLine();
        System.out.println("Enter USN of the student: ");
        USN = in.nextLine();
        System.out.println("Enter the number of subjects: ");
        n = in.nextInt();
        in.nextLine();
        credits = new int[n];
        marks = new double[n];
        System.out.println("Enter the details of the subjects: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the credits for subject " + (i + 1));
            credits[i] = in.nextInt();
            in.nextLine();
            System.out.println("Enter the marks for the subject " + (i + 1));
            marks[i] = in.nextInt();
            in.nextLine();
            calculate(credits[i], marks[i], i);
        }
    }
    void calculate(int credit, double marks, int j){
        total_credits = total_credits +credit;
        if(marks >= 90 && marks <= 100)
            SGPA += 10*credit;
        else if(marks >= 80 && marks < 90)
            SGPA += 9*credit;
        else if(marks >= 70 && marks < 80)
            SGPA += 8*credit;
        else if(marks >= 60 && marks < 70)
            SGPA += 7*credit;
        else if(marks >= 50 && marks < 60)
            SGPA += 6*credit;
        else
            System.out.println("Failed in the subject: "+(j+1));
    }
    void display(){
        System.out.println("Details of the student: ");
        System.out.println("USN: "+USN);
        System.out.println("Name: "+name);
        System.out.println("SPGA of student: "+(SGPA/total_credits));
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.accept();
        s1.display();
    }
}
