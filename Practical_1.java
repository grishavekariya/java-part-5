
import java.io.File;

public class Practical_1 
{
    public static void main(String[] args) 
    { 
        // creating new object of File class
        File f = new File("D:\\java part-5\\Practical_1.txt");

        // gives file name
        System.out.println("File name :" + f.getName()); 
        // gives file path
        System.out.println("Path: " + f.getPath()); 
        // gives absolute file path
        System.out.println("Absolute path:" + f.getAbsolutePath()); 
        // gives path of parent folder
        System.out.println("Parent:" + f.getParent()); 
        // checks if the file exists
        System.out.println("Exists:" + f.exists()); 
        if(f.exists()) 
        { 
            // checks if the file is writable
            System.out.println("Is writeable: " + f.canWrite()); 
            // checks if the file is readable
            System.out.println("Is readable: " + f.canRead()); 
            // checks if given path points to a directory
            System.out.println("Is a directory: " + f.isDirectory()); 
            // checks file size
            System.out.println("File Size in bytes: " + f.length()); 
        } 
        System.out.println("prepared by 21CE153_grisha");

    }
}
