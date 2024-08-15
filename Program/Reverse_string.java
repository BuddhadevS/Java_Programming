package Santi_Nikaton;

public class Reverse_string {
	public static void main(String[] args) {
		String s = "Buddha";
		String s2 = " ";
		for(int i = s.length()-1; i>=0; i--)
		{
			s2 = s2 + s.charAt(i);
		}
		System.out.println(s2);
	}

}
