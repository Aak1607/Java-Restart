package Base64;

public class Base64Example {
    public static void main(String[] args) {
        String originalInput = "Hello, World!";
        System.out.println("Original Input: " + originalInput);

        // Encode the string
        String encodedString = java.util.Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("Encoded String: " + encodedString);

        // Decode the string
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded String: " + decodedString);
    }
    
}
//Java 8 introduced the java.util.Base64 class for encoding and decoding data, useful for secure transmissions like passwords, images, and cryptographic keys.
// The example demonstrates encoding a string to Base64 and decoding it back to the original string.