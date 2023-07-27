package DesignPatterns.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesignPattern {
    public static void main(String[] args) throws InterruptedException {

        NetworkConnection networkConnection = new NetworkConnection();
        List<String>domains = new ArrayList<>();
        domains.add("www.google.com");
        domains.add("www.youtube.com");
        domains.add("www.instagram.com");
        domains.add("www.facebook.com");
        networkConnection.setDomains(domains);
        networkConnection.setIp("192.111.134.255");
        networkConnection.setData("Hie Filzaaa");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection1 = (NetworkConnection)networkConnection.clone();
            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection1);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
