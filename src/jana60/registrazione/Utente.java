package jana60.registrazione;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utente {
	
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		//gestico e-mail
		if(!isValidEmail(email)) {
			throw new Exception("la formula di inserimento della mail non è corretta");
		}
		if(password.length() < 8 || password.length() > 12) {
			throw new Exception("la password deve avere tra gli 8 e i 12 caratteri");
		}
		if(eta < 18) {
			throw new Exception("Spiacenti.Devi essere maggiorenne per poterti iscrivere!");
		}
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	}
	
	private boolean isValidEmail(String email) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+");
	    Matcher matcher = pattern.matcher(email);
	    boolean matchFound = matcher.find();
	    return matchFound;
	}
	
	public String toString() {
		return nome + "  " + cognome + " " + eta + " " + email;
	}

}
