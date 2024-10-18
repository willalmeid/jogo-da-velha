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
			panelJogo.getButtonTopLeft().setText(simbolo);
			panelJogo.getButtonTopLeft().setEnabled(false);
			this.vez++;
			
		} else if(e.getSource() == panelJogo.getButtonTopCenter()) {
			panelJogo.getButtonTopCenter().setText(simbolo);
			panelJogo.getButtonTopCenter().setEnabled(false);
			this.vez++;
			
		} else if(e.getSource() == panelJogo.getButtonTopRight()) {
			panelJogo.getButtonTopRight().setText(simbolo);
			panelJogo.getButtonTopRight().setEnabled(false);
			this.vez++;

		} else if(e.getSource() == panelJogo.getButtonCenterLeft()) {
			panelJogo.getButtonCenterLeft().setText(simbolo);	
			panelJogo.getButtonCenterLeft().setEnabled(false);
			this.vez++;
			
		} else if(e.getSource() == panelJogo.getButtonCenterCenter()) {
			panelJogo.getButtonCenterCenter().setText(simbolo);
			panelJogo.getButtonCenterCenter().setEnabled(false);
			this.vez++;
			
		} else if(e.getSource() == panelJogo.getButtonCenterRight()) {
			panelJogo.getButtonCenterRight().setText(simbolo);	
			panelJogo.getButtonCenterRight().setEnabled(false);
			this.vez++;
			
		} else if(e.getSource() == panelJogo.getButtonBotLeft()) {
			panelJogo.getButtonBotLeft().setText(simbolo);	
			panelJogo.getButtonBotLeft().setEnabled(false);
			this.vez++;
			
		} else if(e.getSource() == panelJogo.getButtonBotCenter()) {	
			panelJogo.getButtonBotCenter().setText(simbolo);				
			panelJogo.getButtonBotCenter().setEnabled(false);
			this.vez++;
			
		} else if(e.getSource() == panelJogo.getButtonBotRight()) {
			panelJogo.getButtonBotRight().setText(simbolo);				
			panelJogo.getButtonBotRight().setEnabled(false);
			this.vez++;
	
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
			desabilitaBotoes();
		}
		
		//caso de empate
		if(this.vez == 9) {
			panelJogo.getLabelGanhador().setText("Empate!");
		}
	}

	//função que desabilita todos os botões após uma vitória
	private void desabilitaBotoes() { 
		panelJogo.getButtonTopLeft().setEnabled(false);	
		panelJogo.getButtonTopCenter().setEnabled(false);	
		panelJogo.getButtonTopRight().setEnabled(false);	
		panelJogo.getButtonCenterLeft().setEnabled(false);	
		panelJogo.getButtonCenterCenter().setEnabled(false);	
		panelJogo.getButtonCenterRight().setEnabled(false);	
		panelJogo.getButtonBotLeft().setEnabled(false);	
		panelJogo.getButtonBotCenter().setEnabled(false);	
		panelJogo.getButtonBotRight().setEnabled(false);	
	}
}
