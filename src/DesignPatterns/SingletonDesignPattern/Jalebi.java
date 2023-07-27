package DesignPatterns.SingletonDesignPattern;

//2.Eager instantiation
class Jalebi {
    //as ye variable static hai toh jaise class load hoga ye initialize ho jyga

    public static Jalebi jalebi = new Jalebi();

    private Jalebi() {

    }

    public static Jalebi getInstance() {
        return jalebi;
    }
}
