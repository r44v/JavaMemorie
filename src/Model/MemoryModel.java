package Model;

import java.util.List;
import java.util.Observable;
import java.util.Timer;

public class MemoryModel extends Observable {
	// het aantal rijen van het speelbord;
	private int numberOfRows;
	
	// het aantal kolommen van het speelbord;
	private int numberOfColumns;
	
	// de ‘tegeltjes’ van het Memory spel;
	private Tile[][] tiles;
	
	// een ArrayList met de (maximaal 2) geselecteerde tiles;
	private List<Tile> guesses;
	
	// de timer die er voor zorgt dat de 2 getoonde plaatjes weer verborgen worden;
	private Timer timer;
	
	public void Change() {
		setChanged();
		notifyObservers();
	}
}