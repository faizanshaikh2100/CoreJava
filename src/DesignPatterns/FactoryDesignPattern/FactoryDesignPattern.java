package DesignPatterns.FactoryDesignPattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee.getSalary() );

    }
}