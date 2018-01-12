package zombiePlay.interfaceWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import zombiePlay.model.TraitementAction;

public class NewWindowsBuilder {

	private JFrame frame;
	private JTextField textField;
	private JButton btnPompier;
	private JButton btnCaissier;
	private JButton btnFlic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWindowsBuilder window = new NewWindowsBuilder();
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
	public NewWindowsBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 602, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClodo = new JButton("Clodo");
		btnClodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TraitementAction traitement = TraitementAction.getInstance();
				traitement.userChoice(btnClodo.getText());
			}
		});
		btnClodo.setBounds(71, 72, 165, 94);
		frame.getContentPane().add(btnClodo);
		
		textField = new JTextField("Choississez une classe");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(10, 11, 566, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnPompier = new JButton("Pompier");
		btnPompier.setBounds(337, 72, 165, 94);
		frame.getContentPane().add(btnPompier);
		
		btnCaissier = new JButton("Caissier");
		btnCaissier.setBounds(71, 244, 165, 94);
		frame.getContentPane().add(btnCaissier);
		
		btnFlic = new JButton("Flic");
		btnFlic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFlic.setBounds(337, 244, 165, 94);
		frame.getContentPane().add(btnFlic);
	}
}
