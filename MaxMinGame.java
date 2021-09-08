/**
 * A high risk, high reward number range guessing game.
 * 
 * modified     20210819
 * date         20210819
 * @filename    MaxMinGame.java
 * @author      Raghav Vasudeva
 * @version     1.0
 * @see         unit 2.6 content
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class MaxMinGame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblNewLabel_4;
	private JTextField textField_12;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_5;
	private JTextField textField_13;
	private JTextField textField_14;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaxMinGame window = new MaxMinGame();
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
	public MaxMinGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Max Min Number Guessing Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(112, 10, 298, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(34, 165, 31, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(132, 165, 31, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(229, 165, 31, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(327, 165, 31, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(427, 165, 31, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(34, 218, 31, 19);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(132, 218, 31, 19);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(229, 218, 31, 19);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(327, 218, 31, 19);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(427, 218, 31, 19);
		frame.getContentPane().add(textField_9);
		
		JLabel lblNewLabel_2 = new JLabel("Max Range Guess:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(277, 100, 208, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setBounds(389, 98, 96, 19);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Score: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(356, 52, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setBounds(411, 50, 74, 19);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		textField_11.setEditable(false);
		
		lblNewLabel_4 = new JLabel("Min Range Guess:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(20, 100, 208, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setBounds(132, 98, 96, 19);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Max  Value:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(302, 274, 74, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_5 = new JLabel("Min Value:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(34, 274, 74, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(375, 272, 51, 19);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(112, 272, 51, 19);
		frame.getContentPane().add(textField_14);
		
		lblNewLabel_6 = new JLabel("Enter your guesses for the minimum and maximum range of the random generated numbers between 1 and 100.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_6.setBounds(10, 353, 496, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("You risk losing more while having a chance to gain  more points with a smaller estimated range.");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_7.setBounds(10, 380, 496, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("You have 5 attempts in total to get your best score. Good Luck!");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_8.setBounds(10, 403, 496, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(203, 301, 185, 13);
		frame.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Attempts Left:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(10, 53, 98, 13);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_15 = new JTextField();
		textField_15.setText("5");
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(103, 50, 74, 19);
		frame.getContentPane().add(textField_15);
		
		
		JButton btnNewButton = new JButton("Generate 10 Random Numbers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Integer.parseInt(textField_15.getText()) != 0) {
					lblNewLabel_11.setText("Continue Playing.");
					
					Random numGenerator = new Random();
					
					int[] numArr = new int[10];
					
					for(int i = 0; i<10; i++) {
						numArr[i] = numGenerator.nextInt(100);
					}
					
					textField.setText(String.valueOf(numArr[0]));
					textField_1.setText(String.valueOf(numArr[1]));
					textField_2.setText(String.valueOf(numArr[2]));
					textField_3.setText(String.valueOf(numArr[3]));
					textField_4.setText(String.valueOf(numArr[4]));
					textField_5.setText(String.valueOf(numArr[5]));
					textField_6.setText(String.valueOf(numArr[6]));
					textField_7.setText(String.valueOf(numArr[7]));
					textField_8.setText(String.valueOf(numArr[8]));
					textField_9.setText(String.valueOf(numArr[9]));
					
					int max = numArr[0];
					for(int i=0; i<numArr.length; i++) {
						if(numArr[i] > max) {
							max = numArr[i];
						}
					}
					textField_13.setText(String.valueOf(max));
					
					int min = numArr[0];
					for(int i=0; i<numArr.length; i++) {
						if(numArr[i] < min) {
							min = numArr[i];
						}
					}
					textField_14.setText(String.valueOf(min));
					
					int maxGuess = Integer.parseInt(textField_10.getText());
					int minGuess = Integer.parseInt(textField_12.getText());
					
					int score = Integer.parseInt(textField_11.getText());
					
					
					// score calculating code
					if(maxGuess >= max) {
						score += (100 - maxGuess);
					}
					else {
						score -= (100 - maxGuess);
					}
					
					if(minGuess <= min) {
						score += minGuess;
					}
					else {
						score -= minGuess;
					}
					
					textField_11.setText(String.valueOf(score));
					
					int attempts = Integer.parseInt(textField_15.getText());
					textField_15.setText(String.valueOf(attempts - 1));
					
				}
				else {
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					
					textField_10.setText("0");
					textField_10.setEditable(true);
					
					textField_11.setText("0");
					
					textField_12.setText("0");
					textField_12.setEditable(true);
					
					textField_13.setText("");
					textField_14.setText("");
					textField_15.setText("5");
					
					lblNewLabel_11.setText("");
				}
 			}
		});
		btnNewButton.setBounds(132, 134, 256, 21);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Restart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				
				textField_10.setText("0");
				textField_10.setEditable(true);
				
				textField_11.setText("0");
				
				textField_12.setText("0");
				textField_12.setEditable(true);
				
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("5");
				
				lblNewLabel_11.setText("");
				
			}
		});
		btnNewButton_1.setBounds(189, 322, 133, 21);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}
