/**
 * Simple GUI that listens for button clicks and will change color each click.
 * Each time the color red appears, the counter will count up.
 * 
 * @author Brady H.
 */

package counter;

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
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import java.awt.Color;

public class Counter extends JFrame implements ActionListener {
	
	private int count = 0;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private int colorChoice = 0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter();
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
	public Counter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		createLeftSideLabel();
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		createClickMeButton();
		contentPane.add(btnNewButton, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = createBottomLabel();
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
	}

	/**
	 * extracted method to create button
	 */
	private void createClickMeButton() {
		btnNewButton = new JButton("Click me");
		btnNewButton.setForeground(new Color(255, 250, 205));
		btnNewButton.setBackground(new Color(30, 144, 255)); //blue
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 77));
		btnNewButton.addActionListener(this);
	}

	/**
	 * extracted method to create left side label
	 */
	private void createLeftSideLabel() {
		lblNewLabel = new JLabel("Red Counter:" + count + " ");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(119, 136, 153));
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 41));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}

	/**
	 * extracted method to create bottom label
	 * @return new label
	 */
	private JLabel createBottomLabel() {
		JLabel lblNewLabel_1 = new JLabel("Brady's Red Counter GUI");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(211, 211, 211));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		return lblNewLabel_1;
	}

	/**
	 * Event Listener that listens to each click and will generate
	 * a random number and change colors each time the button is clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//create new Random object
		Random rand = new Random();
		
		//generate random number, print to console, and assign to colorChoice 
		int randomNum = Math.abs(rand.nextInt() % 10);
		//System.out.println(randomNum); //print to console is optional
		colorChoice = randomNum;
		
		Color red = new Color(255, 0, 0);
		Color blue = new Color(30, 144, 255);
		Color green = new Color(50, 205, 50);
		Color orange = new Color(255, 215, 0);
		Color magenta = new Color(255, 0, 255);
		
		switch (colorChoice) {
		
		case 1: btnNewButton.setBackground(green);
			break;
		case 2: count++; btnNewButton.setBackground(red); lblNewLabel.setText("Red Counter:" + count + " ");
			break;
		case 3: btnNewButton.setBackground(orange);
			break;
		case 4: btnNewButton.setBackground(magenta);
			break;
		case 5: btnNewButton.setBackground(blue);
			break;
		case 6: count++; btnNewButton.setBackground(red); lblNewLabel.setText("Red Counter:" + count + " ");
			break;
		case 7: btnNewButton.setBackground(magenta);
			break;
		case 8: btnNewButton.setBackground(orange);
			break;
		case 9: btnNewButton.setBackground(green);
			break;
		default: btnNewButton.setBackground(blue);
		
		}
		
	}

}
