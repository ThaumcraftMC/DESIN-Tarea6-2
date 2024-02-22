import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lbPrueba = new JLabel("");
		lbPrueba.setHorizontalAlignment(SwingConstants.CENTER);
		lbPrueba.setBounds(160, 104, 122, 13);
		frame.getContentPane().add(lbPrueba);
		
		JButton btBotonPrueba = new JButton("Test");
		btBotonPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbPrueba.setText("El boton funciona");
			}
		});
		btBotonPrueba.setBounds(177, 178, 85, 21);
		frame.getContentPane().add(btBotonPrueba);
	}
}
