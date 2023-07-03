import java.util.*;

/**
 * Dies ist die Dokumentation der Klasse Ticket.
 * Diese dient dem erstellen von Tickets.
 * 
 */
public class Ticket {

	protected String Ticket_Name;
	protected String Ticket_ID;
	protected String Ticket_Ersteller;
	protected Date Ticket_date;
	protected String Ticket_Message;
	protected String Ticket_Prio;

	/**
	 * Konstruktor fuer die Klasse Ticket
	 * 
	 * @param ticket           Name Name des Tickets
	 * @param ticket_ID        Zuf�llig generierte ID des Tickets
	 * @param ticket_Ersteller Kunden_ID welche das Ticket erstellt hat.
	 * @param ticket_Message   Nachricht des Tickets
	 * @param ticket_date      Datum beim erstellen eines Tickets
	 * @param ticket_prio      Prioritaet f�r das Ticket
	 */
	public Ticket(String ticketName, String ticket_ID, String ticket_Ersteller, String ticket_Message, Date ticket_date,
			String ticket_prio) {
		Ticket_Prio = ticket_prio;
		Ticket_Name = ticketName;
		Ticket_ID = ticket_ID;
		Ticket_Ersteller = ticket_Ersteller;
		Ticket_Message = ticket_Message;
		Ticket_date = ticket_date;
	}

	/**
	 * Methode zum aufrufen aller Attribute als String
	 * 
	 * @return Alle attribute
	 */
	@Override
	public String toString() {
		return "Tickets [Ticket_Name=" + Ticket_Name + ", Ticket_ID=" + Ticket_ID + ", Ticket_Ersteller="
				+ Ticket_Ersteller + ", Ticket_date=" + Ticket_date + ", Ticket_Message=" + Ticket_Message + "]";
	}

	/**
	 * Liefert den Namen des Tickets zurueck.
	 * 
	 * @return Name des Tickets
	 */

	public String getTicket_Name() {
		return Ticket_Name;
	}

	/**
	 * Setzt den Namen des Tickets.
	 * 
	 * @param ticketName name des Tickets
	 */
	public void setTicket_Name(String ticketName) {
		Ticket_Name = ticketName;
	}

	/**
	 * Liefert die Nachricht des Tickets zurueck.
	 * 
	 * @return Nachricht des Tickets
	 */
	public String getTicket_Message() {
		return Ticket_Message;
	}

	/**
	 * Setzt die Nachricht des Tickets.
	 * 
	 * @param Nachricht des Tickets
	 */
	public void setTicket_Message(String ticket_Message) {
		Ticket_Message = ticket_Message;
	}

	/**
	 * Liefert die ID des Tickets zurueck.
	 * 
	 * @return ID des Tickets
	 */
	public String getTicket_ID() {
		return Ticket_ID;
	}

	/**
	 * Setzt die ID des Tickets.
	 * 
	 * @param ID des Tickets
	 */
	public void setTicket_ID(String ticket_ID) {
		Ticket_ID = ticket_ID;
	}

	/**
	 * Liefert den Ersteller des Tickets zurueck(Kunden_ID).
	 * 
	 * @return Ersteller des Tickets
	 */
	public String getTicket_Ersteller() {
		return Ticket_Ersteller;
	}

	/**
	 * Setzt den Ersteller des Tickets(Kunden_ID).
	 * 
	 * @param Ersteller des Tickets
	 */
	public void setTicket_Ersteller(String ticket_Ersteller) {
		Ticket_Ersteller = ticket_Ersteller;
	}

	/**
	 * Liefert das Erstelldatum des Tickets zurueck.
	 * 
	 * @return Erstelldatumdes Tickets
	 */
	public Date getTicket_date() {
		return Ticket_date;
	}

	/**
	 * Setzt das Erstelldatum des Tickets.
	 * 
	 * @param Datum des Tickets
	 */
	public void setTicket_date(Date ticket_date) {
		Ticket_date = ticket_date;
	}

	/**
	 * Liefert die Prioritaet des Tickets wieder.
	 */
	public String getTicket_Prio() {
		return Ticket_Prio;
	}

	/**
	 * Setzt die Prioritaet des Tickets.
	 * 
	 * @param Prioritaet
	 */
	public void setTicket_Prio(String ticket_Prio) {
		Ticket_Prio = ticket_Prio;
	}

	/**
	 * Zeigt alle existierenden Tickets
	 * 
	 * @param e das Ticket
	 */
	public static void show_TicketAll(Ticket e) {

		System.out.println(e.toString());

	}

}
