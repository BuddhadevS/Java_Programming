package Santi_Nikaton;

import java.util.ArrayList;

public class Remove_the_value_using_collection {

	public static void main(String[] args) {
		ArrayList arrayList  = new ArrayList<>();
		arrayList.add("hi");
		arrayList.add("bye");
		arrayList.add("polu");
		arrayList.remove(0);
		System.out.println(arrayList);
	}
}
