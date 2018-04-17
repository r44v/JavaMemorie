package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Model.MemoryModel;

public class KnoppenBalk extends JPanel {
	//het model van het Memory spel;
	private MemoryModel model;
	
	public KnoppenBalk() {
		
		GridLayout grid = new GridLayout();
		this.setLayout(grid);
		
		//Btn 1
		JButton btn = new JButton("Test btn");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				javax.swing.JOptionPane.showMessageDialog(null, "Hey there");
			}
		});
		this.add(btn);
		
		//Btn 2
		JButton btn2 = new JButton("Test btn 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				javax.swing.JOptionPane.showMessageDialog(null, "Hey again");
			}
		});
		this.add(btn2);
	}
}
