package Santi_Nikaton;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_the_no_using_collection {
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(50);
		arrayList.add(100);
		arrayList.add(5);
		Collections.reverse(arrayList);
		System.out.println(arrayList);
	}

}
