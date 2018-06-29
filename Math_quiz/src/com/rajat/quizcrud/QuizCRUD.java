package com.rajat.quizcrud;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import com.rajat.quetsions.Questions;
import com.rajat.result.Result;
import java.awt.Font;
import javax.swing.SwingConstants;

public class QuizCRUD extends JFrame {

	private JPanel contentPane;
	static QuizCRUD frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new QuizCRUD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	Questions q = new Questions();
	ButtonGroup group = new ButtonGroup();
	/**
	 * Create the frame.
	 */
	public QuizCRUD() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel question = new JLabel(q.getQuestion());
		question.setHorizontalAlignment(SwingConstants.CENTER);
		question.setFont(new Font("Tahoma", Font.ITALIC, 25));
		question.setBounds(28, 30, 396, 81);
		contentPane.add(question);
		
		JRadioButton A = new JRadioButton(Integer.toString(q.getopt()[0]));
		A.setBounds(28, 140, 109, 23);
		contentPane.add(A);
		A.setActionCommand(Integer.toString(q.getopt()[0]));
		
		JRadioButton D = new JRadioButton(Integer.toString(q.getopt()[1]));
		D.setBounds(28, 218, 109, 23);
		contentPane.add(D);
		D.setActionCommand(Integer.toString(q.getopt()[1]));
		
		JRadioButton B = new JRadioButton(Integer.toString(q.getopt()[2]));
		B.setBounds(28, 166, 109, 23);
		contentPane.add(B);
		B.setActionCommand(Integer.toString(q.getopt()[2]));
		
		JRadioButton C = new JRadioButton(Integer.toString(q.getopt()[3]));
		C.setBounds(28, 192, 109, 23);
		contentPane.add(C);
		C.setActionCommand(Integer.toString(q.getopt()[3]));
		
		group.add(A);
		group.add(B);
		group.add(C);
		group.add(D);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submit();
			}
		});
		Submit.setBounds(311, 192, 89, 23);
		contentPane.add(Submit);
		
		JButton end = new JButton("End Test");
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				endTest();
			}
		});
		end.setBounds(311, 150, 89, 23);
		contentPane.add(end);
		
	}
	
	public void endTest() {
		Result frame1 = new Result();
		frame1.setVisible(true);
		return;
	}
	
	public void submit() {
		frame.setVisible(false);
		q.checkResult(Integer.parseInt(group.getSelection().getActionCommand()));
		frame = new QuizCRUD();
		frame.setVisible(true);
	}
	
//	public String getopt() { 
//		int a = q.getopt()[1];
//		return Integer.toString(q.getResult());	
//	}
}
