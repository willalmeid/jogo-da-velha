package Visual;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelJogo extends JPanel implements ActionListener{
	
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
	
	public PanelJogo() {
		setLayout(null);
		this.setSize(1280, 720);
		
		
		add(getButtonCenterCenter());
		add(getButtonTopCenter());
		add(getButtonBotCenter());
		add(getButtonBotLeft());
		add(getButtonBotRight());
		add(getButtonCenterLeft());
		add(getButtonCenterRigth());
		add(getButtonTopLeft());
		add(getButtonTopRight());
		add(getLabelTitle());
		add(getLabelJogada());
		
	}
	
	//------------------------------------------------------------- Methods of Access ---------------------------------------------------------------------
	private JButton getButtonCenterCenter() {
		if (buttonCenterCenter == null) {
			buttonCenterCenter = new JButton("");
			buttonCenterCenter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttonCenterCenter.setBounds(562, 282, 155, 156);
		}
		return buttonCenterCenter;
	}
	
	private JButton getButtonTopCenter() {
		if (buttonTopCenter == null) {
			buttonTopCenter = new JButton("");
			buttonTopCenter.setBounds(562, 115, 155, 156);
		}
		return buttonTopCenter;
	}
	private JButton getButtonBotCenter() {
		if (buttonBotCenter == null) {
			buttonBotCenter = new JButton("");
			buttonBotCenter.setBounds(562, 449, 155, 156);
		}
		return buttonBotCenter;
	}
	
	private JButton getButtonBotLeft() {
		if (buttonBotLeft == null) {
			buttonBotLeft = new JButton("");
			buttonBotLeft.setBounds(397, 449, 155, 156);
		}
		return buttonBotLeft;
	}
	
	private JButton getButtonBotRight() {
		if (buttonBotRight == null) {
			buttonBotRight = new JButton("");
			buttonBotRight.setBounds(727, 449, 155, 156);
		}
		return buttonBotRight;
	}
	
	private JButton getButtonCenterLeft() {
		if (buttonCenterLeft == null) {
			buttonCenterLeft = new JButton("");
			buttonCenterLeft.setBounds(397, 282, 155, 156);
		}
		return buttonCenterLeft;
	}
	
	private JButton getButtonCenterRigth() {
		if (buttonCenterRigth == null) {
			buttonCenterRigth = new JButton("");
			buttonCenterRigth.setBounds(727, 282, 155, 156);
		}
		return buttonCenterRigth;
	}
	
	private JButton getButtonTopLeft() {
		if (buttonTopLeft == null) {
			buttonTopLeft = new JButton("");
			buttonTopLeft.setBounds(397, 115, 155, 156);
		}
		return buttonTopLeft;
	}
	
	private JButton getButtonTopRight() {
		if (buttonTopRight == null) {
			buttonTopRight = new JButton("");
			buttonTopRight.setBounds(727, 115, 155, 156);
		}
		return buttonTopRight;
	}

	// 
	
	private void addEventos() {
		getButtonTopLeft().addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent e) {
//		if(vez % 2 == 0) {
//			// Adicionar ao Buttun "X"
//		} else {
//			//Adicionar ao Button "O"
//		}
	}
	private JLabel getLabelTitle() {
		if (labelTitle == null) {
			labelTitle = new JLabel("Jogo da Velha");
			labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitle.setBounds(528, 11, 223, 44);
		}
		return labelTitle;
	}
	private JLabel getLabelJogada() {
		if (labelJogada == null) {
			labelJogada = new JLabel("Vez do Jogador 1");
			labelJogada.setFont(new Font("Tahoma", Font.PLAIN, 20));
			labelJogada.setBounds(397, 81, 485, 25);
		}
		return labelJogada;
	}
}
