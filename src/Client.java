import java.util.LinkedList;

public class Client{
	private String name;
	private int id;
	private double balance;
	private LinkedList<Operation> history;

	public Client(String name, int id){
		this.name = name;
		this.id = id;
		this.balance = 0;
		this.history = new LinkedList<Operation>();
	}
	public void deposit(double amount){
		this.balance += amount;
		history.add(new Operation("Deposit", amount, balance));
	}
	public void fullWithdraw(){
		history.add(new Operation("Full withdraw", -balance, 0));
		this.balance = 0;
	}
	public void withdraw(double amount){
		this.balance -= amount;
		history.add(new Operation("Partial withdraw", -amount, balance));
	}
	@Override
	public String toString(){
		return this.name + ":" + this.id + ":" + this.balance;
	}
	public String history(){
		String str = "\n" + this + "\n";
		for (Operation operation : history){
			str += operation + "\n";
		}
		return str + "\n";
	}
}
