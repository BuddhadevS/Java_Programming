public class Fibbonachi {
    public static void main(String[] args) {
        int fib1 = 0;
        int fib2 = 1;
        int no = 5;
        System.out.print(fib1+" "+fib2);
        for (int i = no; i>0; i--) 
        {
            int fib3 = fib1+ fib2;
            System.out.print(" "+fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
