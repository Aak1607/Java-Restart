package Week1.EcceptionorSingleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptiontypes {
    public static void main(String[] args) { 
        try { 
            // Checked exception example 
            readFromFile("file.txt"); 
            } catch (IOException e) { 
                System.out.println("IOException caught: " + e.getMessage()); 
            } try { 
                // Unchecked exception example 
                int result = divide(10, 0); 
                System.out.println("Result: " + result); 
            } catch (ArithmeticException e) { 
                System.out.println("ArithmeticException caught: " + e.getMessage()); 
            }
        }

        // Method that throws a checked exception 
        public static void readFromFile(String fileName) throws IOException { 
            BufferedReader reader = new BufferedReader(new FileReader(fileName)); 
            String line = reader.readLine(); 
            System.out.println(line); 
            reader.close(); 
        } 
        // Method that throws an unchecked exception 
        public static int divide(int a, int b) { 
            return a / b; 
        }
    
}
