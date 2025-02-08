package bibliotheque;

	public class Account {

	    private String id;
	    private String name;
	    private int balance = 0;

	    public Account(String id, String name, int balance) {
	        this.id = id;
	        this.name = name;
	        this.balance = balance;
	    }

	    public Account(String id, String name) {
	        this.id = id;
	        this.name = name;
	        this.balance = 0;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void credit(int amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Le montant doit être positif.");
	        }
	    }

	    public void debit(int amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Fonds insuffisants ou montant invalide.");
	        }
	    }

	    public void transfer(Account another, int amount) {
	        if (amount > 0 && amount <= balance) {
	            this.balance -= amount;
	            another.credit(amount);
	        } else {
	            System.out.println("Fonds insuffisants ou montant invalide.");
	        }
	    }

	    
	    public String toString() {
	        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	    }
	}
