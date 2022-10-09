import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practical_3 
{
    public static void main(String[] args) throws IOException
    {
                
        // creating a file
        File f1 = new File("D:\\java part-5\\Practical_3.txt");
        f1.createNewFile();
                
        // creating an object for reading and writing the file
        FileInputStream input = new FileInputStream("D:\\java part-5\\Practical_3.txt");
        FileOutputStream output = new FileOutputStream("D:\\java part-5\\CopyPr3.txt");
        
        int temp;
        
        // copying from first file and writing in another file
        while((temp = input.read()) != -1) 
        {
            output.write((char) temp);
        }
        
        // closing both the files
        output.close();
        input.close();
       System.out.println("prepared by 21CE153_grisha");    
    } 


}

