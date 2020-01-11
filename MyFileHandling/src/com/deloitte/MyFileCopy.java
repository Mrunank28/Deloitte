package com.deloitte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileCopy {

	public MyFileCopy() {
		FileReader fr = null;
		FileWriter fw = null;
		File outFile = new File("copy.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;
		String line = "";
		try {
			fr = new FileReader("output.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter(outFile, true);
			bw = new BufferedWriter(fw);
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
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
				if (bw != null) {
					try {
						bw.close();
					} catch (IOException e) {
					}
				}

			}
		}
	}

	public static void main(String[] args) {
		new MyFileCopy();

	}

}
