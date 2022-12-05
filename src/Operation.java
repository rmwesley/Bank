import java.util.Date;

public class Operation{
	private String kind;
	private Date date;
	private double amount;
	private double balance;

	public Operation(String kind, double amount, double balance){
		this(kind, new Date(), amount, balance);
	}
	public Operation(String kind, Date date, double amount, double balance){
		this.kind = kind;
		this.date = date;
		this.amount = amount;
		this.balance = balance;
	}
	@Override
	public String toString(){
		String str = "";
		str += "Operation: " + this.kind + "\n";
		str += "Date: " + this.date + "\n";
		if (kind != "Full withdrawal"){
			str += "Amount: " + this.amount + "\n";
		}
		str += "Balance: " + this.balance + "\n";
		return str;
	}
}
