package Santi_Nikaton;

import java.util.Arrays;

public class Sorting_the_decending_order {
	public static void main(String[] args) {
		int arr[]= {20,30,80,40,35,60};
		Arrays.sort(arr);
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
