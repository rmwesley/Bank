import java.util.HashMap;
import java.util.Map;
import java.lang.Integer;

public class Bank {
	private static Bank singleInstance;
	private static int numberOfClients = 0;
	private Map<Integer, Client> clients;
	private Map<String, Integer> identifiers;

	private Bank(){
		this.clients = new HashMap<Integer, Client>();
		this.identifiers = new HashMap<String, Integer>();
	}
	public static Bank init(){
		if (singleInstance == null) singleInstance = new Bank();
		return singleInstance;
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
