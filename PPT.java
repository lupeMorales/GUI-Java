package PiedraPapelTijera2;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class PPT {

	public static PPT pPTImplements;
	public int partidasGanadas, partidasPerdidas, partidasJugadas;

	public PPT() {

		pPTImplements = this;

	}

	public static int randomOption() {
		// metodo que hace que el progrma me puestre su opcion de forma
		// aleatoria(PIEDRS, PAPEL o TIJEREA)

		int random = 0;

		random = (int) (Math.random() * 3);// (int) para que el método math me de un número entero, en vez de double,
											// comprendido entre 0 y 2, cada número se corresponderá a un elemento del
											// juego
		if (random == 0) {
			PanelPPT.panePPTImplement.button4.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));
			PanelPPT.panePPTImplement.button4.setSelected(true);

		}
		if (random == 1) {
			PanelPPT.panePPTImplement.button5.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));
			PanelPPT.panePPTImplement.button5.setSelected(true);

		}
		if (random == 2) {
			PanelPPT.panePPTImplement.button6.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));
			PanelPPT.panePPTImplement.button6.setSelected(true);

		}
		return random;
	}

	void youWin() {

		partidasGanadas++;

		PanelPPT.panePPTImplement.labelPuntuacion1.setText(partidasGanadas + "");

	}

	void youLose() {

		partidasPerdidas++;

		PanelPPT.panePPTImplement.labelPuntuacion2.setText(partidasPerdidas + "");

	}

	void gamesPlayed() {
		partidasJugadas++;
		PanelPPT.panePPTImplement.labelNPartidas.setText(partidasJugadas + "");
	}

	public static void newGame() {

		PanelPPT.panePPTImplement.button1.setSelected(false);
		PanelPPT.panePPTImplement.button2.setSelected(false);
		PanelPPT.panePPTImplement.button3.setSelected(false);
		PanelPPT.panePPTImplement.button4.setSelected(false);
		PanelPPT.panePPTImplement.button5.setSelected(false);
		PanelPPT.panePPTImplement.button6.setSelected(false);
		PanelPPT.panePPTImplement.button1.setBorder(null);
		PanelPPT.panePPTImplement.button2.setBorder(null);
		PanelPPT.panePPTImplement.button3.setBorder(null);
		PanelPPT.panePPTImplement.button4.setBorder(null);
		PanelPPT.panePPTImplement.button5.setBorder(null);
		PanelPPT.panePPTImplement.button6.setBorder(null);
	}

	public void checkGame() {

		if (PanelPPT.panePPTImplement.button1.isSelected() && PanelPPT.panePPTImplement.button4.isSelected()) {
			newGame();
			gamesPlayed();

		}

		if (PanelPPT.panePPTImplement.button1.isSelected() && PanelPPT.panePPTImplement.button5.isSelected()) {
			newGame();
			youLose();
			gamesPlayed();

		}
		if (PanelPPT.panePPTImplement.button1.isSelected() && PanelPPT.panePPTImplement.button6.isSelected()) {

			newGame();
			youWin();
			gamesPlayed();
		}

		if (PanelPPT.panePPTImplement.button2.isSelected() && PanelPPT.panePPTImplement.button4.isSelected()) {

			// JOptionPane.showInternalMessageDialog(null, "GANA PLAYER 1"); ya se sabe con
			// la puntuacion
			newGame();
			youWin();
			gamesPlayed();
		}

		if (PanelPPT.panePPTImplement.button2.isSelected() && PanelPPT.panePPTImplement.button5.isSelected()) {
			newGame();
			gamesPlayed();
		}

		if (PanelPPT.panePPTImplement.button2.isSelected() && PanelPPT.panePPTImplement.button6.isSelected()) {
			newGame();
			youLose();
			gamesPlayed();

		}
		if (PanelPPT.panePPTImplement.button3.isSelected() && PanelPPT.panePPTImplement.button4.isSelected()) {
			newGame();
			youLose();
			gamesPlayed();
		}

		if (PanelPPT.panePPTImplement.button3.isSelected() && PanelPPT.panePPTImplement.button5.isSelected()) {
			newGame();
			youWin();
			gamesPlayed();
		}
		if (PanelPPT.panePPTImplement.button3.isSelected() && PanelPPT.panePPTImplement.button6.isSelected()) {
			newGame();
			gamesPlayed();

		}

	}

	void finPartida() {//gana mejor de 3

		if (partidasJugadas == 3) {
			if (partidasGanadas > partidasPerdidas) {
				JOptionPane.showInternalMessageDialog(null, "ENHORABUENA, HAS GANADO");
			} else {
				JOptionPane.showInternalMessageDialog(null, "HAS PERDIDO");

			}
			reset();
		}

	}

	public void resetScore() {
		partidasGanadas = 0;
		partidasPerdidas = 0;
		partidasJugadas = 0;
		PanelPPT.panePPTImplement.labelPuntuacion1.setText(partidasGanadas + "");

		PanelPPT.panePPTImplement.labelPuntuacion2.setText(partidasPerdidas + "");
		PanelPPT.panePPTImplement.labelNPartidas.setText(partidasJugadas + "");

	}

	public void reset() {
		newGame();
		resetScore();

	}

}
