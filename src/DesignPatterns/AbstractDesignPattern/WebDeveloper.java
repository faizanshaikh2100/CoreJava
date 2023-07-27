package DesignPatterns.AbstractDesignPattern;

public class WebDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("Getting web developer salary");
        return 40000;
    }

    @Override
    public String name() {
        return null;
    }
}
