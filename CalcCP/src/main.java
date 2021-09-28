
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class main {
	public JFrame window;
	
	public main() {
		window = new JFrame("Calculator");
		window.setVisible(true); //Vizibilitatea
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //inchide fereastra
		window.setSize(280,380);
		window.setResizable(false); // pentru nu a putea schimba dimentsiunea
		window.setLocationRelativeTo(null);//pozitionarea in centru
		window.add(new Panel());
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() { //Constructor
		@Override
		public void run() {
			new main();
		}
	});
	}
}
