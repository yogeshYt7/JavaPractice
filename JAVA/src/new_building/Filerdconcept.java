package new_building;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filerdconcept {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\demo\\Desktop\\Appu\\Akash.txt");
		FileReader fr =new FileReader(f);
		char[] arr=new char[(int) f.length()];
		fr.read(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}

