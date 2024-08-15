public class Strong {
    public static void main(String[] args) {
        int no = 145;
        int copy = no;
        int sum = 0;
        while (copy!=0) 
        {
            int rem = copy%10;
            int fact = 1;
            for(int i = rem ; i>1; i--)
            {
                fact = fact*i;
            }
            sum= sum + fact;
            copy = copy/10;
        }
        if (sum==no) 
        {
            System.out.println("This is a strong no");
            
        }
        else{
            System.out.println("This is not a strong no");
        }
    }
}
