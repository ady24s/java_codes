class Account {
    private int id;
    private int balance;
    private int deposite;
    private int withdraw;

    public int getId() {
        return id;
    }

    public void setId(int id) { // Corrected from setid to setId
        this.id = id;
    }

    public int getBalance() {
        return balance; // Corrected from Balance to balance
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDeposite() {
        return deposite;
    }

    public void setDeposite(int deposite) {
        this.deposite = deposite;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
}

class Customer {
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}

public class Transaction {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCname("Adyasha");

        Account account = new Account();
        account.setBalance(500000);
        account.setDeposite(12003);
        account.setWithdraw(1000);
        account.setId(4565);

        System.out.println("---TRANSACTION---");
        System.out.println(" ");

        System.out.println(customer.getCname());
        System.out.println(account.getBalance());
        System.out.println(account.getDeposite());
        System.out.println(account.getId());
        System.out.println(account.getWithdraw());

    }
}
