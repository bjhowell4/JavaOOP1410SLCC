package m03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Rectangle;



public class Module03Gui extends JFrame implements ActionListener {

	/**
	 * Initialize the content pane and the buttons
	 */
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	
	/**
	 * Initialize the labels
	 */
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	
	/**
	 * Add the colors
	 */
	Color black = new Color(0, 0, 0);
	Color blue = new Color(30, 144, 255);
	Color red = new Color(255, 0, 0);
	
	/**
	 * Create top title label
	 */
	private final JLabel lblNewLabel_4 = new JLabel("Utah Elections - Who is Who");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module03Gui frame = new Module03Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Module03Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		/**
		 * Functionality of first JButton
		 */
		ActionListener buttonListener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel.setForeground(red);
				lblNewLabel_1.setForeground(black);
				lblNewLabel_2.setForeground(black);
				lblNewLabel_3.setForeground(black);
				
			}
			
		};
		
		/**
		 * Create first button
		 */
		btnNewButton = new JButton("");
		btnNewButton.setBounds(new Rectangle(0, 5, 0, 0));
		btnNewButton.setIcon(new ImageIcon(Module03Gui.class.getResource("/images/spencerCoxImg.png")));;
		btnNewButton.addActionListener(buttonListener1);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		/**
		 * Functionality of second JButton
		 */
		ActionListener buttonListener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel_1.setForeground(red);
				lblNewLabel.setForeground(black);
				lblNewLabel_2.setForeground(black);
				lblNewLabel_3.setForeground(black);
				
			}
			
		};
		
		/**
		 * Create second button
		 */
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(new Rectangle(0, 5, 0, 0));
		btnNewButton_1.setIcon(new ImageIcon(Module03Gui.class.getResource("/images/deidreHendersonImg.png")));;
		btnNewButton_1.addActionListener(buttonListener2);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		/**
		 * Functionality of third JButton
		 */
		ActionListener buttonListener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel_3.setForeground(blue);
				lblNewLabel_1.setForeground(black);
				lblNewLabel.setForeground(black);
				lblNewLabel_2.setForeground(black);
				
			}
			
		};
		
		/**
		 * Create third button
		 */
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(new Rectangle(0, 5, 0, 0));
		btnNewButton_3.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton_3.setIcon(new ImageIcon(Module03Gui.class.getResource("/images/chrisPetersonImg.png")));;
		btnNewButton_3.addActionListener(buttonListener3);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		/**
		 * Functionality of fourth JButton
		 */
		ActionListener buttonListener4 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel_2.setForeground(blue);
				lblNewLabel_1.setForeground(black);
				lblNewLabel_3.setForeground(black);
				lblNewLabel.setForeground(black);
				
			}
			
		};
		
		/**
		 * Create fourth button
		 */
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(new Rectangle(0, 5, 0, 0));
		btnNewButton_2.setIcon(new ImageIcon(Module03Gui.class.getResource("/images/karinaBrownImg.png")));;
		btnNewButton_2.addActionListener(buttonListener4);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		/**
		 * Set layout and add buttons to left side
		 */
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(btnNewButton_3);
		panel.add(btnNewButton);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		
		/**
		 * Set a new JPanel in the center
		 */
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		/**
		 * Create first label
		 */
		lblNewLabel = new JLabel("Spencer Cox Gov. (R)");
		lblNewLabel.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		/**
		 * Create second label
		 */
		lblNewLabel_2 = new JLabel("Karina Brown Lt. Gov. (D)");
		lblNewLabel_2.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		/**
		 * Create third label
		 */
		lblNewLabel_3 = new JLabel("Chris Peterson Gov. (D)");
		lblNewLabel_3.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		/**
		 * Create fourth label
		 */
		lblNewLabel_1 = new JLabel("Deidre Henderson Lt. Gov. (R)");
		lblNewLabel_1.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		/**
		 * Add each label to the center panel
		 */
		panel_1.add(lblNewLabel);
		panel_1.add(lblNewLabel_2);
		panel_1.add(lblNewLabel_3);
		panel_1.add(lblNewLabel_1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
