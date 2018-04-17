package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import Model.MemoryModel;

public class MemoryView extends JPanel {
	//het model van het Memory spel;
	private MemoryModel model;
	
	public MemoryView() {
		GridLayout grid = new GridLayout(10, 10);
		this.setLayout(grid);
		
		List<JButton> tiles = new ArrayList<JButton>();
				
		for (int i = 0; i < 100; i++) {
			JButton btn = new JButton("X");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (btn.getText() == "X") {
						btn.setText("O");
					} else {
						btn.setText("X");
					}
					//javax.swing.JOptionPane.showMessageDialog(null, "Hey there");
				}
			});
			tiles.add(btn);
			this.add(btn);
		}
	}
}
