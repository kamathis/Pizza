//Kristi Mathis
public class Address {

	private String house;
	private String street;
	private String apt;
	private String city;
	private String state;
	private String zip;

	public Address(String house, String street, String apt, String city, String state, String zip) {
		setHouse(house);
		setStreet(street);
		setApt(apt);
		setCity(city);
		setState(state);
		setZip(zip);

		if (getState() == null || getZip() == null) {
			throw new IllegalArgumentException("Pizza not created.");
		}
	}

	public Address(String house, String street, String city, String state, String zip) {
		setHouse(house);
		setStreet(street);
		setCity(city);
		setState(state);
		setZip(zip);

		if (getState() == null || getZip() == null) {
			throw new IllegalArgumentException("Pizza not created.");
		}
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		if (state.length() == 2) {
			this.state = state;
		}
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		if (zip.length() == 5) {
			this.zip = zip;
		}
	}

	public void print() {
		getApt();
		if (apt != null) {
			System.out.println(getHouse() + " " + getStreet() + " " + getApt());
			System.out.println(getCity() + " " + getState() + " " + getZip());
		} else {
			System.out.println(getHouse() + " " + getStreet());
			System.out.println(getCity() + " " + getState() + " " + getZip());
		}
	}
}
