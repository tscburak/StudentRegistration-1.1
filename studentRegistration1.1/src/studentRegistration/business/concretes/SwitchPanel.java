package studentRegistration.business.concretes;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class SwitchPanel {
	
	

	public void switchPaneltoRegistered(JPanel panel, JLayeredPane layeredPane, JButton btnKayitFormu, JButton btnOgrenciler) {

		btnKayitFormu.setBackground(SystemColor.controlHighlight);
		btnOgrenciler.setBackground(Color.WHITE);
		
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	public void switchPaneltoStudent(JPanel panel, JLayeredPane layeredPane, JButton btnKayitFormu, JButton btnOgrenciler) {

		btnKayitFormu.setBackground(Color.WHITE);
		btnOgrenciler.setBackground(SystemColor.controlHighlight);
		
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	

}
