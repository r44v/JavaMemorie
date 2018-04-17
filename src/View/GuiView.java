package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiView extends JFrame {
	
	public GuiView() {
		this.setTitle("Memorie game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		
		JPanel outerPanel = new JPanel();

		BorderLayout borderLayout = new BorderLayout();
		outerPanel.setLayout(borderLayout);
		setContentPane(outerPanel);
		
		outerPanel.add(new KnoppenBalk(), borderLayout.NORTH);
		outerPanel.add(new MemoryView(), borderLayout.CENTER);
		outerPanel.add(new StatusView(), borderLayout.SOUTH);
	}
}
