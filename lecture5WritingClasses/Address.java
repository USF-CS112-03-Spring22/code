public class Address {
	private String city;
	private String street;
	private int houseNumber;


	public Address(String city, String street, int number) {
		this.city = city;
		this.street = street;
		this.houseNumber = number;
	}

	public void setCity(String newCity) {
		if (!newCity.equals(""))
			city = newCity;
	}

	public void setNumber(int number) {
		if (number > 0)
			houseNumber = number;
	}

	public void setStreet(String streetName) {
		street = streetName;
	}


	public String toString() {

		return houseNumber + " " + street + System.lineSeparator() + city ;
	}

}