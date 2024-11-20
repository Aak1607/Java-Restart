package Week1.EcceptionorSingleton;

 class Singleton { 
    // Static variable to hold the single instance 
    private static Singleton instance; 
    
    // Private constructor to prevent instantiation 
    private Singleton() {

    } 
    // Public method to provide access to the instance 
    public static Singleton getInstance() { 
        if (instance == null) {
             instance = new Singleton(); 
            } 
            return instance;
         } 
         public void showMessage() 
         { 
            System.out.println("Hello from Singleton!");
         }
         }

public class SingletonExample {
    public static void main(String[] args) { 
        // Get the single instance of Singleton 
        Singleton singleton = Singleton.getInstance(); 
        singleton.showMessage();
    
}
}
