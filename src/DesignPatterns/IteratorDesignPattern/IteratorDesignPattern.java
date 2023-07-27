package DesignPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorDesignPattern {
    public static void main(String[] args) {
        List<User>userList = new ArrayList<>();

        userList.add(new User("Filza",1));
        userList.add(new User("Sneha",2));
        userList.add(new User("Faizan",3));
        userList.add(new User("Rohit",4));

        MyIterator iterator = new MyIterator(userList);
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
