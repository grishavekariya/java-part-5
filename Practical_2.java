import java.io.*;

public class Practical_2
{
    public static void main(String[] args) throws IOException
    {
        
        FileReader sourceStream = null;
        try
        {
            sourceStream = new FileReader("D:\\java part-5\\Practical_2.txt");
            
            // reading from the file character by character
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.println((char)temp);
            }
                    
        }
        finally
        {           
                // closing stream 
                if (sourceStream != null)   
                {
                    sourceStream.close();
                }       
                                
        }
        System.out.println("prepared by 21CE153_grisha");
    }
}
