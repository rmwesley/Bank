import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Client{
	private String name;
	private int id;
	private double balance = 0;
	private List<Operation> history = new LinkedList<Operation>();

	public Client(String name, int id){
		this.name = name;
		this.id = id;
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
		return history.stream()
			.map( operation -> "\n" + operation.toString())
			.collect(Collectors.joining("\n"));
	}
}
