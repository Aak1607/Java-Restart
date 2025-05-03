package Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable("Hello"); // Handle null

        // Check if a value is present, else provide default value
        System.out.println(optionalValue.orElse("Default Value"));

        // Using ifPresent
        optionalValue.ifPresent(value -> System.out.println("Value exists: " + value));

    }
    
}
//Optional helps avoid NullPointerException and provides better handling of null values.
// It allows you to define default values and perform actions only if a value is present.
// This makes the code cleaner and more readable, reducing the risk of runtime errors.