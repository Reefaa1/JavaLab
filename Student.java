import java.util.*;
class Mark extends Student{
    int marks [] = new int[5];
    int total;
    float average;
void readMarks() {
        Scanner sc = new Scanner(System.in);
        total = 0;
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = Integer.parseInt(sc.nextLine());
            total += marks[i];
        }
        average = total / 5.0f;
    }

    void displayMarks() {
        System.out.println("\nMarks Details:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i+1) + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
public class Student {
    String name;
    int age;
    int rollNo;
    String grade;
    Student() {}
    void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter roll number: ");
        rollNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter grade: ");
        grade = sc.nextLine();
    }
    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
 public static void main(String[] args) {
        Mark m = new Mark();  // create child object
        m.readDetails();            // read basic details
        m.readMarks();              // read marks and calculate
        m.displayDetails();         // display details
        m.displayMarks();           // display marks, total, average
    }
}
 