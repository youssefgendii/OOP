
public class Account1 {
    private int id;
    private double balance;
    private static double annual_Rate;


    public Account1(){}
    public Account1(int id, double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    public int getID()
    {return id;}

    public double getBalance()
    {return balance;}

    public static double getAnnualIntRate()
    {return annual_Rate;}

    public void setID(int id)
    {this.id =id;}

    public void setBalance(double balance)
    {this.balance =balance;}

    public void setAnnualInterestRate(double annual_Rate)
    {this.annual_Rate =annual_Rate;}

    public double getMonthlyInterestRate()
    {
        return (annual_Rate/12.0);
    }

    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate();
    }

    public void deposit(double amount)
    {
        balance= balance + amount;
    }
    public void withdraw(double amount)
    {
        if(amount<=balance)
            balance= balance - amount;
        else
            System.out.println("no balance");
    }
}

