import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String args[]){
    try{
        FileWriter writ = new FileWriter("Filename.txt");
        writ.write("i am student at sggs Nanded college.");
        writ.close();
        System.out.println("written Successfully inside the file.");
    }
    catch(IOException e){
        e.getMessage();
    }
    }
}
// output-->written Successfully inside the file.
