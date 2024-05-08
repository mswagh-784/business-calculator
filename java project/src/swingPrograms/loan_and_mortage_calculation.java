package swingPrograms;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class loan_and_mortage_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loan_and_mortage_calculation_main_frame lmc = new loan_and_mortage_calculation_main_frame();
	}
}


class loan_and_mortage_calculation_main_frame extends JFrame implements ActionListener{
	JFrame main_frame = new JFrame();
	JButton loan_payment_calculation = new JButton("Loan Payment Calculation");
	JButton loan_balance_calculation = new JButton("Loan Balance Calculation");
	JButton intrest_calculation = new JButton("Intrest Calculation");
	JLabel main_heading = new JLabel("Loan & Mortage Calculation");
	
	public loan_and_mortage_calculation_main_frame(){
		
		JPanel panel1 = new JPanel();
		Font font = main_heading.getFont();
	 	main_heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,700,80);
//		panel1.setBackground(Color.black);
		panel1.add(main_heading);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(200,80,300,80);
		panel2.add(loan_payment_calculation);
		loan_payment_calculation.addActionListener(this);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(200,160,300,80);
		panel3.add(loan_balance_calculation);
		loan_balance_calculation.addActionListener(this);
		
		
		
		JPanel panel = new JPanel();
	
		
		main_frame.add(panel1);
		main_frame.add(panel2);
		main_frame.add(panel3);
		main_frame.add(panel);
		main_frame.setVisible(true);
		main_frame.setSize(700,700);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == loan_payment_calculation) {
			loan_payment_calculations lpc = new loan_payment_calculations();
		}
		else {
			loan_balance_calculations lbc = new loan_balance_calculations();
		}
		
	}
	
}

class loan_payment_calculations extends JFrame implements ActionListener{
	JFrame loan_payment = new JFrame();
	JTextField field1,field2,field3;
	JButton calculate_loan_payment;
	JLabel intrest_rate,initial_loan_principle,number_of_months,heading,answer;
	public loan_payment_calculations(){
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		calculate_loan_payment = new JButton("Calculate Loan Payment");
		intrest_rate = new JLabel("Intrest Rate :");
		initial_loan_principle = new JLabel("Initial Loan Principle:");
		number_of_months = new JLabel("Number Of Months:");
		answer = new JLabel("Loan Payment");
		heading = new JLabel("Loan Payment Calculation");
		
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(100,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(200,80,300,20);
		panel2.add(intrest_rate);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(200,160,300,20);
		panel3.add(initial_loan_principle);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(200,240,300,20);
		panel4.add(number_of_months);
		panel4.add(field3);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel5.setBounds(150,320,400,20);
		panel5.add(answer);
		panel5.add(calculate_loan_payment);
		calculate_loan_payment.addActionListener(this);
//		panel5.add(Box.createRigidArea(new Dimension(0, 3)));
		
		
		JPanel panel = new JPanel();
		
		loan_payment.add(panel1);
		loan_payment.add(panel2);
		loan_payment.add(panel3);
		loan_payment.add(panel4);
		loan_payment.add(panel5);
		loan_payment.add(panel);
		loan_payment.setVisible(true);
		loan_payment.setSize(700,700);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float intrest_rate = Float.parseFloat(field1.getText());
		float initial_payment = Float.parseFloat(field2.getText());
		float number_of_payments = Float.parseFloat(field3.getText());
		float ans;
		float intrest_rate_power =	 (float) Math.pow((1+intrest_rate), -number_of_payments);	
		ans = (intrest_rate*initial_payment)/(1-intrest_rate_power);
		answer.setText("Loan Payment :"+ans);
	}
	
}

class loan_balance_calculations extends JFrame implements ActionListener{
	JFrame loan_payment = new JFrame();
	JTextField field1,field2,field3,field4;
	JButton calculate_loan_balance;
	JLabel intrest_rate,initial_loan_principle,number_of_months,number_of_payments_done,heading,answer;

	public loan_balance_calculations() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		field4 = new JTextField(10);
		calculate_loan_balance = new JButton("Calculate Loan Payment");
		intrest_rate = new JLabel("Intrest Rate :");
		initial_loan_principle = new JLabel("Initial Loan Principle:");
		number_of_months = new JLabel("Number Of Months:");
		number_of_payments_done = new JLabel("Number Of Payments Completed:");
		answer = new JLabel("Loan Balance:");
		heading = new JLabel("Loan Balance Calculation");
		
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(100,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(200,80,300,20);
		panel2.add(intrest_rate);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(200,160,300,20);
		panel3.add(initial_loan_principle);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(200,240,300,20);
		panel4.add(number_of_months);
		panel4.add(field3);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel5.setBounds(200,320,400,20);
		panel5.add(number_of_payments_done);
		panel5.add(field4);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel6.setBounds(150,400,400,20);
		panel6.add(answer);
		panel6.add(calculate_loan_balance);
		calculate_loan_balance.addActionListener(this);
//		panel5.add(Box.createRigidArea(new Dimension(0, 3)));
		
		
		JPanel panel = new JPanel();
		
		loan_payment.add(panel1);
		loan_payment.add(panel2);
		loan_payment.add(panel3);
		loan_payment.add(panel4);
		loan_payment.add(panel5);
		loan_payment.add(panel6);
		loan_payment.add(panel);
		loan_payment.setVisible(true);
		loan_payment.setSize(700,700);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float intrest_rate = Float.parseFloat(field1.getText());
		float initial_payment = Float.parseFloat(field2.getText());
		float number_of_payments = Float.parseFloat(field3.getText());
		float number_of_payments_remaining = Float.parseFloat(field4.getText());
		float intrest_rate_power1 =	 (float) Math.pow((1+intrest_rate), number_of_payments);	
		float intrest_rate_power2 = (float) Math.pow((1+intrest_rate), (number_of_payments-1));
		float intrest_rate_power3 = (float) Math.pow((1+intrest_rate), number_of_payments_remaining);
		float ans;
		ans = (initial_payment)*((intrest_rate_power1 - intrest_rate_power3)/intrest_rate_power2);
		answer.setText("Loan Balance :"+ans);
	}
	
}


	

