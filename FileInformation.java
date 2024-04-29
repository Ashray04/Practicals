import java.io.File;
import java.io.FileNotFoundException;
public class FileInformation {
    public static void main(String args[]){
        File abc = new File("Filename.txt");
        if(abc.exists()){
            System.out.println("file name: "+ abc.getName());
            System.out.println("Absolute path is: "+abc.getAbsolutePath());
            System.out.println("Readable: "+abc.canRead());
            System.out.println("Writeable: "+abc.canWrite());
            System.out.println("File size is: "+abc.length());
        }
        else{
            System.out.println("File not Found");
        }
    }
}
// output-->
// file name: Filename.txt
// Absolute path is: c:\Users\diksh\OneDrive\Desktop\JAVA_HOME-TO-PRACTICE\Filename.txt
// Readable: true 
// Writeable: true
// File size is: 0
