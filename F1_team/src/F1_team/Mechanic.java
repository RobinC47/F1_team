package F1_team;

public class Mechanic {
    private String name;
    private String specialty;

    public Mechanic(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
    	this.specialty = specialty;
    }
}
