class Bank
{
    private int pin = 1234;
    public int getpin()
    {
        return pin;
    }
    public void setpin(int pin)
    {
        this.pin = pin;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getpin());
        bank.setpin(4567);
        System.out.println(bank.getpin());
    }
    
}
