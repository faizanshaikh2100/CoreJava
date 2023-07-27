package DesignPatterns.AbstractDesignPattern;

public class AbstractDesignPattern {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee.getSalary());

    }
}
