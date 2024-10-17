package Visual;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelJogo extends JPanel{
	
	private JButton buttonCenterCenter;
	private JButton buttonTopCenter;
	private JButton buttonBotCenter;
	private JButton buttonBotLeft;
	private JButton buttonBotRight;
	private JButton buttonCenterLeft;
	private JButton buttonCenterRigth;
	private JButton buttonTopLeft;
	private JButton buttonTopRight;
	private JLabel labelTitle;
	private JLabel labelJogada;
	private JLabel lblOJogador;
	
	public PanelJogo() {
		setLayout(null);
		this.setSize(1280, 720);
		
		
		add(getButtonTopLeft());
		add(getButtonTopCenter());
		add(getButtonTopRight());
		add(getButtonCenterLeft());
		add(getButtonCenterCenter());
		add(getButtonCenterRight());
		add(getButtonBotLeft());
		add(getButtonBotCenter());
		add(getButtonBotRight());
		add(getLabelTitle());
		add(getLabelJogada());
		add(getLblOJogador());
		
	}
	
	//------------------------------------------------------------- Labal Access Methods ---------------------------------------------------------------------
	public JLabel getLabelTitle() {
		if (labelTitle == null) {
			labelTitle = new JLabel("Jogo da Velha");
			labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitle.setBounds(528, 11, 223, 44);
		}
		return labelTitle;
	}
	public JLabel getLabelJogada() {
		if (labelJogada == null) {
			labelJogada = new JLabel("Vez do Jogador 1");
			labelJogada.setFont(new Font("Tahoma", Font.PLAIN, 20));
			labelJogada.setBounds(397, 81, 485, 25);
		}
		return labelJogada;
	}
	
	//------------------------------------------------------------- Button Access Methods ---------------------------------------------------------------------
	public JButton getButtonTopLeft() {
		if (buttonTopLeft == null) {
			buttonTopLeft = new JButton();
			buttonTopLeft.setFont(new Font("Tahoma", Font.BOLD, 50));
			buttonTopLeft.setBounds(397, 115, 155, 156);
		}
		return buttonTopLeft;
	}
	
	public JButton getButtonTopCenter() {
		if (buttonTopCenter == null) {
			buttonTopCenter = new JButton();
			buttonTopCenter.setFont(new Font("Tahoma", Font.BOLD, 50));
			buttonTopCenter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttonTopCenter.setBounds(562, 115, 155, 156);
		}
		return buttonTopCenter;
	}
	
	public JButton getButtonTopRight() {
		if (buttonTopRight == null) {
			buttonTopRight = new JButton();
			buttonTopRight.setBounds(727, 115, 155, 156);
			buttonTopRight.setFont(new Font("Tahoma", Font.BOLD, 50));
		}
		return buttonTopRight;
	}
	
	public JButton getButtonCenterLeft() {
		if (buttonCenterLeft == null) {
			buttonCenterLeft = new JButton();
			buttonCenterLeft.setBounds(397, 282, 155, 156);
			buttonCenterLeft.setFont(new Font("Tahoma", Font.BOLD, 50));
		}
		return buttonCenterLeft;
	}
	
	public JButton getButtonCenterCenter() {
		if (buttonCenterCenter == null) {
			buttonCenterCenter = new JButton();
			buttonCenterCenter.setFont(new Font("Tahoma", Font.BOLD, 50));
			buttonCenterCenter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttonCenterCenter.setBounds(562, 282, 155, 156);
		}
		return buttonCenterCenter;
	}
	
	public JButton getButtonCenterRight() {
		if (buttonCenterRigth == null) {
			buttonCenterRigth = new JButton();
			buttonCenterRigth.setBounds(727, 282, 155, 156);
			buttonCenterRigth.setFont(new Font("Tahoma", Font.BOLD, 50));
		}
		return buttonCenterRigth;
	}
	
	public JButton getButtonBotLeft() {
		if (buttonBotLeft == null) {
			buttonBotLeft = new JButton();
			buttonBotLeft.setBounds(397, 449, 155, 156);
			buttonBotLeft.setFont(new Font("Tahoma", Font.BOLD, 50));
		}
		return buttonBotLeft;
	}
	
	public JButton getButtonBotCenter() {
		if (buttonBotCenter == null) {
			buttonBotCenter = new JButton();
			buttonBotCenter.setBounds(562, 449, 155, 156);
			buttonBotCenter.setFont(new Font("Tahoma", Font.BOLD, 50));
		}
		return buttonBotCenter;
	}
	
	public JButton getButtonBotRight() {
		if (buttonBotRight == null) {
			buttonBotRight = new JButton();
			buttonBotRight.setBounds(727, 449, 155, 156);
			buttonBotRight.setFont(new Font("Tahoma", Font.BOLD, 50));
		}
		return buttonBotRight;
	}
	
	// RESULTADO
	public JLabel getLblOJogador() {
		if (lblOJogador == null) {
			lblOJogador = new JLabel("O Jogador 1 Ganhou!");
			lblOJogador.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblOJogador.setBounds(545, 616, 190, 25);
		}
		return lblOJogador;
	}
}
