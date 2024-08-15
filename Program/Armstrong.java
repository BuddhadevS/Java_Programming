public class Armstrong {
    public static void main(String[] args) {
        int no = 153;
        int copy = no;
        int rev = 0;
        while (copy!=0) 
        {
            int rem = copy%10;
            rev = rev+ rem*rem*rem;
            copy = copy/10;
        }
        if (rev==no) 
        {
            System.out.println("This is a armstrong no");
        }

        else{
            System.out.println("This is not a armstrong no");
        }
    }
}
