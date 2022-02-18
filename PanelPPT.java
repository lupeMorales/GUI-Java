package PiedraPapelTijera2;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CaraCruz.ButtonCaraCruz;
import CaraCruz.PanelCaraCruz;

public class PanelPPT extends JPanel {

	public static PanelPPT panePPTImplement = null;
	public ButtonPPT button1, button2, button3, button4, button5, button6, button7, buttonPlay;
	public LabelPPT label1, label2, label3, label4, labelPuntuacion1, labelPuntuacion2, labelPartidas, labelNPartidas;

	public PanelPPT() {
		super();

		panePPTImplement = this;

		setLayout(null);

		label1 = new LabelPPT(300, 20, 200, 200, "Score Player 1");
		add(label1);
		labelPuntuacion1 = new LabelPPT(300, 20, 200, 250, "0");
		add(labelPuntuacion1);
		label2 = new LabelPPT(300, 20, 200, 350, "Score Player 2");
		add(label2);
		labelPuntuacion2 = new LabelPPT(300, 20, 200, 400, "0");
		add(labelPuntuacion2);
		labelPartidas = new LabelPPT(300, 20, 200, 480, "Partidas Jugadas");
		add(labelPartidas);
		labelNPartidas = new LabelPPT(300, 20, 200, 530, "0");
		add(labelNPartidas);
		label3 = new LabelPPT(140, 20, 200, 15, "PLAYER 1");
		add(label3);
		label4 = new LabelPPT(480, 20, 200, 15, "PLAYER 2");
		add(label4);

		button1 = new ButtonPPT(120, 40, 0);
		add(button1);
		ImageIcon punyo = new ImageIcon("/Users/Lupe/eclipse-workspace/punyo.png");
		button1.setIcon(new ImageIcon(
				punyo.getImage().getScaledInstance(button1.getWidth(), button1.getHeight(), Image.SCALE_SMOOTH)));

		button2 = new ButtonPPT(120, 172, 1);
		add(button2);
		ImageIcon mano = new ImageIcon("/Users/Lupe/eclipse-workspace/mano2.png");
		button2.setIcon(new ImageIcon(
				mano.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(), Image.SCALE_SMOOTH)));

		button3 = new ButtonPPT(120, 302, 2);
		add(button3);
		ImageIcon tijera = new ImageIcon("/Users/Lupe/eclipse-workspace/tijera.png");
		button3.setIcon(new ImageIcon(
				tijera.getImage().getScaledInstance(button3.getWidth(), button3.getHeight(), Image.SCALE_SMOOTH)));

		button4 = new ButtonPPT(460, 40, 3);
		add(button4);
		ImageIcon punyoJ2 = new ImageIcon("/Users/Lupe/eclipse-workspace/punyo.png");
		button4.setIcon(new ImageIcon(
				punyoJ2.getImage().getScaledInstance(button4.getWidth(), button4.getHeight(),
				Image.SCALE_SMOOTH)));

		button5 = new ButtonPPT(460, 172, 4);
		add(button5);
		ImageIcon manoJ2 = new ImageIcon("/Users/Lupe/eclipse-workspace/mano2.png");
		button5.setIcon(new ImageIcon(
				manoJ2.getImage().getScaledInstance(button5.getWidth(), button5.getHeight(),
				Image.SCALE_SMOOTH)));

		button6 = new ButtonPPT(460, 302, 5);
		add(button6);
	
		ImageIcon tijeraJ2= new ImageIcon("/Users/Lupe/eclipse-workspace/tijera.png");
		button6.setIcon(new ImageIcon(tijeraJ2.getImage().getScaledInstance(button6.getWidth(),
				button6.getHeight(), Image.SCALE_SMOOTH)));

		buttonPlay = new ButtonPPT("PLAY", 120, 20, 295, 350, 6);
		add(buttonPlay);

	}

}
