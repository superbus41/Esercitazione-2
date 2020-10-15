package esercitazione;

import java.util.Scanner;

public class NumericQuestion extends Question {
	
	public NumericQuestion(String domanda, String risposta, int punteggio) {
		super(domanda, risposta, punteggio);
	}

	public int ask() {
		
		String r;
		Scanner s = new Scanner(System.in);
		
		System.out.println(domanda);
		
		do{
			r = s.next();
		}while(!r.matches("[0-9]+"));
		
		if (r.equals(risposta))			
			return punteggio;
		else 
			return 0;
		
	}
}
