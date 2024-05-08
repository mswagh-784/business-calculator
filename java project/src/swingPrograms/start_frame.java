package swingPrograms;
import swingPrograms.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class start_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start_frame_code s = new start_frame_code();
	}
}

class start_frame_code extends JFrame implements ActionListener{
	JFrame frame = new JFrame();
	JLabel image_label = new JLabel();
	JButton start_button = new JButton("Start Now");
	public start_frame_code() {
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Mohit SW\\eclipse-workspace\\java project\\src\\swingPrograms\\bg.jpg");
		Image bg_image = icon.getImage();
		Image scaled_bg_image = bg_image.getScaledInstance(800,600,bg_image.SCALE_SMOOTH);
		icon = new ImageIcon(scaled_bg_image);
		image_label.setIcon(icon);
		
		JPanel for_button = new JPanel();
		for_button.setLayout(new FlowLayout());
//		for_button.setBackground(Color.black);
		for_button.setBounds(300,200,200,200);
		for_button.add(start_button);
		start_button.addActionListener(this);
		
		JPanel panel = new JPanel();
		
		getContentPane().add(image_label,BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
		frame.add(image_label);
		frame.add(for_button);
		frame.add(panel);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			main_frame m = new main_frame();
		
	}
}