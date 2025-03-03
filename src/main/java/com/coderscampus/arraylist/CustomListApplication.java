package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		for (int i = 0; i < 52; i++) {
			myCustomList.add("element " + i);
		}
		
		System.out.println(myCustomList.add(20, "element " + 999));
		
		System.out.println(myCustomList.remove(50));
		
		System.out.println("Total number of elements in array: " + myCustomList.getSize());
		for(int i = 0; i < myCustomList.getSize(); i++)	{
			System.out.println("i = " + i + " " + myCustomList.get(i));
		}
		
		try {
		    System.out.println(myCustomList.get(-1));
		} catch (IndexOutOfBoundsException e) {
		    System.out.println("Caught exception: " + e.getMessage());
		}
		
		try {
		    System.out.println(myCustomList.get(100));
		} catch (IndexOutOfBoundsException e) {
		    System.out.println("Caught exception: " + e.getMessage());
		}
		
		
	}
}
