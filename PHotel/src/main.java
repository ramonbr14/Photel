package PHotel.src;

import javax.swing.JFrame;

import view.TelaPrincipal;

public class main {

	public static void main(String[] args) {
		
		TelaPrincipal tela1 = new TelaPrincipal();
		tela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela1.setSize(400,400);
		tela1.setVisible(true);
	}

}
