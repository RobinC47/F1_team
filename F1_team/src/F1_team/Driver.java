package F1_team;

import java.io.FileWriter;
import java.io.IOException;

public class Driver extends Employee{
    private Formula1Team team;

    public Driver(String name, int age, Formula1Team team) {
        super(name, age);
        this.team = team;
    }

    public Formula1Team getTeam() {
        return team;
    }

    public void setTeam(Formula1Team team) {
        this.team = team;
    }
    
    public static void write(Driver driver) {
	    try {
	      FileWriter fw = new FileWriter("Driver.txt");
	      fw.write("Name : "+driver.getName()+" Age : "+driver.getAge());
	      fw.close();
	      System.out.println("Le texte a été écrit avec succès");
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
}
