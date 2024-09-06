package oops.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setId(101);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
    }
}
