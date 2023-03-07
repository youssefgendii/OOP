
public class Main {
    public static void main(String[] args) {

        Account1 account1 = new Account1(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.deposit(3000);
        account1.withdraw(2500);

        System.out.println("Balance =" + account1.getBalance() + "\n" + "Monthly interest =" + account1.getMonthlyInterest());

    }
}