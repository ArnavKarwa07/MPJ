package Assignment_1;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private double[] marks;
    
    public Student(Scanner scanner, int studentNumber) {
        System.out.println("\n----- Student " + studentNumber + " -----");
        
        System.out.print("Enter Student Name: ");
        this.name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        this.rollNo = scanner.nextInt();
        
        this.marks = new double[5];
        System.out.println("\nEnter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            this.marks[i] = scanner.nextDouble();
        }
        
        scanner.nextLine();
    }
    
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    
    public char getGrade() {
        double average = calculateAverage();
        
        if (average >= 75) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else {
            return 'C';
        }
    }
    
    public double calculatePercentage() {
        return calculateAverage();
    }
    
    public void displayInfo() {
        System.out.println("\n===== Student Information =====");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("\nMarks in 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("\nAverage Marks: " + String.format("%.2f", calculateAverage()));
        System.out.println("Percentage: " + String.format("%.2f", calculatePercentage()) + "%");
        System.out.println("Grade: " + getGrade());
        System.out.println("===============================");
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public double[] getMarks() {
        return marks;
    }
}

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Student Grade Calculator =====\n");
        
        Student[] students = new Student[5];
        
        for (int s = 0; s < 5; s++) {
            students[s] = new Student(scanner, s + 1);
        }
        
        System.out.println("\n\n===== ALL STUDENTS INFORMATION =====");
        for (Student student : students) {
            student.displayInfo();
        }
        
        System.out.println("\n\n===== SUBJECT-WISE AVERAGES =====");
        for (int subject = 0; subject < 5; subject++) {
            double subjectTotal = 0;
            for (Student student : students) {
                subjectTotal += student.getMarks()[subject];
            }
            double subjectAverage = subjectTotal / 5;
            System.out.println("Subject " + (subject + 1) + " Average: " + String.format("%.2f", subjectAverage));
        }
        System.out.println("===================================");
        
        scanner.close();
    }
}
