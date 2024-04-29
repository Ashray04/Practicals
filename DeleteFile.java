import java.io.File;
public class DeleteFile {
    public static void main(String args[]){
        File obj = new File("filename.txt");
        if(obj.delete()){
            System.out.println("deleted file name: "+obj.getName());
        }
        else{
            System.out.println("Failed to delete the File.");
        }
    }
}
// output--> deleted file name: filename.txt
