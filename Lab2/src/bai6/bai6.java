package bai6;

public class bai6 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, 5000.0);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
        employee.addSalary();
        System.out.println("Salary after adding 10%: " + employee.getSalary());
        employee.addSalary(1000.0);
        System.out.println("Salary after adding 1000: " + employee.getSalary());
    }
    
}
