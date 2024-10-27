package Management_Exc;

public class Employee extends Person {
    private double salary;
    private static final double MINIMUM_SALARY = 30000;

    public Employee(String name, int age, double salary)  {
        super(name, age);
        if (salary < MINIMUM_SALARY) {
            throw new IllegalArgumentException("Salary must be at least " + MINIMUM_SALARY);
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < MINIMUM_SALARY) {
            throw new IllegalArgumentException("Salary must be at least " + MINIMUM_SALARY);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + salary;
    }

    @Override
    public void performTask() {

        System.out.println(getName() + " is working");
    }
}
