import java.awt.Button;

import javax.swing.JPanel;

public class Panel extends JPanel {
	public Panel() {
		setLayout(null); //Permite deplasarea elemetelor
		Button b0 = new Button("0");
		b0.setBounds(50, 230 , 50, 50);
		add(b0);
		Button b1 = new Button("1");
		b1.setBounds(0, 180, 50, 50);
		add(b1);
		Button b2 = new Button("2");
		b2.setBounds(50, 180, 50, 50);
		add(b2);
		Button b3 = new Button("3");
		b3.setBounds(100, 180, 50, 50);
		add(b3);
		Button b4 = new Button("4");
		b4.setBounds(0, 130, 50, 50);
		add(b4);
		Button b5 = new Button("5");
		b5.setBounds(50, 130, 50, 50);
		add(b5);
		Button b6 = new Button("6");
		b6.setBounds(100, 130, 50, 50);
		add(b6);
		Button b7 = new Button("7");
		b7.setBounds(0, 80, 50, 50);
		add(b7);
		Button b8 = new Button("8");
		b8.setBounds(50, 80, 50, 50);
		add(b8);
		Button b9 = new Button("9");
		b9.setBounds(100, 80, 50, 50);
		add(b9);
		Button x = new Button(".");
		x.setBounds(100, 230, 50, 50);
		add(x);
		
		/*---Operatori----*/
		Button z = new Button("+/-");
		z.setBounds(0, 230, 50, 50);
		add(z);
		Button a = new Button("+");
		a.setBounds(150, 180, 50, 50);
		add(a);
		Button s = new Button("-");
		s.setBounds(150, 130, 50, 50);
		add(s);
		Button i = new Button("*");
		i.setBounds(150, 80, 50, 50);
		add(i);
		Button o = new Button("*");
		o.setBounds(150, 80, 50, 50);
		add(o);
	}
}
