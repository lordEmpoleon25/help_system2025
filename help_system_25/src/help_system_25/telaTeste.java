package help_system_25;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaTeste {

	private JFrame frame;
	private JTextField usuario;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaTeste window = new telaTeste();
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
	public telaTeste() {
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
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setBounds(60, 65, 60, 30);
		frame.getContentPane().add(lblNewLabel);
		
		usuario = new JTextField();
		usuario.setBounds(60, 97, 96, 19);
		frame.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(71, 190, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		password = new JPasswordField();
		password.setBounds(60, 141, 96, 19);
		frame.getContentPane().add(password);
	}
}
