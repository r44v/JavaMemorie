package View;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.MemoryModel;

public class StatusView extends JPanel implements Observer {
	// het model van het Memory spel;
	private MemoryModel model;
	private JLabel leftText;
	
	public StatusView() {
		GridLayout grid = new GridLayout();
		this.setLayout(grid);
		
		leftText = new JLabel("HelloWorld!");
		leftText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(leftText);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		leftText.setText("Observed");		
	}
}