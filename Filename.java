import java.io.*;
public class Filename {
    public static void main(String[] args) {
        try {
            File obj = new File("Filename.txt");
            if (obj.createNewFile()) {
                System.out.println("file created: " + obj.getName());

            } else {
                System.out.println("file already exists.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

// output--> file already exists.
