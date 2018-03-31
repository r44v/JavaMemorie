package Model;

import java.util.Observable;

public class Tile extends Observable {
	
	// elke tile krijgt een getal toegekend;
	private int number;
	
	//true als het plaatje ‘omgedraaid’ is, en dus getoond moet worden;
	private boolean selected;
	
	//true als het plaatje geraden is (en dus ook getoond moet worden);
	private boolean guessed;
	
	//Some Getters/Setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean isGuessed() {
		return guessed;
	}

	public void setGuessed(boolean guessed) {
		this.guessed = guessed;
	}
}
