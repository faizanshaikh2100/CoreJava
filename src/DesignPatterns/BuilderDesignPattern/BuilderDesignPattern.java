package DesignPatterns.BuilderDesignPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        User u = new User.UserBuilder().setAge(21).setName("Filzaaa").build();
        User u2 = new User.UserBuilder().setAge(22).setEmail("senha123@gmail.com").setName("Snehaaa").build();

        System.out.println(u.toString());
        System.out.println(u2.toString());
    }
}
