public class BankManagementSystem {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount("S123", "Alice", 1000, 5);
        CurrentAccount current = new CurrentAccount("C456", "Bob", 500, 200);

        savings.deposit(500);
        savings.addInterest();
        savings.withdraw(300);
        System.out.println("Saving balance: " + savings.checkBalance());

        current.deposit(200);
        current.withdraw(800);
        current.withdraw(100);
        System.out.println("Current balance: " + current.checkBalance());
    }
}