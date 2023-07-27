package DesignPatterns.SingletonDesignPattern;

import java.io.Serializable;

//1.Lazy instantiation
class Samosa implements Serializable, Cloneable {
    public static Samosa samosa;

    private Samosa() {

//        if (samosa != null) throw new RuntimeException("Already created samosa");
    }

    // isko 2 threads ek sath initialize na krde isliye synchronized keyword use hoga
    public static Samosa getInstance() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    public Object clone() throws CloneNotSupportedException {
//        return super.clone();//to  do cloning
        return samosa;//to avoid cloning same hi object return krdiya
    }

    //to avoid creation of new object by serialization and deserialization
    public Object readResolve() {
        return samosa;
    }
}
