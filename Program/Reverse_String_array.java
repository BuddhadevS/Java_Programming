package Santi_Nikaton;

public class Reverse_String_array {
	public static void main(String[] args) {
		String arr[] = {"hi","hello","bye"};
		for(int i = 0; i<arr.length; i++)
		{
			String d = " ";
			String x = arr[i];
			for(int j = x.length()-1; j>=0; j--)
			{
				d = d+x.charAt(j);
			}
			System.out.println(d);
		}

	}

}
