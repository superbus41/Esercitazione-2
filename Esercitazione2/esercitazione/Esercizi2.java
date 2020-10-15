package esercitazione;

import java.util.Random;

public class Esercizi2 {
	

	
	public static void main(String[] args) {
		
		TestQuestion();
		
		Person p = new Person("Conti", "Simone", "CNTSMN95A04D286S", "Cinisello Balsamo");
		System.out.println(p.getName());
		System.out.println(p.getSurname());
		System.out.println(p.bornYear());
		
		Stagista[] s = new Stagista[3];
		
		s[0] = new Stagista(null, "Marco", "ZVLBSH70L22C186R", null, 0, 0);
		s[1] = new Stagista(null, "Giovanni", "YXQHDP53M68G574U", null, 0, 0);
		s[2] = new Stagista(null, "Greta", "VIIVZU16D19A627X", null, 0, 0);
		
		Person youngest = new Person();
		
		for(Stagista x : s) {
			if (x.bornYear() > youngest.bornYear())
				youngest = x;
		}
		
		System.out.println("Lo stagista più giovane è " + youngest.getName());
		
		
		TestEmployee();
		TestVehicles();
		TestGarage();
		
		
	}
	
	private static void TestEmployee() {
		
		Employee[] e = new Employee[3];
		
		e[0] = new Employee(null, "Mattia", null, null, 0, 1000);
		e[1] = new Employee(null, "Serena", null, null, 0, 1200);
		e[2] = new Employee(null, "Gloria", null, null, 0, 1300);
		
		
		boolean swap = true;
		while(swap) {
			swap = false;
			for (int j = 0; j < e.length - 1; j++) {
				if (e[j].gainsMore(e[j+1])) {
					Employee temp = e[j];
					e[j] = e[j+1];
					e[j+1] = temp;
					swap = true;
 				}
			}
		}
		
		for (int i = e.length - 1; i >= 0 ; i--) {
			System.out.println(e[i].getName() + " " + e[i].getStipendio());
		}
	}
	
	private static void TestVehicles() {
		
		Vehicle[] v = new Vehicle[5];
		
		v[0] = new Car("ED754HD", null, null, false, null);
		v[1] = new Motocycle("CJ849KD", null, null, true, 0);
		v[2] = new Car("DR754IO", null, null, false, null);
		v[3] = new Car("EL837FU", null, null, true, null);
		v[4] = new Motocycle("DY487UC", null, null, false, 0);
		
		for (int i = 0; i < v.length; i++) {
			if (v[i].isGuasto())
				System.out.println(v[i].getTarga());
		}
	}
	
	public static void TestGarage() {
		
		Vehicle[] v = new Vehicle[5];
		
		v[0] = new Car("ED754HD", null, null, false, null);
		v[1] = new Motocycle("CJ849KD", null, null, true, 0);
		v[2] = new Car("DR754IO", null, null, false, null);
		v[3] = new Car("EL837FU", null, null, true, null);
		v[4] = new Motocycle("DY487UC", null, null, false, 0);
		
		Garage g = new Garage();
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(g.Repair(v[i]));
		}		
	}
	
	public static void TestQuestion() {
		
		int punteggio = 0;
		int r[] = new int[3];
		Random generator = new Random();
		Question[] q = new Question[10];
		
		q[0] = new Question("Domanda 1", "Risposta", 10);
		q[1] = new Question("Domanda 2", "Risposta", 12);
		q[2] = new QuestionYesNo("Domanda 3", "si", 6);
		q[3] = new QuestionYesNo("Domanda 4", "no", 5);
		q[4] = new Question("Domanda 5", "Risposta", 9);
		q[5] = new NumericQuestion("Domanda 6", "1969", 8);
		q[6] = new NumericQuestion("Domanda 7", "42", 10);
		q[7] = new QuestionYesNo("Domanda 8", "no", 7);
		String[] str1 = {"no", "no", "no", "Risposta", "no"};
		q[8] = new MultipleQuestion("Domanda 9", "Risposta", 8, str1);
		String[] str2 = {"no", "no", "Risposta", "no", "no"};
		q[9] = new MultipleQuestion("Domanda 10", "Risposta", 12, str2);
		
		for (int i = 0; i < r.length; i++) {
			int temp;
			do {
				temp = generator.nextInt(9);
			}while(contains(r, temp));		
			r[i] = temp;
			punteggio += q[r[i]].ask();
		}
		
		System.out.println("punteggio totale: " + punteggio);
	}
	
	static boolean contains(int[] array, int v) {
        boolean result = false;
        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }
        return result;
    }
	

}
