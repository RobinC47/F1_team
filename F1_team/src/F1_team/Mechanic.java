package F1_team;

public class Mechanic extends Employee{
    private String specialty;

    public Mechanic(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
    	this.specialty = specialty;
    }
}
