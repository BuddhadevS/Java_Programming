package Santi_Nikaton;

import java.util.TreeMap;

public class No_of_occurence {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,2,3,4,3,2};
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		for(int i = 0; i<a.length; i++)
		{
			if(!treeMap.containsKey(a[i]))
			{
				treeMap.put(a[i], 1);
			}
			else
			{
				int x = treeMap.get(a[i]);
				x++;
				treeMap.put(a[i], x);
			}
			
		}
		System.out.println(treeMap);
	}

}
