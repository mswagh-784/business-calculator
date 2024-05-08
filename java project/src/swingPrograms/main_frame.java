package swingPrograms;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import swingPrograms.*;

public class main_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main_frame_elements m = new main_frame_elements();
	}
}

class main_frame_elements extends JFrame implements ActionListener{
	JButton arithmetic_operation = new JButton("Arithmetic Operation");
	JButton currency_conversion = new JButton("Currency Conversion");
	JButton financial_ratios = new JButton("Financial Ratios");
	JButton loan_and_mortage_calculation = new JButton("Loan & Mortage");
	JButton payroll_calculations = new JButton("Payroll Calculations");
	JButton profitibility_analysis = new JButton("Profitibility Analysis");
	JButton tax_calculations = new JButton("Tax Calculations");
	public main_frame_elements() {
		
		
		JLabel main_heading = new JLabel("BizzCal");
	 	Font font = main_heading.getFont();
	 	main_heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0,0,500,80);
		panel1.add(main_heading);
		
		JPanel for_Buttons1 = new JPanel();
		for_Buttons1.setBounds(0,50,500,80);
		for_Buttons1.add(arithmetic_operation);
		arithmetic_operation.addActionListener(this);
//		for_Buttons1.add(currency_conversion);
//		currency_conversion.addActionListener(this);
		for_Buttons1.add(tax_calculations);
		tax_calculations.addActionListener(this);
		
		
		JPanel for_Buttons2 = new JPanel();
		for_Buttons2.setBounds(0,100,500,80);
		for_Buttons2.add(financial_ratios);
		financial_ratios.addActionListener(this);
		for_Buttons2.add(loan_and_mortage_calculation);
		loan_and_mortage_calculation.addActionListener(this);
		
		
		JPanel for_Buttons3 = new JPanel();
		for_Buttons3.setBounds(0,150,500,80);
		for_Buttons3.add(profitibility_analysis);
		profitibility_analysis.addActionListener(this);
		
		
	
		
		JPanel panel = new JPanel();
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);
	//	frame.setLayout(null);
		frame.add(panel1);
		frame.setBackground(Color.gray);
		frame.add(for_Buttons1);
		frame.add(for_Buttons2);
		frame.add(for_Buttons3);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == arithmetic_operation) {
			swingPrograms.arithmetic_operations am = new arithmetic_operations();
			am.main(null);
		}
//		else if(e.getSource() == currency_conversion){
//			swingPrograms.currency_conversion cc = new currency_conversion();
//			cc.main(null);
//		}
		else if(e.getSource() == financial_ratios) {
			swingPrograms.financial_ratios fr = new financial_ratios();
			fr.main(null);
		}
		else if(e.getSource() == loan_and_mortage_calculation){
			swingPrograms.loan_and_mortage_calculation lmc = new loan_and_mortage_calculation();
			lmc.main(null);
		}
		else if(e.getSource() == profitibility_analysis) {
			swingPrograms.profitibility_analysis pa = new profitibility_analysis();
			pa.main(null);
		}
		else {
			swingPrograms.tax_calculations tc = new tax_calculations();
			tc.main(null);
		}
	}
}
