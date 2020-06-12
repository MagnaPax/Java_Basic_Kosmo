package array;

public class House {

	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public House(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public House() {

	}

	public String showHouseInfo() {
		return name + ", " + type;
	}

}
