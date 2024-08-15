package Santi_Nikaton;

public class Fetch_Special_character {
	public static void main(String[] args) {
		String s = "java14@##%";
		for(int i = 0; i<s.length(); i++)
		{
			if(!Character.isAlphabetic(s.charAt(i))&& !Character.isDigit(s.charAt(i)))
					{
						System.out.println(s.charAt(i));
					}
		}
		
	}

}
