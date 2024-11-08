package guviTask6;

public class Employee {
    // Private attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Method to get full name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary by a specified percentage
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}
