import java.util.HashMap;
import java.lang.Integer;

public class Bank {
	private static int numberOfClients = 0;
	private HashMap<Integer, Client> clients;
	private HashMap<String, Integer> identifiers;

	private Bank(){
		this.clients = new HashMap<Integer, Client>();
		this.identifiers = new HashMap<String, Integer>();
	}
	public static Bank init(){
		return new Bank();
	}
	public void addClient(String name){
		Client client = new Client(name, ++numberOfClients);
		this.clients.put(numberOfClients, client);
		this.identifiers.put(name, numberOfClients);
	}
	public Client getClient(int id){
		return clients.get(id);
	}
	public Client getClient(String name){
		return clients.get(identifiers.get(name));
	}
}
