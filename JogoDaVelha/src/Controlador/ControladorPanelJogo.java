package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visual.PanelJogo;

public class ControladorPanelJogo implements ActionListener {
	
	int vez;
	int jogador;
	String simbolo;
	PanelJogo panelJogo;
	
	public ControladorPanelJogo(PanelJogo panelJogo) {
		this.vez = 0;
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
		
		this.jogador = (this.vez % 2 == 0) ? 2 : 1;
    	this.simbolo = (this.vez % 2 == 0) ? "X" : "O";
    	
    	// Teste dos botões
		if(e.getSource() == panelJogo.getButtonTopLeft()) {
			if(panelJogo.getButtonTopLeft().getText() == "") {
				panelJogo.getButtonTopLeft().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonTopCenter()) {
			if(panelJogo.getButtonTopCenter().getText() == "") {
				panelJogo.getButtonTopCenter().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonTopRight()) {
			if(panelJogo.getButtonTopRight().getText() == "") {
				panelJogo.getButtonTopRight().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonCenterLeft()) {
			if(panelJogo.getButtonCenterLeft().getText() == "") {
				panelJogo.getButtonCenterLeft().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonCenterCenter()) {
			if(panelJogo.getButtonCenterCenter().getText() == "") {
				panelJogo.getButtonCenterCenter().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonCenterRight()) {
			if(panelJogo.getButtonCenterRight().getText() == "") {
				panelJogo.getButtonCenterRight().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonBotLeft()) {
			if(panelJogo.getButtonBotLeft().getText() == "") {
				panelJogo.getButtonBotLeft().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonBotCenter()) {
			if(panelJogo.getButtonBotCenter().getText() == "") {
				panelJogo.getButtonBotCenter().setText(simbolo);				
				this.vez++;
			}
		} else if(e.getSource() == panelJogo.getButtonBotRight()) {
			if(panelJogo.getButtonBotRight().getText() == "") {
				panelJogo.getButtonBotRight().setText(simbolo);				
				this.vez++;
			}
		}
		
		// Trocar label da vez dos Jogadores
		if(this.jogador == 1) {
			panelJogo.getLabelJogada().setText("Vez do Jogador 1");
		} else if(this.jogador == 2) {
			panelJogo.getLabelJogada().setText("Vez do Jogador 2");		
		}
	}
}
