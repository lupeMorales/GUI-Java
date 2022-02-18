package PiedraPapelTijera2;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FramePPT extends JFrame {

	public FramePPT(PanelPPT p) {

		setTitle("PIEDRA PAPEL TIJERA");
		setSize(720, 500);
		setLocation(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.pink);
		setResizable(false);
		add(p);

		Image miIcono = Toolkit.getDefaultToolkit().getImage("/Users/Lupe/eclipse-workspace/piedrapapeltijera.png");
		setIconImage(miIcono); // cambia el icono del frame que aparece por defecto arriba a la izq.

	}
}


