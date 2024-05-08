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

public class profitibility_analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		profitibility_analysis_main pa = new profitibility_analysis_main();
	}

}

class profitibility_analysis_main extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JButton gross_profit_margin,net_profit_margin,return_on_investment;
	JLabel heading;
	public profitibility_analysis_main() {
		gross_profit_margin = new JButton("Gross Profit Margin");
		net_profit_margin = new JButton("Net Profit Margin");
		return_on_investment = new JButton("Return On Investment");
		heading = new JLabel("--  Profitibility Analysis  --");
		
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,1));
		panel2.setBounds(150,80,200,50);
		panel2.add(gross_profit_margin);
		gross_profit_margin.addActionListener(this);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(3,1));
		panel3.setBounds(150,160,200,50);
		panel3.add(net_profit_margin);
		net_profit_margin.addActionListener(this);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(3,1));
		panel4.setBounds(150,240,200,50);
		panel4.add(return_on_investment);
		return_on_investment.addActionListener(this);
		
		JPanel panel = new JPanel();
		
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
		if(e.getSource() == gross_profit_margin) {
			gross_profit_margin gpm = new gross_profit_margin();
		}
		else if(e.getSource() == net_profit_margin) {
			net_profit_margin npm = new net_profit_margin();
		}
		else {
			return_on_investment roi = new return_on_investment();
		}
	}
	
}

class gross_profit_margin extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);;
	JButton calculate_gpm = new JButton("Calculate Gross Profit Margin");
	JLabel total_revenue = new JLabel("Total Revenue :");
	JLabel cost_of_goods_sold = new JLabel("Cost OF Goods Sold :");
	JLabel answer = new JLabel("Gross Profit Margin :");
	JLabel heading = new JLabel("--  Gross Profit Margin  --");
	public gross_profit_margin() {
		
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(50,80,300,20);
		panel2.add(total_revenue);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
		panel3.setBounds(50,160,300,20);
		panel3.add(cost_of_goods_sold);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_gpm);
		calculate_gpm.addActionListener(this);
		
		JPanel panel = new JPanel();
		
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
		ans = (n1/n2)/n1;
		answer.setText("Gross Profit Margin :"+ans);
	}
	
}

class net_profit_margin extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);;
	JButton calculate_npm = new JButton("Calculate Gross Profit Margin");
	JLabel total_revenue = new JLabel("Total Revenue :");
	JLabel net_income = new JLabel("Net Income :");
	JLabel answer = new JLabel("Net Profit Margin :");
	JLabel heading = new JLabel("--  Net Profit Margin  --");
	public net_profit_margin() {

		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(50,80,300,20);
		panel2.add(total_revenue);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
		panel3.setBounds(50,160,300,20);
		panel3.add(net_income);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_npm);
		calculate_npm.addActionListener(this);
		
		JPanel panel =new JPanel(); 
		
		current_ratio.add(panel1);
		current_ratio.add(panel3);
		current_ratio.add(panel2);
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
		ans = (n2/n1)*100;
		answer.setText("Net Profit Margin :"+ans+"%");
	}
	
}

class return_on_investment extends JFrame implements ActionListener{
	JFrame current_ratio = new JFrame();
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);;
	JButton calculate_roi = new JButton("Calculate Return On Investment");
	JLabel net_profit = new JLabel("Net Profit :");
	JLabel investment_cost = new JLabel("Investment Cost :");
	JLabel answer = new JLabel("Return On Investment :");
	JLabel heading = new JLabel("--  Return On Investment  --");
	public return_on_investment() {
		JPanel panel1 = new JPanel();
		Font font = heading.getFont();
	 	heading.setFont(new Font(font.getName(), font.getStyle(), 30)); // 20 is the font size
		panel1.setBounds(0,0,500,80);
//		panel1.setBackground(Color.black);
		panel1.add(heading);
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,2));
		panel2.setBounds(50,80,300,20);
		panel2.add(net_profit);
		panel2.add(field1);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,2));
		panel3.setBounds(50,160,300,20);
		panel3.add(investment_cost);
		panel3.add(field2);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,2));
//		panel3.setBackground(Color.blue);
		panel4.setBounds(50,240,400,30);
		panel4.add(answer);
		panel4.add(calculate_roi);
		calculate_roi.addActionListener(this);
		
		JPanel panel =new JPanel(); 
		
		current_ratio.add(panel1);
		current_ratio.add(panel3);
		current_ratio.add(panel2);
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
		ans = (n2/n1)*100;
		answer.setText("Return On Investment :"+ans);
	}
	
}