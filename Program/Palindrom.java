public class Palindrom {
    public static void main(String[] args) {
        int no = 191;
        int copy = no;
        int rev = 0;
        while (copy!=0) 
        {
            int rem = copy%10;
            rev = rev*10 + rem;
            copy = copy/10;
        }
        if(rev==no)
        {
            System.out.println("This is a palindrom no");
        }

        else{
            System.out.println("This is not a palindrom no");
        }
    }
}
