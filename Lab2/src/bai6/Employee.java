package bai6;

public class Employee extends Person{
    private double salary;


    public Employee(String string, int i, double d) {
        setName(string);
        setAge(i);
        setSalary(d);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void show() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
    }

    public void addSalary() {
        salary = salary * 1.1;
    }

    public void addSalary(double amount) {
        salary += amount;
    }
}
