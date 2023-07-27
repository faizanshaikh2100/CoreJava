package DesignPatterns.AbstractDesignPattern;

public class AndriodDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("Getting android developer salary");
        return 50000;
    }

    @Override
    public String name() {
        return null;
    }
}
