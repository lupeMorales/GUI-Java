package PiedraPapelTijera2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ButtonPPT extends JButton implements ActionListener {

	public int buttonId;

	public ButtonPPT(int x, int y, int id) {

		buttonId = id;

		setSize(120, 120);
		setLocation(x, y);
		setOpaque(true);
		addActionListener(this);
		setSelected(false);

	}

	public ButtonPPT(String txt, int z, int h, int x, int y, int id) {

		buttonId = id;
		setText(txt);
		setSize(z, h);
		setLocation(x, y);
		setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));
		setSelected(false);
		setOpaque(true);
		addActionListener(this);

	}

	public int getButtonId() {
		return buttonId;
	}

	public void setButtonId(int buttonId) {
		this.buttonId = buttonId;
	}

	public void actionPerformed(ActionEvent e) {

		if (buttonId == 0 || buttonId == 1 || buttonId == 2) {
			setSelected(true);
			setBorder(BorderFactory.createLineBorder(Color.green, 4, false));// boton a verde al seleccionar
			PPT.pPTImplements.randomOption(); // al elegir player1 una opcion, player2 elige la suya automaticamente
		}

		if (buttonId == 6)
			PPT.pPTImplements.checkGame();
			PPT.pPTImplements.finPartida();

	}
}
