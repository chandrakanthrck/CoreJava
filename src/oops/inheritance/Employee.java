package oops.inheritance;

public class Employee extends Person {
    String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Job Title: " + jobTitle);
    }
}