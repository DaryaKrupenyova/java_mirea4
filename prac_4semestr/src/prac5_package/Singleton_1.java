package prac5_package;

public class Singleton_1 {
    private static final Singleton_1 instance = new Singleton_1();

    private Singleton_1() {}

    public static Singleton_1 getInstance() {
        return instance;
    }
}
