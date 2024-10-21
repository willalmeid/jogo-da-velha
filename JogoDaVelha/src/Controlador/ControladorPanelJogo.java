package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Visual.PanelJogo;

public class ControladorPanelJogo implements ActionListener {
	
	int vez;
	String simbolo;
	PanelJogo panelJogo;
	
	/* Posição dos Botões
	 * a1 b1 c1
	 * a2 b2 c2
	 * a3 b3 c3
	 * */
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
		panelJogo.getButtonJogarDeNovo().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() == panelJogo.getButtonJogarDeNovo()) {
			this.vez = 0;
			limparPanel();
			habilitarBotoes();
			desativarButtonJogarDeNovo();
		} else if(e.getSource() instanceof JButton) { // Ele verica se o e.getSouce() é um botão
    		JButton botao = (JButton) e.getSource();
    		atualizarTabuleiro(botao);    		
    	}
		
		atualizarVezJogador();
		
		carregarValoresDoTabuleiro();
		
		avaliarEstadoDoJogo();
	}
	
	/* ---------------------------------------------------------- Funções de Jogo ------------------------------------------------------------- */ 
	
	// Função que decide a vez do jogador
	private void atualizarVezJogador() {
		int jogador = (this.vez % 2) == 0 ? 1 : 2;
		panelJogo.getLabelJogada().setText("Vez do Jogador " + jogador);
	}
	
	
	// Função que decide qual jogador ganhou
	private void definirJogadorVencedor() {
		int jogador = this.vez % 2 != 0 ? 1 : 2;
		panelJogo.getLabelGanhador().setText("O jogador " + jogador + " é o vencedor!");
	}
	
	
	// Atulização das variáveis para teste de vitória
	private void carregarValoresDoTabuleiro() {
		this.a1 = panelJogo.getButtonTopLeft().getText();
		this.b1 = panelJogo.getButtonTopCenter().getText();
		this.c1 = panelJogo.getButtonTopRight().getText();
		this.a2 = panelJogo.getButtonCenterLeft().getText();
		this.b2 = panelJogo.getButtonCenterCenter().getText();
		this.c2 = panelJogo.getButtonCenterRight().getText();
		this.a3 = panelJogo.getButtonBotLeft().getText();
		this.b3 = panelJogo.getButtonBotCenter().getText();
		this.c3 = panelJogo.getButtonBotRight().getText();
	}
	
	
	private void avaliarEstadoDoJogo() {
		
		if(
			this.a1 != "" && this.a1 == this.b1 && this.b1 == this.c1 || // Linhas
			this.a2 != "" && this.a2 == this.b2 && this.b2 == this.c2 ||
			this.a3 != "" && this.a3 == this.b3 && this.b3 == this.c3 ||
			this.a1 != "" && this.a1 == this.a2 && this.a2 == this.a3 || // Colunas
			this.b1 != "" && this.b1 == this.b2 && this.b2 == this.b3 ||
			this.c1 != "" && this.c1 == this.c2 && this.c2 == this.c3 ||
			this.a1 != "" && this.a1 == this.b2 && this.b2 == this.c3 || // Diagonais
			this.c1 != "" && this.c1 == this.b2 && this.b2 == this.a3
		) {
			panelJogo.getLabelJogada().setText("");
			
			definirJogadorVencedor();
			desabilitarBotoes();
			ativarButtonJogarDeNovo();
			
		} else if(this.vez == 9) {
			panelJogo.getLabelGanhador().setText("Empate!");
			ativarButtonJogarDeNovo();
			
		}
	}

	
	/* ---------------------------------------------------------- Modularização ------------------------------------------------------------- */ 
	
	private void atualizarTabuleiro(JButton botao) {
		this.simbolo = (this.vez % 2 == 0) ? "X" : "O";
		botao.setText(simbolo);
		botao.setEnabled(false);
		this.vez++;
	}
	
	
	// Função que ativa o botão de jogar de novo
	private void ativarButtonJogarDeNovo() {
		panelJogo.getButtonJogarDeNovo().setEnabled(true);
		panelJogo.getButtonJogarDeNovo().setVisible(true);
	}
	
	// Função que desativa o botão de jogar de novo
	private void desativarButtonJogarDeNovo() {
		panelJogo.getButtonJogarDeNovo().setEnabled(false);
		panelJogo.getButtonJogarDeNovo().setVisible(false);
	}
	
	
	// Função que desabilita todos os botões após uma vitória
	private void desabilitarBotoes() { 
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
	
	
	// Função que habilita todos os botões após jogar de novo
	private void habilitarBotoes() {
		panelJogo.getButtonTopLeft().setEnabled(true);	
		panelJogo.getButtonTopCenter().setEnabled(true);	
		panelJogo.getButtonTopRight().setEnabled(true);	
		panelJogo.getButtonCenterLeft().setEnabled(true);	
		panelJogo.getButtonCenterCenter().setEnabled(true);	
		panelJogo.getButtonCenterRight().setEnabled(true);	
		panelJogo.getButtonBotLeft().setEnabled(true);	
		panelJogo.getButtonBotCenter().setEnabled(true);	
		panelJogo.getButtonBotRight().setEnabled(true);
	}
	
	
	// Função que limpa todo o panel após jogar de novo
	private void limparPanel() {
		panelJogo.getButtonTopLeft().setText("");	
		panelJogo.getButtonTopCenter().setText("");
		panelJogo.getButtonTopRight().setText("");
		panelJogo.getButtonCenterLeft().setText("");
		panelJogo.getButtonCenterCenter().setText("");
		panelJogo.getButtonCenterRight().setText("");
		panelJogo.getButtonBotLeft().setText("");
		panelJogo.getButtonBotCenter().setText("");
		panelJogo.getButtonBotRight().setText("");
		panelJogo.getLabelGanhador().setText("");
	}
}
