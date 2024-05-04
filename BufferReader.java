import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        try {
            String name = reader.readLine();
            System.out.println("Hello, " + name + "!");
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading from input.");
            e.getMessage();
        }
    }
}
