package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visual.PanelJogo;

public class ControladorPanelJogo implements ActionListener {
	
	int vez;
	int jogador;
	String simbolo;
	PanelJogo panelJogo;
	
	String a1, b1, c1, a2, b2, c2, a3, b3, c3;	
	
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
		
		this.jogador = (this.vez % 2 == 0) ? 1 : 2;
		
		// Trocar label da vez dos Jogadores
		if(this.jogador == 1) {
			panelJogo.getLabelJogada().setText("Vez do Jogador 1");
		} else if(this.jogador == 2) {
			panelJogo.getLabelJogada().setText("Vez do Jogador 2");		
		}
		
		/*
		 * a1 b1 c1
		 * a2 b2 c2
		 * a3 b3 c3
		 * */
		this.a1 = panelJogo.getButtonTopLeft().getText();
		this.b1 = panelJogo.getButtonTopCenter().getText();
		this.c1 = panelJogo.getButtonTopRight().getText();
		this.a2 = panelJogo.getButtonCenterLeft().getText();
		this.b2 = panelJogo.getButtonCenterCenter().getText();
		this.c2 = panelJogo.getButtonCenterRight().getText();
		this.a3 = panelJogo.getButtonBotLeft().getText();
		this.b3 = panelJogo.getButtonBotCenter().getText();
		this.c3 = panelJogo.getButtonBotRight().getText();
		
		//Adicionar Condição de vitória
		if(
			a1 != "" && a1 == b1 && b1 == c1 || // Linhas
			a2 != "" && a2 == b2 && b2 == c2 ||
			a3 != "" && a3 == b3 && b3 == c3 ||
			a1 != "" && a1 == a2 && a2 == a3 || // Colunas
			b1 != "" && b1 == b2 && b2 == b3 ||
			c1 != "" && c1 == c2 && c2 == c3 ||
			a1 != "" && a1 == b2 && b2 == c3 || // Diagonais
			c1 != "" && c1 == b2 && b2 == a3
		) {
			if (this.vez % 2 == 0){
				panelJogo.getLabelGanhador().setText("O jogador 2 é o vencedor!");				
			} else {
				panelJogo.getLabelGanhador().setText("O jogador 1 é o vencedor!");				
			}
		}
	}
}
