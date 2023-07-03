import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Dies ist die Dokumentation der Klasse Ticket_Verwalten.
 * Diese dient dem Verwalten von Ticket Objekten.
 * 
 * @see Ticket
 */
public class Ticket_Verwalten {
	Scanner s = new Scanner(System.in);
	private ArrayList<Ticket> arr;
	static int c;

	/**
	 * Konstruktor fuer die Klasse Ticket_Verwalten
	 * Erstellen einer neuen Arraylist vom Typ Ticket
	 */
	public Ticket_Verwalten() {

		this.arr = new ArrayList<Ticket>();
		;
	}

	/**
	 * Getter von arr
	 * 
	 * @return arr ArrayList
	 */
	public ArrayList<Ticket> getArr() {
		return arr;
	}

	/**
	 * Methode zum darstellen des Menues in der Konsole
	 * Auswahl verschiedener Optionen mithilfe von switches
	 * 
	 * @param k
	 */
	public void Ticket_System_Start(Kunde k) {
		if (c == 1) {
			System.out.println("1 f�r aufruf eines bestehendem" + "\n" + "2 " + "anzeigen aller T" + "\n" + "3 "
					+ "entfernen eines Tickets" + "\n" + "4 " + "ausloggen");

			String s1 = s.nextLine();

			switch (s1) {

				case "1":

					System.out.println("Ticket ID eingeben");
					s1 = s.nextLine();
					System.out.println(show_Ticket_byID(s1, arr));
					if (arr.size() == 0) {
						System.out.println("Es existiert kein Ticket");

					}
					break;
				case "2":

					for (int i = 0; i < arr.size(); i++) {

						System.out.println(arr.get(i).toString());

					}

					if (arr.size() == 0) {
						System.out.println("Es existiert kein Ticket");

					}

					break;

				case "3":

					for (int i = 0; i < arr.size(); i++) {
						System.out.println("Ticket ID eingeben");
						s1 = s.nextLine();

						System.out.println(remove_Ticket_byID(s1, arr));

						break;
					}
					if (arr.size() == 0) {
						System.out.println("Es existiert kein Ticket");

					}
					break;
				case "4":
					// System.out.println("Vierte Option\n");
					Ticket_System_User();
					break;
				default:
					System.out.println("Bitte eine Zahl eingeben");
					break;
			}

			// System.out.println("Bitte eingeben:"+"\n"+"1 f�r erstellen eines neuen
			// Tickets"+ "\n"+ "2 f�r aufruf eines bestehendem"+"\n"+"3 "+ "Anzeigen aller
			// T"+"\n"+"4 "+ "Entfernen eines Tickets");

		} else {
			System.out.println("Bitte eingeben:" + "\n" + "1 f�r erstellen eines neuen Tickets" + "\n"
					+ "2 zum anzeigen aller Tickets" + "\n" + "3 ausloggen");

			String s1 = s.nextLine();

			switch (s1) {
				case "1":
					// System.out.println("Erste Option\n");
					arr.add(create_Ticket(s, k));
					arr.get(arr.size() - 1).show_TicketAll(arr.get(arr.size() - 1));
					break;
				case "2":

					Show_Ticket_byKundenID(k.Kunde_ID, arr);
					if (arr.size() == 0) {
						System.out.println("Es existiert kein Ticket");

					}
					break;
				case "3":

					Ticket_System_User();
			}
		}
	}

	/**
	 * Methode zum Erstellen eines Tickets
	 * Auswahl verschiedener Optionen
	 * 
	 * @param s Scanner objekt
	 * @param k Kunde
	 * @return erstelltes Ticket
	 */
	private Ticket create_Ticket(Scanner s, Kunde k) { // Erstellen eines neuen Tickets
		create_New_Ticket_ID();
		System.out.println("Bitte Ticket Name eingeben:" + "\n");
		String f = s.nextLine();
		System.out.println("Bitte Ticket Nachricht eingeben:" + "\n");
		String f3 = s.nextLine();
		System.out.println("Prioritaet:" + "\n");
		String f4 = s.nextLine();
		Ticket t = new Ticket(f, create_New_Ticket_ID(), k.Kunde_ID, f3, new Date(), f4);
		return t;
	}

	/**
	 * Methode zum Erstellen einer Ticket ID
	 * 
	 * @return ID des Tickets
	 */
	private String create_New_Ticket_ID() { // Erstellen einer ID f�r ein Ticket
		Random r = new Random();
		String n = "";
		for (int i = 0; i < 10; i++) {
			n = String.valueOf(n + r.nextInt(10));
		}
		for (int j = 0; j < arr.size(); j++) {
			if (n.equals(arr.get(j).getTicket_ID())) {
				create_New_Ticket_ID();
			}
		}
		return n;
	}

	/**
	 * Zeigt ein bestimmtes Ticket nach eingabe der ID an.
	 * 
	 * @param ID        des Tickets
	 * @param Arraylist mit existierenden Tickets
	 * @return Ob das Ticket existiert oder nicht.
	 */
	private boolean show_Ticket_byID(String s1, ArrayList<Ticket> arr) { // Anzeige eines Tickets per ID
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getTicket_ID().equals(s1)) {
				// System.out.println(arr.get(i).getTicket_ID());
				System.out.println(arr.get(i).toString());
				return true;

			}
		}
		System.out.println("Das Ticket Existiert nicht");
		return false;

	}

	/**
	 * Methode zum entfernen eins bestimmten Tickets per ID
	 * 
	 * @return ob das Ticket entfernt wurde
	 */
	private boolean remove_Ticket_byID(String s1, ArrayList<Ticket> arr) { // Anzeige eines Tickets per ID
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getTicket_ID().equals(s1)) {
				// System.out.println(arr.get(i).getTicket_ID());
				arr.remove(i);

				try {

					System.out.println("Ticket:" + arr.get(i).toString() + "entfernt");
				} catch (Exception e) {

				}

				return true;
			}
		}
		System.out.println("Das Ticket Existiert nicht");
		return false;
	}

	/**
	 * Methode zum auswaehlen zwischen Mitarbeiter und Kunde
	 */
	public void Ticket_System_User() {
		System.out.println("Bitte Anmelden:\n 1 f�r Mitarbeiter\n " + "2 f�r Kunde");
		String s1 = s.nextLine();

		switch (s1) {
			case "1":
				c = 1;
				break;

			case "2":
				c = 2;
				break;

			default:
		}

	}

	/**
	 * Methode zum zeigen aller Tickets eines bestimmten Kunden
	 * 
	 * @param s1  KundenID
	 * @param arr ArrayList
	 * 
	 */

	private boolean Show_Ticket_byKundenID(String s1, ArrayList<Ticket> arr) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getTicket_Ersteller().equals(s1)) {
				// System.out.println(arr.get(i).getTicket_ID());
				System.out.println(arr.get(i).toString());

			}

		}
		return false;
	}
}
