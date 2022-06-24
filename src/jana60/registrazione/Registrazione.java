package jana60.registrazione;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("inserisci nome e cognome: ");
			String nome = scan.nextLine();
			String cognome = scan.nextLine();
			
			System.out.println("inserisci eta: ");
			int eta = Integer.parseInt(scan.nextLine());
			
			System.out.println("inserisci email: ");
			String email = scan.nextLine();
			System.out.println("Inserisci password: ");
			String password = scan.nextLine();
			
			Utente nuovoUtente = new Utente(nome, cognome, email, password, eta);
			
			System.out.println("Account creato con i dati: " + nuovoUtente);
			
		} catch(NumberFormatException nfe) {
			System.out.println("l'input inserito non è un numero valido");
			System.out.println(nfe.getMessage());
		} catch(Exception e) {
			System.out.println("impossibile creare l'account");
			System.out.println(e.getMessage()); 
		}
		
		
		scan.close();

	}

}
