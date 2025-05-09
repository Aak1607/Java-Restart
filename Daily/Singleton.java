// Thread-Safe Singleton
public class Singleton {
    // Private static instance
    private static Singleton instance;
    
    // Private constructor to prevent instantiation
    private Singleton() {}
    
    // Public method to provide access to the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        singleton1.showMessage();

        System.out.println(singleton1 == singleton2);  // true (same instance)
    }
}