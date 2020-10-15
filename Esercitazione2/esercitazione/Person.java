package esercitazione;

public class Person {
	
	private String surname, name, taxCode, city;
	
	public Person() {
		this.surname = null;
		this.name = null;
		this.taxCode = null;
		this.city = null;
	}

	public Person(String surname, String name, String taxCode, String city) {
		this.surname = surname;
		this.name = name;
		this.taxCode = taxCode;
		this.city = city;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public int bornYear() {
		
		if (taxCode == null)
			return 0;
		int year = Integer.parseInt(taxCode.substring(6, 8));
		
		if (year > 20)
			year += 1900;
		else
			year += 2000;
		
		return year;
	}
}
