package com.deloitte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public MyFileReader() {
		FileReader fr = null;
		BufferedReader br = null;
		String line = "";
		try {
			fr = new FileReader("output.txt");
			br = new BufferedReader(fr);
			// line = br.readLine();
			while((line = br.readLine()) != null) {
			System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
				}
			}
		}

	}

	public static void main(String[] args) {
		new MyFileReader();

	}

}
