package patterns.composite;

public class Worker implements Employee {

    private String name;
    private int happinessLevel;

    public Worker(String name, int happinessLevel) {
        this.name = name;
        this.happinessLevel = happinessLevel;
    }

    @Override
    public void showHappiness() {
        System.out.println(name + " has level - " + happinessLevel);
    }
}
