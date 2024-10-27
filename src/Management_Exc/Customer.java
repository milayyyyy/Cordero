package Management_Exc;

public class Customer extends Person {

    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is browsing through");
    }

    public String speak(Employee e) {
        if (e instanceof Developer) {
            Developer dev = (Developer) e;
            if (this.getAge() > dev.getAge() && dev.getProjectManager() != null) {
                return "Can I see your manager " + dev.getProjectManager().getName() + "?";
            }
        }
        return "Hello " + e.getName() + ". I would like to discuss your services";
    }
}
