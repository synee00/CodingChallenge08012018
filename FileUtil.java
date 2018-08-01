package co.grandcircus.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO Replace all the `Object` types with the type you're reading & writing.
public class FileUtil {
	
	// The path to the file to use
	public static final String FILE_NAME = "myfile.txt";
	
	// Modify this method as necessary to convert a line of text from the file to a new item instance
	private static Object convertLineToItem(String line) {
		// TODO Fill in this method
		return null;
	}
	
	// Modify this method as necessary to convert an item instance to a line of text in the file
	private static String convertItemToLine(Object item) {
		// TODO Fill in this method
		return null;
	}
	
	public static List<Object> readFile() {
		List<Object> items = new ArrayList<>();
		
		try (
			// Open/prepare the resources in the try resources block
			FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
			Scanner fileScanner = new Scanner(fileInputStream)
		) {
			// loop until the end of the file
			while (fileScanner.hasNextLine()) {
				// read each line as a string
				String line = fileScanner.nextLine();
				// then convert it to an object
				items.add( convertLineToItem(line) );
			}
			
		} catch (FileNotFoundException ex) {
			// If the file doesn't exist, there just aren't any items.
			return items;
		} catch (IOException e) {
			// If something else crazy goes wrong, print out the error.
			System.err.println("Something unexpected happended.");
			e.printStackTrace();
		}
		
		// Finally return the array of items.
		return items;
	}
	
	public static void appendLine(Object item) {
		// convert object to a string line of text to be written to the file
		String line = convertItemToLine(item);
		
		try (
			// The `true` here tells the FileOutputStream to append to the file rather than overwriting it
			FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME, true);
			PrintWriter fileWriter = new PrintWriter(fileOutputStream);
		) {
			// write to the file
			fileWriter.println(line);
			
		} catch (IOException e) {
			// If something else crazy goes wrong, print out the error.
			System.err.println("Something unexpected happended.");
			e.printStackTrace();
		}
	}
	
	public static void writeFile(List<Object> items) {
		try (
			// The `false` here tells the FileOutputStream to overwrite the file, rather than append to it
			FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME, false);
			PrintWriter fileWriter = new PrintWriter(fileOutputStream);
		) {
			// write to the file
			for (Object item : items) {
				// each item must be converted to a string of text to write to the file
				String line = convertItemToLine(item);
				fileWriter.println(line);
			}
			
		} catch (IOException e) {
			// If something else crazy goes wrong, print out the error.
			System.err.println("Something unexpected happended.");
			e.printStackTrace();
		}
	}
	
	public static void createDirectory(String pathName) {
		Path path = Paths.get(pathName);
		if (Files.notExists(path)) {
			try {
				Files.createDirectories(path);
				System.out.println("Directory created at " + path.toAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void createBlankFile(String pathName) {
		Path path = Paths.get(pathName);
		if (Files.notExists(path)) {
			try {
				Files.createFile(path);
				System.out.println("File created at " + path.toAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}