public class Factorial {
    public static void main(String[] args) {
        int fact = 4;
        int sum = 1;
        for(int i = fact; i>0; i--)
        {
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
