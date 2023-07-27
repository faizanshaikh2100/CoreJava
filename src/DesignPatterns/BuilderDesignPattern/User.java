package DesignPatterns.BuilderDesignPattern;

public class User {
    private final String name;
    private final int age;
    private final String email;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public User(UserBuilder userBuilder){
        this.name=userBuilder.name;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    static class UserBuilder{
        private  String name;
        private  int age;
        private  String email;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;

        }
        public User build(){
            User user = new User(this);
            return user;
        }

    }
}
