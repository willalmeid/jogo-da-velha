package Visual;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	
	public Frame() {
		super();
		this.setVisible(true); // Tornar ele visível.
		this.setSize(1280, 768); // Tamanho da Janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fechar quando apertar no x
		this.setLocationRelativeTo(null); // Abrir ele no centro da tela
	}
	
	public static void main(String[] args) {
		Frame window = new Frame();
		
		
		// Verificar Funcionalidade depois
		window.repaint();
		window.validate();
	}
}
