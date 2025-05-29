package DesignPattern;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
        // Constructor privat pentru a preveni instantierea din afara clasei
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");

    }

}
