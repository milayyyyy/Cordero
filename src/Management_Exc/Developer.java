package Management_Exc;

public class Developer extends Employee {
    private Manager projectManager;

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
        projectManager = null;
    }

    public Manager getProjectManager() {
        return projectManager;
    }

    protected void setProjectManager(Manager projectManager) throws IllegalStateException{
        if (this.projectManager != null) {
            throw new IllegalStateException("This developer already has a project manager.");
        }
        this.projectManager = projectManager;
    }

    public void removePM() {
        projectManager = null;
    }

    @Override
    public void birthday() {
        super.birthday();
        if (projectManager != null) {
            projectManager.giveRaise(this, this.getSalary()*0.05);
        }
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is coding");
    }

    @Override
    public String toString() {
        if (projectManager != null) {
            return super.toString() + " [" + projectManager.getName() + "]";
        }
        return super.toString();
    }
}

