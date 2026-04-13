
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();

		t.ajouterPeripherique(new Lampe("Lampe1"));
		t.ajouterPeripherique(new Hifi());
		t.ajouterPeripherique(new ChemineeAdapterPeripherique());

		TelecommandeGraphique tg=new TelecommandeGraphique(t);
	}
}
