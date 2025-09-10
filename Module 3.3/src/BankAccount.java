public class BankAccount {

    static int totalAccounts;
    private double balance;
    private int accountNumber;

    BankAccount(int accNumber) {
        totalAccounts++;
        accountNumber = accNumber + totalAccounts;
    }


    public double getBalance() { return balance; }

    public int getAccountNumber() { return accountNumber; }

    public static int getTotalAccounts() { return totalAccounts; }

    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Amount cant be negative");
        } else balance += amount;
    }

    public void withdraw(double amount){ balance -= amount; }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(999);
        BankAccount account2 = new BankAccount(998);

        account1.deposit(500);
        account2.deposit(-1000);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }


}