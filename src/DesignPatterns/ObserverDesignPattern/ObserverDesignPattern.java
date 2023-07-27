package DesignPatterns.ObserverDesignPattern;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        YoutubeChannel learnDSA = new YoutubeChannel();

        Subscriber sneha = new Subscriber("Sneha");
        Subscriber filza = new Subscriber("Filza");
        Subscriber rohit = new Subscriber("Rohit");
        learnDSA.subsribe(sneha);
        learnDSA.subsribe(filza);
        learnDSA.subsribe(rohit);
        learnDSA.newVideoUploaded("Learn Linked List");
    }
}
