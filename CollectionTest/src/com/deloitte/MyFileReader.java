package com.deloitte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public String getName() {
		FileReader fr = null;
		BufferedReader br = null;
		String className = "";
		String name = "";
		try {
			fr = new FileReader("emp.config");
			br = new BufferedReader(fr);
			className = br.readLine();
			System.out.println(className);
			name = br.readLine();
			System.out.println(name);
			className = className + "," + name;
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
		return className;
	}

}
