import java.util.List;

public class Manager implements IEmployee {
    private Employee employee;
    private List<IEmployee> teamMembers;

    public Manager(String name, String department, String role, List<IEmployee> teamMembers) {
        this.employee = new Employee(name, department, role);
        this.teamMembers = teamMembers;
    }

    @Override
    public void getDetails() {
        this.employee.getDetails();
        System.out.println("Team " + employee.getName() + ":- ");
        teamMembers.forEach((emplyee) -> emplyee.getDetails());
    }
}
