package swingPrograms;


import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class financial_ratios {
	public static void main(String args[]) {
		financial_ratios_main_frame fr = new financial_ratios_main_frame();
	}
}


//main frame
class financial_ratios_main_frame implements ActionListener{
	JFrame main_frame = new JFrame();
	JButton current_ratio = new JButton("Current Ratio");
	JButton quick_ratio = new JButton("Quick Ratio");
	JButton return_on_assets = new JButton("Return On Assets");
	JButton return_on_equity = new JButton("Return On Equity");
	JButton inventory_turnover = new JButton("Inventory Turnover");
	JButton accounts_recievable_amount = new JButton("Accounts Recievable Amount");
	JLabel main_heading = new JLabel("Financial Ratios");
	
	public financial_ratios_main_frame() {
		// TODO Auto-generated method stub
		JPanel panel1 = new JPanel();
		Font font = main_heading.getFont();
	 	main_heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,700,80);
//		panel1.setBackground(Color.black);
		panel1.add(main_heading);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(200,80,300,80);
		panel2.add(current_ratio);
		current_ratio.addActionListener(this);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(200,160,300,80);
		panel3.add(quick_ratio);
		quick_ratio.addActionListener(this);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(200,240,300,80);
		panel4.add(return_on_assets);
		return_on_assets.addActionListener(this);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(200,320,300,80);
		panel5.add(return_on_equity);
		return_on_equity.addActionListener(this);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(200,400,300,80);
		panel6.add(inventory_turnover);
		inventory_turnover.addActionListener(this);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(200,480,300,80);
		panel7.add(accounts_recievable_amount);
		accounts_recievable_amount.addActionListener(this);
		
//		panel2.add(return_on_equity);
//		panel2.add(inventory_turnover);
//		panel2.add(accounts_revievable_amount);
		
		JPanel panel = new JPanel();
		
		main_frame.add(panel1);
		main_frame.add(panel2);
		main_frame.add(panel3);
		main_frame.add(panel4);
		main_frame.add(panel5);
		main_frame.add(panel6);
		main_frame.add(panel7);
		main_frame.add(panel);
		main_frame.setVisible(true);
		main_frame.setSize(700,700);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == current_ratio) {
			current_ratio cr = new current_ratio();
		}
		else if(e.getSource() == quick_ratio) {
			quick_ratio qr = new quick_ratio();
		}
		else if(e.getSource() == return_on_assets) {
			return_on_assets roa = new return_on_assets();
		}
		else if(e.getSource() == return_on_equity) {
			return_on_equity roe = new return_on_equity();
		}
		else if(e.getSource() == inventory_turnover) {
			inventory_turnover it = new inventory_turnover();
		}
		else {
			accounts_recievable_turnover art = new accounts_recievable_turnover();
		}
	}
}

//current ratio
class current_ratio extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_current_ratio;
	JLabel total_current_assets,total_current_liabilities,heading,answer;
	public current_ratio(){
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_current_ratio = new JButton("Calculate Current Ratio");
		total_current_assets = new JLabel("Total Current Assets :");
		total_current_liabilities = new JLabel("Total Current Liabilities:");
		answer = new JLabel("Current Ratio");
		heading = new JLabel("Current Ratio");
		
		
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
		panel2.add(total_current_assets);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,300,20);
		panel3.add(total_current_liabilities);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_current_ratio);
		calculate_current_ratio.addActionListener(this);
		
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
		ans = n1/n2;
		answer.setText("Current Ratio :"+ans);
	}
}

//quick ratio
class quick_ratio extends JFrame implements ActionListener{
	JFrame quick_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_quick_ratio;
	JLabel current_assets,current_liabilities,heading,answer;
	JLabel info1,info2,info3;
	
	public quick_ratio() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_quick_ratio = new JButton("Calculate Current Ratio");
		current_assets = new JLabel("Current Assets - Inventory :");
		current_liabilities = new JLabel("Current Liabilities:");
		answer = new JLabel("Quick Ratio :");
		heading = new JLabel("Quick Ratio");
		info1 = new JLabel("Current Assets : Assets that are expected to be connected into"
				+ "cash or used up within a year");
		info2 = new JLabel("Inventory : Rpresents the value of goods a company has in stock");
		info3 = new JLabel("Current Liabilities : Obligations that are due within one year");
		
		
		
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
		panel2.add(current_assets);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,300,20);
		panel3.add(current_liabilities);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_quick_ratio);
		calculate_quick_ratio.addActionListener(this);
		
//		
//		JPanel panel5 = new JPanel();
//		panel5.setBounds(50,240,400,30);
//		panel5.setLayout(new GridLayout(1,1));
//		panel5.add(info1);
//		JPanel panel6 = new JPanel();
//		panel6.setBounds(50,240,400,30);
//		panel6.add(info2);
//		JPanel panel7 = new JPanel();
//		panel7.setBounds(50,240,400,30);
//		panel7.add(info3);
		
		JPanel panel =new JPanel(); 
		
		
//		quick_ratio.setLayout(new GridLayout(6,1));
		quick_ratio.add(panel1);
		quick_ratio.add(panel2);
		quick_ratio.add(panel3);
		quick_ratio.add(panel4);
