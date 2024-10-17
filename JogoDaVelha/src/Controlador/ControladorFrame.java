package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visual.Frame;
import Visual.PanelJogo;

public class ControladorFrame implements ActionListener{

	Frame frame;
	
	PanelJogo panelJogo;
	ControladorPanelJogo controladorPanelJogo;
	
	public ControladorFrame() {
		frame = new Frame();
		frame.revalidate();
		frame.repaint();
		
	}

	public void actionPerformed(ActionEvent e) {
			
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		PanelJogo panelJogo = new PanelJogo();
		
		frame.setContentPane(panelJogo);
		
		// Verificar Funcionalidade depois
		frame.repaint();
		frame.validate();
	}

}
