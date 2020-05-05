public class Main {

    public static void main(String [] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountName("Me");
        checkingAccount.setAccountNumber(1);
        checkingAccount.setBalance(10);
        checkingAccount.limit = 1000;

        System.out.println(checkingAccount.limit);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountName("Savings");
        savingsAccount.setAccountNumber(2);
        savingsAccount.setBalance(200000);
        savingsAccount.limit = 30000;

        System.out.println(savingsAccount.limit);

        COD cod = new COD();
        cod.setAccountName("Certificate of Deposit");
        cod.setAccountNumber(3);
        cod.setBalance(400);
        cod.limit = 700;

        System.out.println(cod.limit);
        }

}
