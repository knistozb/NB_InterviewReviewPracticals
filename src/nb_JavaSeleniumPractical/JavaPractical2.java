package nb_JavaSeleniumPractical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class JavaPractical2 {

	
	
	/*
	public static void main(String[] args) {

		JavaPractical2 nk = new JavaPractical2();
		nk.doesFileExist();

	}
	*/

	public static void main(String[] args) {

		String filePath = "src/FileFolder/examFile.properties";

		if (doesFileExist(filePath)) {
			System.out.println("Congrats, the file exists.\n");
			
			try {
				readAndPrintDictionary(filePath);
			} 
			catch (IOException e) {
				System.out.println("Error reading the file: " + e.getMessage());
			}
		} 
		else {
			System.out.println("File does not exist at the specified path.");
		}
	}

	private static boolean doesFileExist(String path) {
		try {
			FileReader fileReader = new FileReader(path);
			fileReader.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	private static void readAndPrintDictionary(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;

		while ((line = reader.readLine()) != null) {
			String[] parts = line.split("-");
			if (parts.length >= 2) {
				String word = parts[0].trim();
				String[] meanings = parts[1].split(",");
				System.out.println(word);
				for (String meaning : meanings) {
					System.out.println(meaning.trim());
				}
			}
		}

		reader.close();
	}

		
	/*
	public void doesFileExist() {

		// verifying the file is available in the given path
		File path = new File("src/FileFolder/examFile.properties");

		try {
			if (path.exists()) {
				System.out.println("File exists and is readable.");
			} else {
				System.out.println("Either the file is missing or not readable!!!");
			}

			System.out.println("======== =========== =========== ================= ========");

			InputStream input = new FileInputStream("src/FileFolder/examFile.properties");
			Properties prop = new Properties();
			prop.load(input);

			// Set<Object> objects = prop.keySet();

			
//			 * // print all keys and values prop.forEach((key, value) ->
//			 * System.out.println("Key : " + key + ", Value : " + value)); // Get/print all
//			 * keys only prop.keySet().forEach(x -> System.out.println(x));
			 

			System.out.println("Word1 = \n" + "Meaning1 = " + prop.getProperty("Apple"));
			System.out.println("Word2 = \n" + "Meaning1 = " + prop.getProperty("Table"));
			System.out.println("Word3 = \n" + "Meaning1 = " + prop.getProperty("Orange"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

}
