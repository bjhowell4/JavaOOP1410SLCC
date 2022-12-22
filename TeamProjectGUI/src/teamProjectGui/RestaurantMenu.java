package teamProjectGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JButton;

public class RestaurantMenu extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantMenu frame = new RestaurantMenu();
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
	public RestaurantMenu() {
		
		firstPage();
		
	}

	/**
	 * All the fields for the key labels and buttons
	 */
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_8;
	
	//initial values for price and tax percentage
	public double priceTotal;
	public double plusTax;
	public double tax = 0.0725;
	public double totalWithTax;
	String[] menuItems = new String[4];
	
	/**
	 * Extracted method which is called above
	 */
	private void firstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("THEE Italian Restaurant");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(60, 179, 113));
		lblNewLabel.setFont(new Font("Vladimir Script", Font.BOLD, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Today's menu");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Buffered reader and writer
		 */
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("menu.txt"));
			writer.write("Brick Oven Pizza (Pepperoni, Sausage, Combo).........$11.49");
			writer.write("\n" + "Zupa Toscana & Garclic Bread...............................$10.49");
			writer.write("\n" + "Perfect Pasta (Meaty Spaghetti, Chicken Alfredo)...$12.29");
			writer.write("\n" + "Chicken Marsala & Italian Salad............................$12.29");
			writer.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("menu.txt"));
			String line = "0";
			
			for (int i = 0; i < menuItems.length && line != null; i++) {
				line = reader.readLine();
				System.out.println(line);
				menuItems[i]=line;
			}
			
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
		btnNewButton = new JButton(menuItems[0]);
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
		panel_2.add(btnNewButton, BorderLayout.NORTH);
		btnNewButton.addActionListener(pizzaButton);
		
		btnNewButton_1 = new JButton(menuItems[1]);
		btnNewButton_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
		panel_2.add(btnNewButton_1, BorderLayout.SOUTH);
		btnNewButton_1.addActionListener(soupButton);
		
		btnNewButton_4 = new JButton(menuItems[2]);
		btnNewButton_4.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
		panel_2.add(btnNewButton_4, BorderLayout.CENTER);
		btnNewButton_4.addActionListener(pastaButton);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		btnNewButton_5 = new JButton(menuItems[3]);
		btnNewButton_5.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
		panel_3.add(btnNewButton_5, BorderLayout.NORTH);
		btnNewButton_5.addActionListener(marsalaButton);
		
		btnNewButton_8 = new JButton("Confirm");
		btnNewButton_8.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		panel_3.add(btnNewButton_8, BorderLayout.EAST);
		btnNewButton_8.addActionListener(confirmButton);
		
		lblNewLabel_2 = new JLabel("Estimated total: $0.00");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(135, 206, 250));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_2, BorderLayout.CENTER);
		
		btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		panel_3.add(btnNewButton_2, BorderLayout.WEST);
		btnNewButton_2.addActionListener(undoButton);
	}

	/**
	 * Code for each of the ActionListeners
	 */
	ActionListener pizzaButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			lblNewLabel_2.setText("Estimated total: $" + String.format("%,.2f", CalculateTotal.calculate(11.49)));
		
		}
	};
	
	ActionListener pastaButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			lblNewLabel_2.setText("Estimated total: $" + String.format("%,.2f", CalculateTotal.calculate(12.29)));
		
		}
	};
	
	ActionListener soupButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			lblNewLabel_2.setText("Estimated total: $" + String.format("%,.2f", CalculateTotal.calculate(10.49)));
		
		}
	};
	
	ActionListener marsalaButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			lblNewLabel_2.setText("Estimated total: $" + String.format("%,.2f", CalculateTotal.calculate(12.29)));
		
		}
	};
	
	ActionListener undoButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			CalculateTotal.calculate(0 - CalculateTotal.totalWithTax);
			lblNewLabel_2.setText("Estimated total: $0.00");
		
		}
	};
	
	ActionListener confirmButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Page2 frame = new Page2();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
