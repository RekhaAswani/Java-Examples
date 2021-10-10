public class BankDemo
{
  public static void main(String [] args) throws InsufficientFundsException
   {
       CheckingAccount c = new CheckingAccount(101);
       c.withdraw(600.00);
    try
  {
       System.out.println("Depositing Rs500...");
       c.deposit(500.00);
       System.out.println("Withdrawing Rs100..");
       c.withdraw(100.00);
       System.out.println("Withdrawing Rs600...");
       System.out.println("after Withdrawing Rs600..");
  }
    catch(InsufficientFundsException e)
    {
     System.out.println("Sorry you are short Rs" +e.getAmount());
     e.printStackTrace();
    }
}
} 