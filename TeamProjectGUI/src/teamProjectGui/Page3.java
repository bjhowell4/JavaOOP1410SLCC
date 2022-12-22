package teamProjectGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Page3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3 frame = new Page3();
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
	public Page3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 300);
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
		
		//this updates the label and should show the total with tax
		JLabel lblNewLabel_1 = new JLabel("Subtotal: $" + String.format("%,.2f", CalculateTotal.totalWithTax) +
				" + $" + String.format("%,.2f", CalculateTotal.totalWithTax * 0.072) + " = $" +
				String.format("%,.2f", CalculateTotal.calculate(CalculateTotal.totalWithTax * 0.072)));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.PLAIN, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Add 15% tip " + " " + "($" + String.format("%,.2f", CalculateTotal.totalWithTax * 0.15) + ")");
		btnNewButton.setFont(new Font("Rockwell", Font.PLAIN, 18));
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(tipButton15);
		
		JButton btnNewButton_1 = new JButton("Add 20% tip " + " " + "($" + String.format("%,.2f", CalculateTotal.totalWithTax * 0.2) + ")");
		btnNewButton_1.setFont(new Font("Rockwell", Font.PLAIN, 18));
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(tipButton20);
		
		JButton btnNewButton_2 = new JButton("Add 25% tip " + " " + "($" + String.format("%,.2f", CalculateTotal.totalWithTax * 0.25) + ")");
		btnNewButton_2.setFont(new Font("Rockwell", Font.PLAIN, 18));
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(tipButton25);
		
		JButton btnNewButton_4 = new JButton("Clear Tip");
		btnNewButton_4.setBackground(Color.PINK);
		btnNewButton_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		panel_1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(clearTipButton);
		
		lblNewLabel_2 = new JLabel("Grand Total: $" + String.format("%,.2f", CalculateTotal.totalWithTax));
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("Confirm & Pay");
		btnNewButton_3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 26));
		panel_1.add(btnNewButton_3);
		btnNewButton_3.addActionListener(confirmPayButton);
		
		JLabel lblNewLabel_3 = new JLabel("We hope you enjoyed your food!");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(144, 238, 144));
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, BorderLayout.SOUTH);
		
	}
	
	ActionListener confirmPayButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Page4 frame = new Page4();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
		}
	};
	
	ActionListener tipButton15 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			lblNewLabel_2.setText("Grand Total: $" + String.format("%,.2f", (CalculateTotal.totalWithTax + CalculateTotal.totalWithTax * 0.15)));
			//System.out.println(CalculateTotal.totalWithTax + CalculateTotal.totalWithTax * 0.15);
		
		}
	};
	
	ActionListener tipButton20 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			lblNewLabel_2.setText("Grand Total: $" + String.format("%,.2f",(CalculateTotal.totalWithTax + CalculateTotal.totalWithTax * 0.2)));
			//System.out.println(CalculateTotal.totalWithTax + CalculateTotal.totalWithTax * 0.2);
		
		}
	};
	
	ActionListener tipButton25 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			lblNewLabel_2.setText("Grand Total: $" + String.format("%,.2f",(CalculateTotal.totalWithTax + CalculateTotal.totalWithTax * 0.25)));
			//System.out.println(CalculateTotal.totalWithTax + CalculateTotal.totalWithTax * 0.25);
		
		}
	};
	
	ActionListener clearTipButton = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			lblNewLabel_2.setText("Grand Total: $" + String.format("%,.2f", CalculateTotal.totalWithTax));
			//System.out.println(CalculateTotal.totalWithTax + CalculateTotal.totalWithTax * 0.15);
		
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
