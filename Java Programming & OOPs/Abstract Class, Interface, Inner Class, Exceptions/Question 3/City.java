import java.util.HashMap;

public class City {
	private HashMap<Integer, String> cities = new HashMap<>();

	public HashMap<Integer, String> getCities() {
		return cities;
	}

	public void setCity(int pincode, String cityName) {
		cities.put(pincode, cityName);
	}

	public String findCity(int pinCode) throws Exception {
		String city = cities.get(pinCode);
		if (city == null) {
			throw new CityNotFoundException("City not Found");
		}
		return city;
	}
}

class CityNotFoundException extends Exception {
	public CityNotFoundException(String m) {
		super(m);
	}
}
