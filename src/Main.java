public class Main{
	public static void main(String[] args){
		Bank franceCapital = Bank.init();
		franceCapital.addClient("Rebeca");
		franceCapital.addClient("Eduardo");
		franceCapital.addClient("Bruno");
		franceCapital.addClient("Renato");
		franceCapital.addClient("Lucas");

		franceCapital.getClient(1).deposit(200.0);
		franceCapital.getClient("Eduardo").deposit(100.0);
		franceCapital.getClient("Eduardo").withdraw(49.99);
		System.out.println(franceCapital.getClient("Eduardo").history());
		franceCapital.getClient("Lucas").deposit(50.00);
		franceCapital.getClient("Lucas").withdraw(20.00);
		franceCapital.getClient("Lucas").deposit(120.00);
		franceCapital.getClient("Lucas").fullWithdraw();
		System.out.println(franceCapital.getClient(5).history());
	}
}
