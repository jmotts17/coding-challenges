/*
 * An exercise based on chapter 1, Cracking the Oyster, of Programming Pearls by Jon Bentley
 * A system used for political redistricting reads in files that correspond to political districts. 
 * The contents of the files are integers representing precincts. The range of precinct numbers if from 1 to 27000. 
 * No precinct number can appear twice in the same district.
 * The program reads in the numbers, sorts them, and then prints them out in numeric order.
 * However, due to memory constraints, only 1000 integers can be read in from the file at a time.
 * Precise problem statement:
 * Input: A file containing at most 27000 integers in the range 1..27000. 
 * It is a fatal error condition if any integer appears twice in the input. No other data is associated with the integer.
 * Output: A sorted list in increasing order of the input integers.
 * Constraints: Internal storage is available for at most 1000 integers. Ample disk storage is available.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RedistrictingApp {

	public static void main(String[] args) {
		
		try {
			// Create file that contains all the precinct data
			File file = new File("C:\\repos\\coding-challenges\\CC12_Redistricting\\src\\precincts.txt");
			
			// Create an ArrayList of FileWriters
			ArrayList<FileWriter> fileWriters = null;
			
			try {
				// Calls file create to create 27 files to store the data
				fileWriters = fileCreate();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			// Create a scanner to read the data from the file
			Scanner reader = new Scanner(file);
			
			// Continues while the file has another line
			while(reader.hasNextLine()) {
				// Continues while the file has an integer
				if(reader.hasNextInt()) {
					// Store the data and call presinctBatch method
					Integer data = reader.nextInt();
					precinctBatch(data, fileWriters);
				} else {
					reader.nextLine();
				}
			}
			
			// Close Scanner and FileWriters
			reader.close();
			for(FileWriter fr: fileWriters) {
				fr.close();
			}
			
			// Call writeSortedFile method
			writeSortedFile(fileWriters);
		} catch (IOException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}
	
	// Creates the file to store the results and calls sortFile to store the sorted data
	private static void writeSortedFile(ArrayList<FileWriter> fileWriters) throws IOException {
		File results = new File("results.txt");
		FileWriter writer = new FileWriter(results);
		
		for(int i=0; i < fileWriters.size(); i++) {
			sortFile("precincts" + i + ".txt", writer);
		}
		
		writer.close();
	}
	
	// Reads the passed files data and adds it to an ArrayList and sorts the data.
	public static void sortFile(String fileName, FileWriter writer) throws IOException {
		
		File file = new File(fileName);
		Scanner reader = new Scanner(file);
		ArrayList<Integer> precinctData = new ArrayList<Integer>();
		
		while(reader.hasNextLine()) {
			if(reader.hasNextInt()) {
				Integer data = reader.nextInt();
				precinctData.add(data);				
			} else {
				reader.nextLine();
			}
		}
		
		Collections.sort(precinctData);
		for(Integer i: precinctData) {
			writer.write(i.toString() + "\n");
		}
		reader.close();	
	}
	
	// Creates the files needed to separate the data
	public static ArrayList<FileWriter> fileCreate() throws IOException {
		
		ArrayList<FileWriter> precinctList = new ArrayList<FileWriter>();
		
		for(int i=0; i < 27; i++) {
			FileWriter writer = new FileWriter("precincts" + i + ".txt");
			precinctList.add(writer);
		}
		
		return precinctList;
	}
	
	// Stores the precinct number in the appropriate file
	public static void precinctBatch(Integer precinctNum, ArrayList<FileWriter> fileWriters) throws IOException {
		
		int fileIndex = (precinctNum - 1) / 1000;
		
		fileWriters.get(fileIndex).write(precinctNum.toString() + "\n");
	}
	
}
