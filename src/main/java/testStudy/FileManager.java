package testStudy;

import java.io.*;
import java.util.Scanner;

public class FileManager{
	
	public boolean checkFileExists(File myFile) throws IOException{
		if(myFile.exists()) {
			System.out.println("File already exists");
			return true;
		}
		myFile.createNewFile();
		return false;
	}
	
	public void writeData(File myFile, String input) throws IOException {
		FileWriter writer = new FileWriter(myFile);
		writer.append(input);
		writer.close();
	}
	
	public void readFile(File myFile) throws FileNotFoundException{
		Scanner reader = new Scanner(myFile);
		while(reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
		
		reader.close();
	}

}
