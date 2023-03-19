package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.JSlider;

public class ProfileGUI {

	public static final String[] INTERESTS = {"Business", "Coding", "Design", "Earth Science", "Engineering", "Health & Physical Education", "Law", "Linguistics", "Mathematics", "Medical Science", "Public Service", "Space Science", "Research-Based Science", "Social Sciences", "Technology", "Teaching", "The Arts", "World Studies"};
	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileGUI window = new ProfileGUI();
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
	public ProfileGUI() {
		Initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void Initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1920, 74);
		frame.getContentPane().add(panel);
		
		JLabel lblFirstName = new JLabel("What is your First Name?");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFirstName.setBounds(10, 85, 305, 28);
		frame.getContentPane().add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(10, 123, 305, 40);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("What is your Last Name?");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLastName.setBounds(10, 207, 305, 28);
		frame.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(10, 246, 305, 40);
		frame.getContentPane().add(txtLastName);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(86, 234, 1, 1);
		frame.getContentPane().add(layeredPane);
		
		JLabel lblInterests = new JLabel("What are your 3 areas of interest?");
		lblInterests.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblInterests.setBounds(10, 335, 420, 28);
		frame.getContentPane().add(lblInterests);
		
		JComboBox Interests1 = new JComboBox(INTERESTS);
		Interests1.setSelectedIndex(-1);
		Interests1.setMaximumRowCount(18);
		Interests1.setBounds(10, 429, 305, 34);
		frame.getContentPane().add(Interests1);
		
		JComboBox Interests2 = new JComboBox(INTERESTS);
		Interests2.setSelectedIndex(-1);
		Interests2.setMaximumRowCount(18);
		Interests2.setBounds(10, 384, 305, 34);
		frame.getContentPane().add(Interests2);
		
		JComboBox Interests3 = new JComboBox(INTERESTS);
		Interests3.setSelectedIndex(-1);
		Interests3.setMaximumRowCount(18);
		Interests3.setBounds(10, 474, 305, 34);
		frame.getContentPane().add(Interests3);
		
		JLabel lblBudgetMin = new JLabel("What is your minimum budget?");
		lblBudgetMin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBudgetMin.setBounds(10, 601, 420, 40);
		frame.getContentPane().add(lblBudgetMin);
		
		JSlider sliderBMin = new JSlider(5000, 25000);
		sliderBMin.setBounds(50, 670, 305, 26);
		frame.getContentPane().add(sliderBMin);
		
		JLabel lblBudgetMax = new JLabel("What is your maximum budget?");
		lblBudgetMax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBudgetMax.setBounds(10, 721, 420, 40);
		frame.getContentPane().add(lblBudgetMax);
		
		JSlider sliderBMax = new JSlider(5000, 25000);
		sliderBMax.setBounds(50, 790, 305, 26);
		frame.getContentPane().add(sliderBMax);
	}
}