//		quick_ratio.add(panel5);
//		quick_ratio.add(panel6);
//		quick_ratio.add(panel7);
		quick_ratio.add(panel);
		quick_ratio.setVisible(true);
		quick_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float ans;
		ans = n1/n2;
		answer.setText("Quick Ratio :"+ans);
	}
	
}

//return on assets
class return_on_assets extends JFrame implements ActionListener{
	JFrame quick_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_return_on_assets;
	JLabel net_income,average_total_assets,heading,answer;
	public return_on_assets() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_return_on_assets= new JButton("Calculate Return On Assets");
		net_income = new JLabel("Net Income :");
		average_total_assets = new JLabel("Average Total Assets:");
		answer = new JLabel("Return On Assets :");
		heading = new JLabel("Return On Assets");
		
		
		
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
		panel2.add(net_income);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,300,20);
		panel3.add(average_total_assets);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_return_on_assets);
		calculate_return_on_assets.addActionListener(this);
		

		
		JPanel panel =new JPanel(); 
		
		

		quick_ratio.add(panel1);
		quick_ratio.add(panel2);
		quick_ratio.add(panel3);
		quick_ratio.add(panel4);

		quick_ratio.add(panel);
		quick_ratio.setVisible(true);
		quick_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float ans;
		ans = n1/n2;
		answer.setText("Return On Assets :"+ans);
	}
	
}

//return on equity
class return_on_equity extends JFrame implements ActionListener{
	JFrame quick_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_return_on_equity;
	JLabel net_income,share_holders_equity,heading,answer;
	public return_on_equity() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_return_on_equity= new JButton("Calculate Return On Equity");
		net_income = new JLabel("Net Income :");
		share_holders_equity = new JLabel("Share Holders Equity (in %) :");
		answer = new JLabel("Return On Equity :");
		heading = new JLabel("Return On Equity");
		
		
		
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
		panel2.add(net_income);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,330,20);
		panel3.add(share_holders_equity);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_return_on_equity);
		calculate_return_on_equity.addActionListener(this);
		

		
		JPanel panel =new JPanel(); 
		
		

		quick_ratio.add(panel1);
		quick_ratio.add(panel2);
		quick_ratio.add(panel3);
		quick_ratio.add(panel4);

		quick_ratio.add(panel);
		quick_ratio.setVisible(true);
		quick_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float ans;
		ans = (n1/n2)*100;
		answer.setText("Return On Equity :"+ans+"%");
	}
	
}

//inventory turnover
class inventory_turnover extends JFrame implements ActionListener{
	JFrame quick_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_inventory_turnover;
	JLabel cost_of_goods_sold,average_inventory,heading,answer;
	public inventory_turnover() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_inventory_turnover= new JButton("Calculate Inventory Turnover");
		cost_of_goods_sold = new JLabel("Cost Of Goods sold :");
		average_inventory = new JLabel("Average Inventory :");
		answer = new JLabel("Inventory Turnover :");
		heading = new JLabel("Inventory Turnover");
		
		
		
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
		panel2.add(cost_of_goods_sold);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,330,20);
		panel3.add(average_inventory);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_inventory_turnover);
		calculate_inventory_turnover.addActionListener(this);
		

		
		JPanel panel =new JPanel(); 
		
		

		quick_ratio.add(panel1);
		quick_ratio.add(panel2);
		quick_ratio.add(panel3);
		quick_ratio.add(panel4);

		quick_ratio.add(panel);
		quick_ratio.setVisible(true);
		quick_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float ans;
		ans = (n1/n2);
		answer.setText("Inventory Turnover :"+ans);
	}
	
}

class accounts_recievable_turnover extends JFrame implements ActionListener{
	JFrame quick_ratio = new JFrame();
	JTextField field1,field2;
	JButton calculate_accounts_recievable_turnover;
	JLabel net_credit_sales,average_accounts_recievable,heading,answer;
	public accounts_recievable_turnover() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		calculate_accounts_recievable_turnover = new JButton("Calculate Accounts Recivable Turnnover");
		net_credit_sales = new JLabel("Net Credit Sales :");
		average_accounts_recievable = new JLabel("Average Accounts Recievable :");
		answer = new JLabel("Accounts Recievable Turnover :");
		heading = new JLabel("Accounts Recievable Turnover");
		
		
		
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
		panel2.add(net_credit_sales);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel3.setBounds(50,160,400,20);
		panel3.add(average_accounts_recievable);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_accounts_recievable_turnover);
		calculate_accounts_recievable_turnover.addActionListener(this);
		

		
		JPanel panel =new JPanel(); 
		
		

		quick_ratio.add(panel1);
		quick_ratio.add(panel2);
		quick_ratio.add(panel3);
		quick_ratio.add(panel4);

		quick_ratio.add(panel);
		quick_ratio.setVisible(true);
		quick_ratio.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1 = Float.parseFloat(field1.getText());
		float n2 = Float.parseFloat(field2.getText());
		float ans;
		ans = (n1/n2);
		answer.setText("Accountd Recievable Turnover :"+ans);
	}
	
}


