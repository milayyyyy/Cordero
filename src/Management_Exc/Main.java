package Management_Exc;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {
        Person mgr = findPersonByName(persons, manager);
        Person emp = findPersonByName(persons, employee);

        if (!(mgr instanceof Manager)) {
            throw new ClassCastException(manager + " is not a manager.");
        }
        if (!(emp instanceof Employee)) {
            throw new ClassCastException(employee + " is not an employee.");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary increase must be greater than zero.");
        }

        ((Manager) mgr).giveRaise((Employee) emp, salary);
    }


    public static void assignPM(List<Person> persons, String developer, String manager) {
        Person dev = findPersonByName(persons, developer);
        Person mgr = findPersonByName(persons, manager);

        if (!(dev instanceof Developer)) {
            throw new ClassCastException(developer + " is not a developer");
        }
        if (!(mgr instanceof Manager)) {
            throw new ClassCastException(manager + " is not a manager");
        }

        ((Developer) dev).setProjectManager((Manager) mgr);
    }


    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        Person cust = findPersonByName(persons, customer);
        Person emp = findPersonByName(persons, employee);

        if (!(cust instanceof Customer)) {
            throw new ClassCastException(customer + " is not a customer");
        }
        if (!(emp instanceof Employee)) {
            throw new ClassCastException(employee + " is not an employee");
        }

        // Assuming the customer speaks a standard greeting; modify as needed.
        return cust.getName() + ": Hello " + emp.getName() + ", I would like to discuss your services";
    }

    private static Person findPersonByName(List<Person> persons, String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        throw new NoSuchElementException("No person found with name: " + name);
    }
}
