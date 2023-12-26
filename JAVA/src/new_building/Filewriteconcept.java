package new_building;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriteconcept {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\demo\\Desktop\\Appu\\Akash.txt");
		FileWriter fw=new FileWriter(f,true);
		fw.write("Ramya\n");
		fw.write("abc");
		fw.flush();
		fw.close();
		System.out.println("done");
	}

}
