package new_building;
import java.io.File;
import java.io.IOException;
public class FilehandlingConcept {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\demo\\Desktop\\Appuboss");
		f.delete();
		System.out.println("folder deleted");
	}

}
