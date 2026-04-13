import thermos.Thermostat;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();

		t.ajouterPeripherique(new Lampe("Lampe1"));
		t.ajouterPeripherique(new Hifi());
		t.ajouterPeripherique(new ChemineeAdapterPeripherique());
		t.ajouterPeripherique(new ThermostatAdapterPeripherique());

		TelecommandeGraphique tg = new TelecommandeGraphique(t);

	}
}
