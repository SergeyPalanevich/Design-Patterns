package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Employee {

    private String name;
    private int happinessLevel;
    private List<Employee> subordinates = new ArrayList<Employee>();

    public Supervisor(String name, int happinessLevel) {
        this.name = name;
        this.happinessLevel = happinessLevel;
    }

    public void addSubordinates(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void showHappiness() {
        System.out.println(name + " has level - " + happinessLevel);
        for (Employee e : subordinates) {
            e.showHappiness();
        }
    }
}
