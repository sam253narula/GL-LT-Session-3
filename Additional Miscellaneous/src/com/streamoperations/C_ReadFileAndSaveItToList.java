package com.streamoperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
// Demo lines in the file are read in random order when we use parallel stream
public class C_ReadFileAndSaveItToList {

	public static void main(String[] args) throws IOException {
		 // Create a File object
        File fileName = new File("C://Users//Samrth Narula//Documents//List_Textfile.txt");
  
        // Create a List
        // Using readAllLines() read the lines of the text file
        List<String> text = Files.readAllLines(fileName.toPath());
          
        // Using parallelStream() to create parallel streams
        text.parallelStream().forEach(System.out::println);
	}
}
