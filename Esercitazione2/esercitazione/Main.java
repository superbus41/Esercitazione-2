package esercitazione;

import java.util.Random;

public class Main {
	

	
	public static void main(String[] args) {
			
		TestStagista();
		TestEmployee();
		TestVehicles();
		TestGarage();
		TestQuestion();
		
		
	}
	
	private static void TestStagista() {
		
		Person p = new Person("Conti", "Simone", "CNTSMN95A04D286S", "Cinisello Balsamo");
		System.out.println(p.getName());
		System.out.println(p.getSurname());
		System.out.println(p.bornYear());
		
		Stagista[] s = new Stagista[3];
		
		s[0] = new Stagista("Rossi", "Marco", "ZVLBSH70L22C186R", "Milano", 0, 0);
		s[1] = new Stagista("Ferrari", "Giovanni", "YXQHDP53M68G574U", "Torino", 0, 0);
		s[2] = new Stagista("Russo", "Greta", "VIIVZU16D19A627X", "Bergamo", 0, 0);
		
		Person youngest = new Person();
		
		for(Stagista x : s) {
			if (x.bornYear() > youngest.bornYear())
				youngest = x;
		}
		
		System.out.println("Lo stagista più giovane è " + youngest.getName());
	}
	
	private static void TestEmployee() {
		
		Employee[] e = new Employee[3];
		
		e[0] = new Employee("Bianchi", "Mattia", "NSPJTZ93M12C006Z", "Bari", 0, 1000);
		e[1] = new Employee("Romano", "Serena", "TMDDCD59H45A651Q", "Napoli", 0, 1200);
		e[2] = new Employee("Gallo", "Gloria", "VYLWSH45B12L742G", "Roma", 0, 1300);
		
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
		
		v[0] = new Car("ED754HD", "Fiat", "Punto", false, "utilitaria");
		v[1] = new Motocycle("CJ849KD", "BMW", "R 1250 GS", true, 1250);
		v[2] = new Car("DR754IO", "peugeot", "206", false, "sportiva");
		v[3] = new Car("EL837FU", "Fiat", "Panda", true, "utilitaria");
		v[4] = new Motocycle("DY487UC", "Honda", "Africa Twins", false, 1084);
		
		for (int i = 0; i < v.length; i++) {
			if (v[i].isGuasto())
				System.out.println(v[i].getTarga());
		}
	}
	
	public static void TestGarage() {
		
		Vehicle[] v = new Vehicle[5];
		
		v[0] = new Car("ED754HD", "Fiat", "Punto", false, "utilitaria");
		v[1] = new Motocycle("CJ849KD", "BMW", "R 1250 GS", true, 1250);
		v[2] = new Car("DR754IO", "peugeot", "206", false, "sportiva");
		v[3] = new Car("EL837FU", "Fiat", "Panda", true, "utilitaria");
		v[4] = new Motocycle("DY487UC", "Honda", "Africa Twins", false, 1084);
		
		Garage g = new Garage();
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Costo di riparazione: " + g.Repair(v[i]) + " euro");
		}		
	}
	
	public static void TestQuestion() {
		
		int punteggio = 0;
		int r[] = new int[3];
		Random generator = new Random();
		Question[] q = new Question[10];
		
		q[0] = new Question("Qual'è la montagna più alta al mondo?", "Everest", 10);
		q[1] = new Question("Qual'è il nome del presidente americano durante la caduta del muro di berlino?", "Reagan", 12);
		q[2] = new QuestionYesNo("L'italia confina con la Francia? (si/no)", "si", 6);
		q[3] = new QuestionYesNo("L'italia non ha mai ospitato le olimpiadi? (si/no)", "no", 5);
		q[4] = new Question("Quale moneta c'era prima dell'euro in Spagna?", "Peseta", 9);
		q[5] = new NumericQuestion("Quando è avvenuto lo sbarco sulla luna?", "1969", 8);
		q[6] = new NumericQuestion("Quanti kilometri è lunga una maratona?", "42", 10);
		q[7] = new QuestionYesNo("la torre Eifell è l'edificio più alto di parigi? (si/no)", "si", 7);
		String[] str1 = {"Giallo", "Verde", "Azzurro", "Grigio", "Mekong"};
		q[8] = new MultipleQuestion("Qual è il fiume più lungo della Cina", "Azzurro", 8, str1);
		String[] str2 = {"Roma", "Firenze", "Gerusalemme", "Parigi", "Sydney"};
		q[9] = new MultipleQuestion("Sotto quale città si trova l'ingresso dell'inferno di Dante?", "Gerusalemme", 12, str2);
		
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
