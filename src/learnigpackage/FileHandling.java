package learnigpackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		File file = new File("D:\\testing\\testing.txt");
		FileWriter writeInfile;
		Scanner read;
		try {
			file.createNewFile();
			writeInfile = new FileWriter("D:\\testing\\testing.txt");
			writeInfile.write("hello akshay i have done");
			writeInfile.close();
			
			
			read = new Scanner(file);
			
			while(read.hasNextLine()) {
				String Line = read.nextLine();
				System.out.println(Line);
			}
			read.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
