import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String args[]) {
		Definidor definidor = new Definidor();
		
		JFrame frame = new JFrame();
		frame.setSize(1200, 675);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbl = new JLabel("Texto");
		JTextField txt = new JTextField("");
		lbl = definidor.definir(lbl, 20, 20, 100, 20);
		frame.add(lbl);
		txt = definidor.definir(txt, 20, 60, 100, 20);
		frame.add(txt);
	}
}