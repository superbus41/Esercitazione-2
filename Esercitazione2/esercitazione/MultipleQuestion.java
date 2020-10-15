package esercitazione;

import java.util.Scanner;

public class MultipleQuestion extends Question {
	
	private String[] answer = new String[5];
	
	public MultipleQuestion(String domanda, String risposta, int punteggio, String[] answer) {
		super(domanda, risposta, punteggio);
		this.answer = answer;
	}

	public int ask(){
		
		String r;
		Scanner s = new Scanner(System.in);
		
		System.out.println(domanda);
		for (int i = 0; i < answer.length; i++)
			System.out.println((i+1) + " " + answer[i]);
		
		do{
			r = s.next();
		}while(!r.matches("[0-9]") && Integer.parseInt(r) < answer.length && Integer.parseInt(r) > 0);
		
		
		if (answer[Integer.parseInt(r) - 1].equals(risposta))
			return punteggio;
		else 
			return 0;
		
	}
}
