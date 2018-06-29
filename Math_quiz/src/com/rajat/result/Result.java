package com.rajat.result;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rajat.quetsions.Questions;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Result extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField TA;
	private JTextField TQ;
	private JTextField Percent;
	private JTextField TAI;
	private JTextField TCI;
	private JTextField PC;
	/**
	 * Create the frame.
	 */
	public Result() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon i = new ImageIcon("thanku.gif");
		
		JLabel lblNewLabel = new JLabel("Thank U",i,JLabel.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(87, 115, 278, 31);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(52, 182, 240, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				return;
			}
		});
		btnClose.setBounds(335, 227, 89, 23);
		contentPane.add(btnClose);
		
		JLabel lblForFeebback = new JLabel("for feebback");
		lblForFeebback.setBounds(64, 157, 83, 14);
		contentPane.add(lblForFeebback);
		
		TA = new JTextField(Questions.getRight());
		TA.setText("Correct Answer");
		TA.setBounds(39, 42, 169, 20);
		contentPane.add(TA);
		TA.setColumns(10);
		
		TQ = new JTextField(Questions.getNquestions());
		TQ.setText("Total Questions");
		TQ.setColumns(10);
		TQ.setBounds(39, 11, 169, 20);
		contentPane.add(TQ);
		
		Percent = new JTextField(Questions.getRight()*100/Questions.getNquestions());
		Percent.setText("Percentage");
		Percent.setColumns(10);
		Percent.setBounds(39, 73, 169, 20);
		contentPane.add(Percent);
		
		JLabel label = new JLabel();
		label.setBounds(310, 14, 46, 14);
		contentPane.add(label);
		
		TAI = new JTextField(Integer.toString(Questions.getNquestions()));
		TAI.setBounds(279, 11, 86, 20);
		contentPane.add(TAI);
		TAI.setColumns(10);
		
		TCI = new JTextField(Integer.toString(Questions.getRight()));
		TCI.setColumns(10);
		TCI.setBounds(279, 42, 86, 20);
		contentPane.add(TCI);
		
		PC = new JTextField(Integer.toString(Questions.getRight()*100/Questions.getNquestions()));
		PC.setColumns(10);
		PC.setBounds(279, 73, 86, 20);
		contentPane.add(PC);
	}

}
