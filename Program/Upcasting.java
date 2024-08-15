class Aeroplane
{
    void fly()
        {
            System.out.println("habibi lets fly");
        }
    
}

class Aeroplane2 extends Aeroplane
{
    void fly()
        {
            System.out.println("habibi dont come");
        }
}

public class Upcasting 
{
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane2();
        aeroplane.fly();

        System.out.println("upcasting is done");
    }
    
}
