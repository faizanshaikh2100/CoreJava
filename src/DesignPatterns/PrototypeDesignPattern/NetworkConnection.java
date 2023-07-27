package DesignPatterns.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String data;
    private List<String>domains= new ArrayList<>();


    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

    public void loadImportantData() throws InterruptedException {
       System.out.println("Slow loading method");
       Thread.sleep(5000);
   }
   public Object clone() throws CloneNotSupportedException {
        //1.Shallow copy
        //return super.clone();

       //2.Deep copy
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());
        for(String domain:this.getDomains()){
              networkConnection.getDomains().add(domain);
        }
        return networkConnection;
   }
}
