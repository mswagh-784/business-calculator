package swingPrograms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class arithmetic_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation c = new calculation();
	}
}

class calculation extends JFrame implements ActionListener{
	JTextField field1,field2;
	JButton addButton,subButton,mulButton,divButton;
	JLabel answer;
	public calculation() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		addButton = new JButton("Addition");
		subButton = new JButton("Substraction");
		mulButton = new JButton("Multiplication");
		divButton = new JButton("Division");
		answer = new JLabel("Result");
		

		setLayout(new FlowLayout());
		add(field1);
		add(field2);
		add(addButton);
		add(subButton);
		add(mulButton);
		add(divButton);
		add(answer);
		
		
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		
		setVisible(true);
		setSize(500,500);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float n1=Float.parseFloat(field1.getText());
        float n2=Float.parseFloat(field2.getText());
        float ans;
		if(e.getSource() == addButton) {
			ans = n1+n2;
	        answer.setText(""+ans);
		}
		else if (e.getSource() == subButton) {
			ans = n1-n2;
	        answer.setText(""+ans);
		}
		else if (e.getSource() == mulButton) {
			ans = n1*n2;
	        answer.setText(""+ans);
		}
		else if (e.getSource() == divButton) {
			try {
				ans = n1/n2;
				if(n2==0) {
					throw new IllegalArgumentException("Invalid input");
				}
				else {
					 answer.setText(""+ans);
				}
			}catch(IllegalArgumentException e1) {
				answer.setText("Invalid Input");
			}
			
		}
	}
	
}
