package Week1.EcceptionorSingleton;

public class ExceptionPropagationExample {
    
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        } finally {
            System.out.println("Finally block in main executed.");
        }
    }

    public static void methodA() throws Exception {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Exception caught in methodA: " + e.getMessage());
            throw e;  // Propagate the exception to the caller
        } finally {
            System.out.println("Finally block in methodA executed.");
        }
    }

    public static void methodB() throws Exception {
        try {
            methodC();
        } catch (Exception e) {
            System.out.println("Exception caught in methodB: " + e.getMessage());
            throw e;  // Propagate the exception to the caller
        } finally {
            System.out.println("Finally block in methodB executed.");
        }
    }

    public static void methodC() throws Exception {
        try {
            throw new Exception("Exception in methodC");
        } finally {
            System.out.println("Finally block in methodC executed.");
        }
    }
}

