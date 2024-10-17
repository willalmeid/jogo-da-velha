package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visual.PanelJogo;

public class ControladorPanelJogo implements ActionListener {
	
	PanelJogo panelJogo;
	
	public ControladorPanelJogo(PanelJogo panelJogo) {
		this.panelJogo = panelJogo;
		addEventos();
	}

	private void addEventos() {
		panelJogo.getButtonTopLeft().addActionListener(this);	
		panelJogo.getButtonTopCenter().addActionListener(this);	
		panelJogo.getButtonTopRight().addActionListener(this);	
		panelJogo.getButtonCenterLeft().addActionListener(this);	
		panelJogo.getButtonCenterCenter().addActionListener(this);	
		panelJogo.getButtonCenterRight().addActionListener(this);	
		panelJogo.getButtonBotLeft().addActionListener(this);	
		panelJogo.getButtonBotCenter().addActionListener(this);	
		panelJogo.getButtonBotRight().addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e) {
//		String simbolo = (vez % 2 == 0) ? "X" : "O";
		if(e.getSource() == panelJogo.getButtonTopLeft()) {
//			panelJogo.getButtonTopLeft().setText(simbolo);
			panelJogo.getButtonTopLeft().setText("X");
		} else if(e.getSource() == panelJogo.getButtonTopCenter()) {
//			panelJogo.getButtonTopCenter().setText(simbolo);
			panelJogo.getButtonTopCenter().setText("X");
		} else if(e.getSource() == panelJogo.getButtonTopRight()) {
//			panelJogo.getButtonTopRight().setText(simbolo);
			panelJogo.getButtonTopRight().setText("X");
		} else if(e.getSource() == panelJogo.getButtonCenterLeft()) {
//			panelJogo.getButtonCenterLeft().setText(simbolo);
			panelJogo.getButtonCenterLeft().setText("X");
		} else if(e.getSource() == panelJogo.getButtonCenterCenter()) {
//			panelJogo.getButtonCenterCenter().setText(simbolo);
		} else if(e.getSource() == panelJogo.getButtonCenterRight()) {
//			panelJogo.getButtonCenterRight().setText(simbolo);
		} else if(e.getSource() == panelJogo.getButtonBotLeft()) {
//			panelJogo.getButtonBotLeft().setText(simbolo);
		} else if(e.getSource() == panelJogo.getButtonBotCenter()) {
//			panelJogo.getButtonBotCenter().setText(simbolo);
		} else if(e.getSource() == panelJogo.getButtonBotRight()) {
//			panelJogo.getButtonBotRigth().setText(simbolo);
		}
//      vez++;
	}
}
