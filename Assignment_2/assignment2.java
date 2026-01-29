package Assignment_2;
// Base class Employee
class Employee {
    protected String name;
    protected int employeeId;
    protected double baseSalary;
    
    public Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }
    
    public void DisplaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Current Salary: $" + baseSalary);
    }
}

class FullTimeEmployee extends Employee {
    private double hikedSalary;
    
    public FullTimeEmployee(String name, int employeeId, double baseSalary) {
        super(name, employeeId, baseSalary);
    }
    
    public void CalculateSalary() {
        hikedSalary = baseSalary + (baseSalary * 0.50);
        System.out.println("\n--- Full-Time Employee Details ---");
        System.out.println("Salary before hike: $" + baseSalary);
        System.out.println("Hike Percentage: 50%");
        System.out.println("Salary after hike: $" + hikedSalary);
    }
}

class InternEmployee extends Employee {
    private double hikedSalary;
    
    public InternEmployee(String name, int employeeId, double baseSalary) {
        super(name, employeeId, baseSalary);
    }
    
    public void CalculateSalary() {
        hikedSalary = baseSalary + (baseSalary * 0.25);
        System.out.println("\n--- Intern Employee Details ---");
        System.out.println("Salary before hike: $" + baseSalary);
        System.out.println("Hike Percentage: 25%");
        System.out.println("Salary after hike: $" + hikedSalary);
    }
}

public class assignment2 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("John Smith", 101, 50000);
        fullTimeEmp.DisplaySalary();
        fullTimeEmp.CalculateSalary();
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        InternEmployee internEmp = new InternEmployee("Sarah Johnson", 201, 20000);
        internEmp.DisplaySalary();
        internEmp.CalculateSalary();
    }
}
