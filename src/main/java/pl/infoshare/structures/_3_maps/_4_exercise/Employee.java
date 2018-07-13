package pl.infoshare.structures._3_maps._4_exercise;

public class Employee {

    private final String name;
    private final Manager manager;
    private final Integer salary;

    public Employee(String name, Manager manager, Integer salary) {
        this.name = name;
        this.manager = manager;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public Integer getSalary() {
        return salary;
    }
}
