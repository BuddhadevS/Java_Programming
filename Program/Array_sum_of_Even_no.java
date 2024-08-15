package Santi_Nikaton;


public class Array_sum_of_Even_no {
	public static void main(String[] args) {
		int sum = 0;
		int arr [] = {5, 2 ,4, 10, 8};
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
