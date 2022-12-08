import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        IEmployee employee1 = new Employee("Venu", "ZSTDEV", "SSD");
        IEmployee employee2 = new Employee("Devang", "ZSTDEV", "SD");
        IEmployee employee3 = new Employee("Haseeb", "ZSTDEV", "SD");
        IEmployee employee4 = new Employee("Nikhil", "Chem", "SD");
        IEmployee employee5 = new Employee("Pardha", "Chem", "QA");
        IEmployee manager1 = new Manager("Yamini", "ZSTDEV", "Manager",
                Arrays.asList(employee1, employee2, employee3));
        IEmployee manager2 = new Manager("Bala", "Chem", "Manager",
                Arrays.asList(employee4, employee5));
        IEmployee head = new Manager("Sudhir", "Zemoso", "Co-founder",
                Arrays.asList(manager1, manager2));

        manager1.getDetails();
        System.out.println("-----------------------------------------");
        manager2.getDetails();
        System.out.println("-----------------------------------------");
        head.getDetails();
    }
}
