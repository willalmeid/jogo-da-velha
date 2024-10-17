package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visual.PanelJogo;

public class ControladorPanelJogo implements ActionListener {

	PanelJogo panelJogo;
	
	public ControladorPanelJogo() {
		
	}

	private void addEventos() {
		panelJogo.getButtonTopLeft().addActionListener(this);	
		panelJogo.getButtonTopCenter().addActionListener(this);	
		panelJogo.getButtonTopRight().addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e) {
//		if(vez % 2 == 0) {
//			// Adicionar ao Buttun "X"
//		} else {
//			//Adicionar ao Button "O"
//		}
	}

}
