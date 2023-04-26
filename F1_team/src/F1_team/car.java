package F1_team;

import java.util.ArrayList;

public class car {
	    private int number;
	    private ArrayList<part> parts;
	    private ArrayList<employee> mecanics;

	    public car(int number) {
	        this.number = number;
	        this.parts = new ArrayList<part>();
	        this.mecanics = new ArrayList<employee>();
	    }

	    // Getters and Setters
	    public int getCarNumber() {
	        return number;
	    }

	    public void setCarNumber(int number) {
	        this.number = number;
	    }

	    public ArrayList<part> getParts() {
	        return parts;
	    }

	    public void setPieces(ArrayList<part> parts) {
	        this.parts = parts;
	    }

	    public void addParts(part parts) {
	        this.parts.add(parts);
	    }

	    public ArrayList<employee> getMecanics() {
	        return mecanics;
	    }

	    public void setMecanics(ArrayList<employee> mecanics) {
	        this.mecanics = mecanics;
	    }

	    public void ajouterMecanic(employee mecanics) {
	        this.mecanics.add(mecanics);
	    }
	}

}
