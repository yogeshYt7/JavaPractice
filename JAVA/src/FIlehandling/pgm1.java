package FIlehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class pgm1 {
	public static void main(String[] args) throws IOException 
	{
		File f= new File("C:\\Users\\talar\\Desktop\\JDBC\\Filereaderclass.txt");
		FileWriter fw=new FileWriter(f, true);
		fw.write("I am yogesh yt");
		fw.flush();
		fw.close();
		System.out.println("Succesfully Done");
	}

}
