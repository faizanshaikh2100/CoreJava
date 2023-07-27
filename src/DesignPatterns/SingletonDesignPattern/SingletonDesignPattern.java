package DesignPatterns.SingletonDesignPattern;

public class SingletonDesignPattern {
    public static void main(String[] args) throws Exception {
        Samosa samosa1 = Samosa.getInstance();
        Samosa samosa2 = Samosa.getInstance();
        System.out.println(samosa1.hashCode());
        System.out.println(samosa2.hashCode());

        Jalebi jalebi = Jalebi.getInstance();
        Jalebi jalebi1 = Jalebi.getInstance();
        System.out.println(jalebi1.hashCode());
        System.out.println(jalebi.hashCode());

        //ways to break singleton pattern
        // Method 1.Using reflection api
        //Constructor<DesignPatterns.SingletonDesignPattern.Samosa> constructor = DesignPatterns.SingletonDesignPattern.Samosa.class.getDeclaredConstructor();
        //constructor.setAccessible(true);
        //DesignPatterns.SingletonDesignPattern.Samosa samosa3 = constructor.newInstance();
        //System.out.println(samosa3.hashCode());

        //Method 2.Using Serialization & Deserialization
        //Serialization
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream ("abc.ob"));
        //oos.writeObject(samosa1);
        //Deserialization
        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        //samosa1 = (DesignPatterns.SingletonDesignPattern.Samosa)ois.readObject();
        //ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("abc.ob"));
        //samosa2 = (DesignPatterns.SingletonDesignPattern.Samosa)ois2.readObject();
        //System.out.println(samosa1.hashCode());
        //System.out.println(samosa2.hashCode());

        //Method 3:Using cloning
        //DesignPatterns.SingletonDesignPattern.Samosa s = (DesignPatterns.SingletonDesignPattern.Samosa) samosa1.clone();
        //System.out.println(s.hashCode());


    }


}