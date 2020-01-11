package com.deloitte;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<String> colorSet = new HashSet<>();
		String[] colorArray = {"red","green","blue","pink","orange"};
		for (String color : colorArray) {
			colorSet.add(color);
		}
		System.out.println(colorSet);
		Set<String> colorTree = new TreeSet<>(colorSet);
		System.out.println(colorTree);
	}

}
