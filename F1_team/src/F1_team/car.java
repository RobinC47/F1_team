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

	    public ArrayList<PieceVoiture> getPieces() {
	        return pieces;
	    }

	    public void setPieces(ArrayList<PieceVoiture> pieces) {
	        this.pieces = pieces;
	    }

	    public void ajouterPiece(PieceVoiture piece) {
	        this.pieces.add(piece);
	    }

	    public ArrayList<Mecanicien> getMecaniciens() {
	        return mecaniciens;
	    }

	    public void setMecaniciens(ArrayList<Mecanicien> mecaniciens) {
	        this.mecaniciens = mecaniciens;
	    }

	    public void ajouterMecanicien(Mecanicien mecanicien) {
	        this.mecaniciens.add(mecanicien);
	    }
	}

}
