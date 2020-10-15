package esercitazione;

import java.util.Scanner;

public class Question {
	
	protected String domanda, risposta;
	protected int punteggio;
	
	public Question(String domanda, String risposta, int punteggio) {
		this.domanda = domanda;
		this.risposta = risposta;
		this.punteggio = punteggio;
	}

	public int ask(){
		
		String r;
		Scanner s = new Scanner(System.in);
		
		System.out.println(domanda);
		r = s.next();
		
		if (r.equals(risposta))
			return punteggio;
		else
			return 0;
	}
	
}
