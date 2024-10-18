package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visual.Frame;
import Visual.PanelTelaInicial;

public class ControladorFrame implements ActionListener{

	Frame frame;
	
	PanelTelaInicial panelTelaInicial;
	ControladorPanelTelaInicial controladorPanelTelaInicial;
	
	public ControladorFrame() {
		frame = new Frame();
		panelTelaInicial = new PanelTelaInicial();
		controladorPanelTelaInicial = new ControladorPanelTelaInicial(panelTelaInicial, frame);
		frame.setContentPane(panelTelaInicial);
		frame.revalidate();
		frame.repaint();
	}

	public void actionPerformed(ActionEvent e) {
			
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}

}
