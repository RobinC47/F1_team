package F1_team;

public class Body {
	private String material;
	private int weight;
	
	public Body(String material, int weight) {
	    this.material = material;
	    this.weight = weight;
	}

	public String getMaterial() {
	    return material;
	}

	public void setMaterial(String material) {
	    this.material = material;
	}

	public int getWeight() {
	    return weight;
	}

	public void setWeight(int weight) {
	    this.weight = weight;
	}
}
