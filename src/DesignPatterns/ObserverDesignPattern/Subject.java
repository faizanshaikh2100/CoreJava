package DesignPatterns.ObserverDesignPattern;

public interface Subject {
    void subsribe(Observer observer);
    void unsubscribe(Observer observer);
    void newVideoUploaded(String title);
}
