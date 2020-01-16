import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class FeedbackApp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedbackApp window = new FeedbackApp();
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
	public FeedbackApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1022, 874);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(17, 14, 954, 724);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(566, 320, 357, 371);
		panel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		layeredPane.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_29355439673600");
		panel_1.setBackground(Color.PINK);
		panel_1.setLayout(null);
		
		JButton btnCs = new JButton("CS250");
		btnCs.setBounds(66, 71, 197, 47);
		panel_1.add(btnCs);
		panel_1.setVisible(false);
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_29131305335800");
		panel_2.setBackground(Color.ORANGE);
		panel_2.setLayout(null);
		
		JButton btnCs_1 = new JButton("CS250");
		btnCs_1.setBounds(76, 85, 197, 47);
		panel_2.add(btnCs_1);
		panel_2.setVisible(false);
		
		JButton btnButton = new JButton("Add Tips");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.setVisible(true);
				panel_1.setVisible(true);
				panel_2.setVisible(false);
			}
		});
		btnButton.setBounds(635, 190, 197, 47);
		panel.add(btnButton);
		
		JButton btnButton_1 = new JButton("View Tips");
		btnButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnButton_1.setBounds(635, 260, 197, 47);
		panel.add(btnButton_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(31, 135, 479, 589);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		
		
		
		

		
	
		
		
	}
}
