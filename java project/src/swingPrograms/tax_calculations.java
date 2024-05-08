package swingPrograms;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tax_calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tax_calculation_main tc = new tax_calculation_main();
	}
}

class tax_calculation_main extends JFrame implements ActionListener {
	JFrame main_frame = new JFrame();
	JButton income_tax = new JButton("Income Tax");
	JButton sales_tax = new JButton("Sales Tax");
	JButton value_added_tax = new JButton("Value Added tax");
	JLabel main_heading = new JLabel("-- Tax Calculations --");
	
	public tax_calculation_main() {
		JPanel panel1 = new JPanel();
		Font font = main_heading.getFont();
	 	main_heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,700,80);
//		panel1.setBackground(Color.black);
		panel1.add(main_heading);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(200,80,300,80);
		panel2.add(income_tax);
		income_tax.addActionListener(this);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(200,160,300,80);
		panel3.add(sales_tax);
		sales_tax.addActionListener(this);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(200,240,300,80);
		panel4.add(value_added_tax);
		value_added_tax.addActionListener(this);
		
		
		

		
		JPanel panel = new JPanel();
		
		main_frame.add(panel1);
		main_frame.add(panel2);
		main_frame.add(panel3);
		main_frame.add(panel4);
		main_frame.add(panel);
		main_frame.setVisible(true);
		main_frame.setSize(700,700);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == income_tax) {
			income_tax it = new income_tax();
		}
		else if(e.getSource() == sales_tax){
			sales_tax st = new sales_tax();
		}
		else {
			value_added_tax vat = new value_added_tax();
		}
	}
	
}

class income_tax extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JTextField field1,field2,field3;
	JButton calculate_income_tax;
	JLabel income,tax_rate,tax_credits,heading,answer;
	
	public income_tax() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		field3 = new JTextField(10);
		calculate_income_tax = new JButton("Calculate Income Tax");
		income = new JLabel("Taxable Income :");
		tax_rate = new JLabel("Tax Rate :");
		tax_credits = new JLabel("Tax Credits :");
		answer = new JLabel("Income tax :");
		heading = new JLabel("--  Income Tax  --");
		
		
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		//panel for labels and textfield
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(50,80,300,20);
		panel2.add(income);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,300,20);
		panel3.add(tax_rate);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,300,20);
		panel4.add(tax_credits);
		panel4.add(field3);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel5.setBounds(50,320,400,30);
		panel5.add(answer);
		panel5.add(calculate_income_tax);
		calculate_income_tax.addActionListener(this);
		
		JPanel panel =new JPanel(); 
		
		
//		current_ratio.setLayout(new FlowLayout());
//		current_ratio.add(total_current_assets);
//		current_ratio.add(total_current_liabilities);
		
		
		current_ratio.add(panel1);
		current_ratio.add(panel2);
		current_ratio.add(panel3);
		current_ratio.add(panel4);
		current_ratio.add(panel5);
		current_ratio.add(panel);
		current_ratio.setVisible(true);
		current_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float n3 = Float.parseFloat(field3.getText());
		float ans;
		ans = (n1*n2)-n3;
		answer.setText("Income Tax :"+ans);
	}
	
}

class sales_tax extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_sales_tax;
	JLabel purchase_price,tax_rate,heading,answer;
	public sales_tax() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_sales_tax = new JButton("Calculate Sales Tax");
		purchase_price = new JLabel("Purchase Price (WITHOUT TAX) :");
		tax_rate = new JLabel("Tax Rate :");
		answer = new JLabel("Sales tax :");
		heading = new JLabel("--  Sales Tax  --");
		
		
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		//panel for labels and textfield
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(50,80,400,20);
		panel2.add(purchase_price);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,300,20);
		panel3.add(tax_rate);
		panel3.add(field2);
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_sales_tax);
		calculate_sales_tax.addActionListener(this);
		
		JPanel panel =new JPanel(); 
		
		
//		current_ratio.setLayout(new FlowLayout());
//		current_ratio.add(total_current_assets);
//		current_ratio.add(total_current_liabilities);
		
		
		current_ratio.add(panel1);
		current_ratio.add(panel2);
		current_ratio.add(panel3);
		current_ratio.add(panel4);
		current_ratio.add(panel);
		current_ratio.setVisible(true);
		current_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float ans;
		ans = n1*n2;
		answer.setText("Sales Tax :"+ans);
	}
	
}

class value_added_tax extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_value_added_tax;
	JLabel purchase_price,tax_rate,heading,answer;
	public value_added_tax() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_value_added_tax = new JButton("Calculate Value Added Tax");
		purchase_price = new JLabel("Purchase Price (WITHOUT TAX) :");
		tax_rate = new JLabel("Value Added Tax Rate :");
		answer = new JLabel("Value Added tax :");
		heading = new JLabel("--  Value Added Tax  --");
		
		
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		//panel for labels and textfield
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(50,80,400,20);
		panel2.add(purchase_price);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,400,20);
		panel3.add(tax_rate);
		panel3.add(field2);
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_value_added_tax);
		calculate_value_added_tax.addActionListener(this);
		
		JPanel panel =new JPanel(); 
		
		
//		current_ratio.setLayout(new FlowLayout());
//		current_ratio.add(total_current_assets);
//		current_ratio.add(total_current_liabilities);
		
		
		current_ratio.add(panel1);
		current_ratio.add(panel2);
		current_ratio.add(panel3);
		current_ratio.add(panel4);
		current_ratio.add(panel);
		current_ratio.setVisible(true);
		current_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float ans;
		ans = (n1*n2)/100;
		answer.setText("Sales Tax :"+ans);
	}
	
}
