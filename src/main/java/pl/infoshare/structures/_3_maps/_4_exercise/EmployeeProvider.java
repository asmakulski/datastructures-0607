package pl.infoshare.structures._3_maps._4_exercise;

import java.util.Arrays;
import java.util.List;

public class EmployeeProvider {

    public List<Employee> getEmployees() {
        return Arrays.asList(
            createEmployee("Allen", 1000, "Lizzy", 74),
            createEmployee("Vi", 1200, "Josephine", 22),
            createEmployee("Jaci", 9000, "Lizzy", 74),
            createEmployee("Letha", 2000, "Will", 38),
            createEmployee("Kristy",1500, "Josephine", 22),
            createEmployee("Aaron",3200, "Josephine", 22),
            createEmployee( "Tyler",900, "Lizzy", 74),
            createEmployee( "Eula",1800, "Josephine", 22),
            createEmployee( "Christen", 4300, "Will", 38)
        );
    }

    private Employee createEmployee(String name, Integer salary, String managerName, Integer age) {
        return new Employee(name, new Manager(managerName, age), salary);
    }
}
