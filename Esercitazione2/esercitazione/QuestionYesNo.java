package esercitazione;

import java.util.Scanner;

public class QuestionYesNo extends Question {
	
	public QuestionYesNo(String domanda, String risposta, int punteggio) {
		super(domanda, risposta, punteggio);
	}
	
	public int ask(){
		
		String r;
		Scanner s = new Scanner(System.in);
		
		System.out.println(domanda);
		
		do{
			r = s.next();
			if (r.equals("si") || r.equals("no"))
					break;

		}while(!(r.equals("si") || r.equals("no")));
		
		
		if (r.equals(risposta))			
			return punteggio;
		else 
			return 0;
		
	}


}
