package Singleton;

public class Singleton {
    
    private static Singleton instance;
    private int count;

    private Singleton() {}

    public static Singleton getInstance(int initialValue) {
        if (instance == null) {
            instance = new Singleton();
            instance.setCount(initialValue);
        }
        return instance;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    
}