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
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

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
	private boolean addTips(Course c, String s) {
		boolean added = c.addTips(s);
		return added;
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
		layeredPane.setBounds(533, 164, 390, 254);
		panel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		layeredPane.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_29355439673600");
		panel_1.setBackground(Color.PINK);
		panel_1.setLayout(null);
		
		JButton btnCs = new JButton("CS250");
		btnCs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String review = (String)JOptionPane.showInputDialog(frame,"Add your tip");
				if (addTips(CS250,review)==true) {
					JOptionPane.showMessageDialog(null, "tip added");
				}
				else {
					JOptionPane.showMessageDialog(null, "tip already exists");
				}
			}
		});
		btnCs.setBounds(66, 71, 197, 47);
		panel_1.add(btnCs);
		panel_1.setVisible(false);
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_29131305335800");
		panel_2.setBackground(Color.ORANGE);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(20);
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(11, 0, 505, 587);
		panel.add(textArea);
		panel_2.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton View_CS150 = new JButton("CS150");
		panel_2.add(View_CS150);
		
		JButton View_CS250 = new JButton("CS250");
		View_CS250.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = displayTips(CS250);
				textArea.setText(s);
			}
		});
		panel_2.add(View_CS250);
		
		JButton View_CS251 = new JButton("CS251");
		panel_2.add(View_CS251);
		
		JButton View_CS315 = new JButton("CS315");
		panel_2.add(View_CS315);
		
		JButton View_CS317 = new JButton("CS317");
		panel_2.add(View_CS317);
		
		JButton View_CS337 = new JButton("CS337");
		panel_2.add(View_CS337);
		
		JButton View_CS351 = new JButton("CS351");
		panel_2.add(View_CS351);
		
		JButton View_CS361 = new JButton("CS361");
		panel_2.add(View_CS361);
		
		JButton View_CS395 = new JButton("CS395");
		panel_2.add(View_CS395);
		
		JButton View_CS417 = new JButton("CS417");
		panel_2.add(View_CS417);
		
		JButton View_CS431 = new JButton("CS431");
		panel_2.add(View_CS431);
		
		JButton View_CS458 = new JButton("CS458");
		panel_2.add(View_CS458);
		
		JButton View_CS520 = new JButton("CS520");
		panel_2.add(View_CS520);
		
		JButton View_CS535 = new JButton("CS535");
		panel_2.add(View_CS535);
		
		JButton View_CS537 = new JButton("CS537");
		panel_2.add(View_CS537);
		
		JButton View_CS595 = new JButton("CS595");
		panel_2.add(View_CS595);
		panel_2.setVisible(false);
		
		JButton btnButton = new JButton("Add Tips");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.setVisible(true);
				panel_1.setVisible(true);
				panel_2.setVisible(false);
			}
		});
		btnButton.setBounds(635, 16, 197, 47);
		panel.add(btnButton);
		
		JButton btnButton_1 = new JButton("View Tips");
		btnButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnButton_1.setBounds(635, 84, 197, 47);
		panel.add(btnButton_1);
		
	
		
		
		
		
		
		
		

		
	
		
		
	}
}
