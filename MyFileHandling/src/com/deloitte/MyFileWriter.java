package com.deloitte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFileWriter {

	public MyFileWriter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String line = scan.nextLine();
		File outFile = new File("output.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		String delim = System.getProperty("line.separator");
		try {
			//fw = new FileWriter(outFile); // overwrites the file
			fw = new FileWriter(outFile, true); // continues writing without overwriting
			bw = new BufferedWriter(fw);
			bw.write(line); // +delim);
			bw.newLine(); //for end of line character
			System.out.println("Written to file");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		new MyFileWriter();

	}

}
