public class BankAccount {
    private int accountNumber;
    private String name;
    private float balance;

    static int totalAccounts = 0;

    public BankAccount() {
        totalAccounts++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void depositMoney(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawMoney(float amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setAccountNumber(101);
        account1.setName("Adyasha");
        account1.setBalance(1000);

        account2.setAccountNumber(102);
        account2.setName("Aarya");
        account2.setBalance(500);

        System.out.println(" ");

        System.out.println("Account Holder: 1");
        System.out.println("Name: " + account1.getName());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Initial Balance: " + account1.getBalance());
        account1.depositMoney(500);
        account1.withdrawMoney(100);
        System.out.println(" ");

        System.out.println("Account Holder: 2");
        System.out.println("Name: " + account2.getName());
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Initial Balance: " + account2.getBalance());
        account2.depositMoney(650);
        account2.withdrawMoney(150);
        System.out.println(" ");

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
