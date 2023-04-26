package F1_team;

public class Tires {
	private String manufacturer;
	private int size;
	
	public Tires(String manufacturer, int size) {
	    this.manufacturer = manufacturer;
	    this.size = size;
	}

	public String getManufacturer() {
	    return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
	    this.manufacturer = manufacturer;
	}

	public int getSize() {
	    return size;
	}

	public void setSize(int size) {
	    this.size = size;
	}
}
