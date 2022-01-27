package application;
import java.io.*;
import java.io.IOException;
import java.nio.file.*;

public class DeleteFile {

public static String path;
public DeleteFile(String path) {
	this.path=path;
}

public static void delete() {
	
	try {
		Files.deleteIfExists(
			Paths.get(path));
	}
	catch (NoSuchFileException e) {
		System.out.println(
			"No such file/directory exists");
	}
	catch (DirectoryNotEmptyException e) {
		System.out.println("Directory is not empty.");
	}
	catch (IOException e) {
		System.out.println("Invalid permissions.");
	}

	System.out.println("Deletion successful.");
}
			


//public static void main(String[] args ) {
//	DeleteFile df= new DeleteFile("C:\\Users\\anurag singh\\eclipse-workspace\\application\\src\\data\\file9.txt");
//	df.delete();
//}
}


//Java program to demonstrate delete using Files class



