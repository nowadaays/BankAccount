class MainClass {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount("Nikita ", 1000.0);
            account.deposite(500);
            account.widthrows(200);
            account.getAccountInfo();
            account.widthrows(1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}