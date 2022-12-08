public class Employee implements IEmployee {

    private String name;
    private String department;
    private String role;

    public Employee(String name, String department, String role) {
        this.name = name;
        this.department = department;
        this.role = role;
    }

    @Override
    public void getDetails() {
        System.out.println("** Name: " + name + " Role: " + role + " Department: " + department);
    }

    public String getName() {
        return name;
    }
}
