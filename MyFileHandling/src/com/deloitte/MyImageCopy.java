package com.deloitte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyImageCopy {

	public MyImageCopy() {
		File inFile = new File("vegetables.jpg");
		File outFile = new File("veg.jpg");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(inFile);
			fos = new FileOutputStream(outFile);
			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
			System.out.println("File Copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {

				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {

				}
			}
		}
	}

	public static void main(String[] args) {
		new MyImageCopy();

	}

}
