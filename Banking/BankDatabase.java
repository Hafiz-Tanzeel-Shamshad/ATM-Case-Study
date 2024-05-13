
package Banking;


public class BankDatabase {
    private Account[] accounts;

    public BankDatabase() {
        accounts = new Account[2];
        accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
        accounts[1] = new Account(123, 45, 200.0, 200.0);
    }

    private Account getAccount(int accountNumber) {
        for (Account currentAccount : accounts) {
            if (currentAccount.getAccountNumber() == accountNumber) {
                return currentAccount;
            }
        }
        return null;
    }

    public boolean authenticateUser(int userAccountNumber, int userPIN) {
        Account userAccount = getAccount(userAccountNumber);
        return userAccount != null && userAccount.validatePIN(userPIN);
    }

    public double getAvailableBalance(int userAccountNumber) {
        Account userAccount = getAccount(userAccountNumber);
        return userAccount != null ? userAccount.getAvailableBalance() : 0.0;
    }

    public double getTotalBalance(int userAccountNumber) {
        Account userAccount = getAccount(userAccountNumber);
        return userAccount != null ? userAccount.getTotalBalance() : 0.0;
    }

    public void credit(int userAccountNumber, double amount) {
        Account userAccount = getAccount(userAccountNumber);
        if (userAccount != null) {
            userAccount.credit(amount);
        }
    }

    public void debit(int userAccountNumber, double amount) {
        Account userAccount = getAccount(userAccountNumber);
        if (userAccount != null) {
            userAccount.debit(amount);
        }
    }
}
