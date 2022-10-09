import java.io.*;

public class ByteStream
{
    public static void main(String[] args) throws IOException
    {    
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try
        {
            sourceStream = new FileInputStream("D:\\java part-5\\Practical_2.txt");
            targetStream = new FileOutputStream ("D:\\java part-5\\ByteStreamPr2.txt");

            // reading from character.txt and writing into byte.txt and printing the byte in the program
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.println((byte)temp);
                targetStream.write((byte)temp);
            }
                                
        }
        finally
        {
            //closing the file if it is null
            if (sourceStream != null)
            {
                sourceStream.close();   
            }
                        
            if (targetStream != null)   
            {
                targetStream.close();           
            }       
        } 
        System.out.println("prepared by 21CE153_grisha");  
    }
    
}


