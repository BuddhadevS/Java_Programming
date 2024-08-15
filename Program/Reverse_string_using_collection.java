package Santi_Nikaton;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_string_using_collection {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("Hi");
		arrayList.add("Bye");
		Collections.reverse(arrayList);
		System.out.println(arrayList);
	}

}
