package ir.isc.saeidi;


	class BankAccount {
	    private String accountNumber;
	    private double balance;

	    // 
	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    // 
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println(" amuont " + amount + " variz ");
	        } else {
	            System.out.println("amount");
	        }
	    }

	    // 
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("amount " + amount + " bardashtد.");
	        } else {
	            System.out.println("motabar.");
	        }
	    }

	    // 
	    public void transfer(BankAccount destinationAccount, double amount) {
	        if (amount > 0 && amount <= balance) {
	            this.withdraw(amount);
	            destinationAccount.deposit(amount);
	            System.out.println("amount " + amount + " amount " + destinationAccount.accountNumber + " enteghal.");
	        } else {
	            System.out.println("amount.");
	        }
	    }

	    // 
	    public void showAccountInfo() {
	        System.out.println("hesab: " + accountNumber);
	        System.out.println("mojodi: " + balance + " toman");
	    }
	}


