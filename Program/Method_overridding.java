
class Whatsapp
{
    void status()
    {
        System.out.println("status for 30 seconds");
    }
}

class Whatsapp2 extends Whatsapp
{
    void status()
        {
            System.out.println("status for 15 seconds");
        }
    
}


public class Method_overridding 
{
    public static void main(String[] args) {
        Whatsapp2 whatsapp2 = new Whatsapp2();
        whatsapp2.status();
    }
}
