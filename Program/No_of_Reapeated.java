package Santi_Nikaton;

public class No_of_Reapeated {
	public static void main(String[] args) {
		int no = 12451234;
		int find = 2;
		int count = 0;
		while(no!=0)
		{
			int rem = no%10;
			if(rem==find)
			{
				count++;
			}
			no = no/10;
		}
		System.out.println("2 is reapeated "+ count+ "times");
		
	}

}
