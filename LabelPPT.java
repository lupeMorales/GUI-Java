package PiedraPapelTijera2;


import java.awt.Font;
import javax.swing.JLabel;

public class LabelPPT extends JLabel {

	public LabelPPT(int x, int y, int w, int h, String texto) {
		setBounds(x, y, w, h);
		setText(texto);
		Font fuente2 = new Font("arial", Font.BOLD, 15);
		setFont(fuente2);
	}

}
