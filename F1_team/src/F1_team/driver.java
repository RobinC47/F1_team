package F1_team;
public class driver extends employee{
	boolean driver1;
	
    public driver(String name, String position, int salary) {
        super(name, position, salary);
    }

	public boolean isDriver1() {
		return driver1;
	}

	public void setDriver1(boolean driver1) {
		this.driver1 = driver1;
	}

    
}
