class user 
{
        void send(int x)
        {
            System.out.println("sending"+ x);

        }
        void send(String y)
        {
            System.out.println("sending"+ y);
        }
}

public class Method_overloding
{
    public static void main(String[] args) 
    {
        user user1 = new user();
        user1.send(10);
        user1.send("Hello");
    }   
}
