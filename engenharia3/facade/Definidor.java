import javax.swing.*;
import java.awt.*;

public class Definidor {
	public JLabel definir(JLabel obj, int x, int y, int w, int h) {
		obj.setBounds(x, y, w, h);
		return obj;
	}
	public JTextField definir(JTextField obj, int x, int y, int w, int h) {
		obj.setBounds(x, y, w, h);
		return obj;
	}
}