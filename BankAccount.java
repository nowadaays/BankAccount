import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private static int accountCounter = 1000;
    private int accountNumber;
    private double balanced;
    private String ownerName;

    public BankAccount(String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balanced = initialBalance;
        this.ownerName = ownerName;
    }

    public void deposite(double amount) {
        balanced += amount;
        System.out.println("Платёж произошёл! Ваш новый баланс " + balanced);
    }

    public void widthrows(double amount) throws InsufficientFundsException {
        if (amount > balanced) {
            throw new InsufficientFundsException("Недостаточно средств. Текущий баланс: " + balanced);
        }
        balanced -= amount;
        System.out.println(amount + "отозван успешно. Новый баланс: " + balanced);
    }

    public void getAccountInfo() {
        System.out.println("Номер аккаунта " + accountNumber);
        System.out.println("Имя владельца " + ownerName);
        System.out.println("Баланс " + balanced);
    }
}
