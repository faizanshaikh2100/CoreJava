package DesignPatterns.ObserverDesignPattern;

public class Subscriber implements Observer{
    private  String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void notify(String title) {
        System.out.println("Hello "+this.name+" New Video uploaded : "+title.trim());
    }
}
