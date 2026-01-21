import java.util.Scanner;

class Student {
    // Private data members (access specifiers)
    private String name;
    private int rollNo;
    private double[] marks;
    
    // Constructor
    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    
    // Method to calculate average marks
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    
    // Method to determine grade based on average
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
    
    // Method to calculate percentage
    public double calculatePercentage() {
        return calculateAverage();
    }
    
    // Method to display student information
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
    
    // Getter methods
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
        
        // Taking student information
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        
        // Taking marks for 5 subjects
        double[] marks = new double[5];
        System.out.println("\nEnter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        
        // Creating Student object using constructor
        Student student = new Student(name, rollNo, marks);
        
        // Displaying student information
        student.displayInfo();
        
        scanner.close();
    }
}
