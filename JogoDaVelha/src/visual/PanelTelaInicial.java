package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PanelTelaInicial extends JPanel {
	
	private JLabel labelTitle;
	private JButton buttonJogar;
	
	public PanelTelaInicial() {
		setLayout(null);
		this.setSize(1280, 720);
		add(getLabelTitle());
		add(getButtonJogar());	
	}
	
	public JLabel getLabelTitle() {
		if (labelTitle == null) {
			labelTitle = new JLabel("Jogo da Velha");
			labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitle.setBounds(528, 11, 223, 44);
		}
		return labelTitle;
	}
	public JButton getButtonJogar() {
		if (buttonJogar == null) {
			buttonJogar = new JButton("Jogar");
			buttonJogar.setFont(new Font("Tahoma", Font.BOLD, 30));
			buttonJogar.setBounds(528, 333, 223, 76);
		}
		return buttonJogar;
	}
}
