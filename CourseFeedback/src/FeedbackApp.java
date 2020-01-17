import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextArea;

public class FeedbackApp {

	private JFrame frame;
	Course CS250=new Course("CS250");
	
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
	private void addTips(Course c, String s) {
		c.addTips(s);
	}
	
	private String displayTips(Course c) {
		ArrayList<String> tips = c.getTips();
	
		String s = "";
		for (String t: tips) {
			s+=(t+"\n");
		}
		return s;
	}
	/**
	 * Create the application.
	 */
	public FeedbackApp() {
		initialize();
		addTips(CS250,"hi");
		addTips(CS250,"jk");
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
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(20);
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(18, 330, 505, 343);
		panel.add(textArea);
		
		JButton btnCs_1 = new JButton("CS250");
		btnCs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = displayTips(CS250);
				textArea.setText(s);
			}
		});
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
		
	
		
		
		
		
		
		
		

		
	
		
		
	}
}
