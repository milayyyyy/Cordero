package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {

        super(name, age, salary);
    }


    public void giveRaise(Employee e, double raise) {
        if (raise < 0) {
            throw new IllegalArgumentException("Raise cannot be negative.");
        }
        double newSalary = e.getSalary() + raise;
        e.setSalary(newSalary);
        System.out.println(e.getName() + " has been given a raise of " + raise + ". New salary: " + newSalary);
    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}

