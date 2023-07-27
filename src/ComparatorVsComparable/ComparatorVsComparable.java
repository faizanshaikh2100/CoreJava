package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorVsComparable {
    public static void main(String[] args) {

        ArrayList<Employee>emp = new ArrayList<>();
        emp.add(new Employee(12,"Filzaaa","9876548932"));
        emp.add(new Employee(2,"Snehaaa","8329617898"));
        emp.add(new Employee(21,"Faizan","9679208291"));

        Collections.sort(emp, Comparator.comparing(Employee::getName));
        System.out.println(emp);
//        ArrayList<Employee>emp2 = new ArrayList<>(emp);
//        Collections.sort(emp2,new NameComparator());
//        System.out.println(emp2);

        //comparable
    }
}
