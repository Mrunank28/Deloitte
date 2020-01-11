package com.deloitte.emp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpObjectReader {
	
	public EmpObjectReader() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Emp emp = null;
		try {
			fis = new FileInputStream("emp.ser");
			ois = new ObjectInputStream(fis);
			emp = (Emp) ois.readObject();
			System.out.println(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new EmpObjectReader();

	}

}
