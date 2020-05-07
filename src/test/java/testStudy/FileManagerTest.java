package testStudy;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.Test;

class FileManagerTest {

	@Test
	void readFile() {
		File file = new File("school.txt");
		FileManager fileManager = new FileManager();
		
		
		assertThrows(FileNotFoundException.class, ()-> fileManager.readFile(file));
	}

}
