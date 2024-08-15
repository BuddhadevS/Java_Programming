package Santi_Nikaton;

public class Count_the_Vowel {
	public static void main(String[] args) {
		String s1[] = {"hi","Hello"};
		int count = 0;
		for(int i = 0; i<s1.length; i++)
		{
			String s =s1[i];
			for(int j = 0; j<s.length(); j++)
			{
				if(s.charAt(j)=='a'|| s.charAt(j)=='e'|| s.charAt(j)=='i'||s.charAt(j)=='o'|| s.charAt(j)=='u')
				{
					count++;
				}
			}
			
		}
		System.out.println("The no of vowel is"+" "+ count);
	}

}
