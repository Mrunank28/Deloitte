package com.deloitte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

	public static void main(String[] args) {
		List<String> colorList = new CopyOnWriteArrayList<>(); 
				//new ArrayList<>();
		String[] colorArray = {"red","green","blue","pink","orange"};
		for (String color : colorArray) {
			colorList.add(color);
		}
		
		System.out.println(colorList);
		String[] deleteArray = {"green" , "blue"};
		List<String> deleteList = Arrays.asList(deleteArray);
		Iterator<String> iter = colorList.iterator();
		int ctr = 0;
		while (iter.hasNext()) {
			ctr++;
			String color = iter.next();
			if(deleteList.contains(color)) {
				colorList.remove(color);
				//iter.remove();
				if(ctr == 2)
				colorList.add("yellow");
			}
		}
		System.out.println(colorList);
		
		
//		System.out.println(colorList.get(3));
//		colorList.remove(3);
//		System.out.println(colorList);
//		colorList.add(3, "yellow");
//		System.out.println(colorList);
//		Collections.sort(colorList);
//		System.out.println(colorList);
//		Collections.sort(colorList, Collections.reverseOrder());
//		System.out.println(colorList);
		
	}
}
