class Sahu
{
    void service()
    {
        System.out.println("it s sahu house");
    }
}

class Maity extends Sahu
{
    void service()
        {
            System.out.println("its maity house");
        }
    
}
class Panja extends Sahu
{
    void service()
        {
            System.out.println("its panja house");
        }
    
}

class Khayra
{
    static void access(Sahu sahu)
    {
        sahu.service();
    }
}

public class Polymorphism 
{
    public static void main(String[] args) {
        Maity maity = new Maity();
        Panja panja= new Panja();
        Khayra.access(maity);
        Khayra.access(panja);
    }
}
