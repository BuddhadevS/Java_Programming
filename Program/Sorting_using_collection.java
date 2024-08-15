package Santi_Nikaton;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_using_collection {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(5);
		Collections.sort(arrayList);
		System.out.println("Accending order"+ arrayList);
	}

}
