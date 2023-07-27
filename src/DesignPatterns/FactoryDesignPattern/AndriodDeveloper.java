package DesignPatterns.FactoryDesignPattern;

public class AndriodDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("Getting android developer salary");
        return 50000;
    }
}
