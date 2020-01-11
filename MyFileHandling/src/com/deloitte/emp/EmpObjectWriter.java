package com.deloitte.emp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmpObjectWriter {

	public EmpObjectWriter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter <ID> <Name> <Mobile> <Designation>");
		Emp emp = new Emp(scan.nextInt(), scan.next(), scan.nextLong(), scan.next());
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("emp.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Emp object written to file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
	
				}
			}
		}

	}

	public static void main(String[] args) {
		new EmpObjectWriter();

	}

}
