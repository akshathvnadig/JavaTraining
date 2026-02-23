public class Account {
    int accountno;
    static int totalaccounts;
    Account(){
        totalaccounts++;
        accountno = totalaccounts;
    }
    static void showtotalaccounts(){
        System.out.println("Total accounts: " + totalaccounts);
    }
    public static void main(String[] args) {
        new Account();
        new Account();
        new Account();
        Account.showtotalaccounts();
    }
}


