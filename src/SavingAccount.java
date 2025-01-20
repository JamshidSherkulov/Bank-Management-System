class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate/100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (balance > 0 && balance > amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient funds and invalid amount");
        }
    }
}
