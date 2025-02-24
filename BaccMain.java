 class Bacc 
{
    int number;
    int balance;
    public int amount;

     Bacc(int number , int balance  )
    {
        this.number = number;
        this.balance = balance;
    }

    void getbalance(int amount)
    {
        System.out.println("your deposit amount  " +amount );
         balance = balance + amount;
         System.out.println("your balance now :- " + balance );
    }

    void setbalance(int withdraw)
    {
        System.out.println("your withdrawal amount  " +withdraw );
        if(withdraw <= balance && withdraw >= 500)
        {
        balance = balance - withdraw;
        }
        System.out.println("your balance now :- " + balance );
    }
    void display()
    {
        System.out.println("your account number :- " + number );
        System.out.println( "your bank balance :- " + balance);
    }
    
}
 public class  BaccMain
 {
     public static void main(String[] args) 
     {
        // object
        Bacc u = new Bacc(1234 , 5000);  
        u.display();   
        u.getbalance(7000);
        u.setbalance(3000);
         
     }
 }
// write a name of file BaccMain.java for running directly in any compiler. 