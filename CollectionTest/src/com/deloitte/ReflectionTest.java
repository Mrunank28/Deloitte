package com.deloitte;

import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		//Class objClass;
		String className = new MyFileReader().getName();
		String[] arr = className.split(",");
		try {
			//6th way of making an object
			//objClass = Class.forName("com.deloitte.Emp");
			Class objClass = Class.forName(arr[0]);
			Emp emp = (Emp) objClass.newInstance();
			emp.setName(arr[1]);
			System.out.println(emp);
			//shows all the libraries 
//			Method[] meths = objClass.getMethods();
//			for (Method method : meths) {
//				System.out.println(method);
//			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
