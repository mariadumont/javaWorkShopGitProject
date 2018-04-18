package main.workshopgitproject.classes;

public class ClientAddress {
	/**
	 * Description of the property village.
	 */
	private String village;
	/**
	 * Description of the property country.
	 */
	private String country;
	/**
	 * Description of the property streetNumber.
	 */
	private int streetNumber;
	/**
	 * Description of the property streetName.
	 */
	private String streetName;
	/**
	 * Description of the property province.
	 */
	private String province;

	public ClientAddress(String village, String country, int streetNumber, String streetName, String province) {
		this.village = village;
		this.country = country;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.province = province;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}