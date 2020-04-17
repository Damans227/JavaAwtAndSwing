package guiSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Lab02 {

	public static void main(String[] args) {
	
Addition obj=new Addition();




	}

}
 class Addition extends JFrame implements ActionListener{  // 1)extend JFrame class   // Card layout as default

	 JLabel l = new JLabel ("Hello World"); // 3) Add gui components 
	 JTextField t1=new JTextField(20);
	 JTextField t2=new JTextField(20);
	 JButton b=new JButton("OK");
	 
	 public Addition() {
		
		 
		 b.addActionListener(this); //ActionListener is an interface
		 
		 add(l);
		 add(t1);
		 add(t2);
		 add(b);
		 
		 setLayout(new FlowLayout());// 5) setFlowLayout, GridLayout
		 setVisible(true);// 2) make the frame visible
		 setSize(400,400); // 4) set size
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //6 close statement
	 }
	 
	 public void actionPerformed(ActionEvent ae) {
		 int num1=Integer.parseInt(t1.getText());
		 int num2=Integer.parseInt(t2.getText());
		 
		 int value=num1+num2;
		 l.setText(value+"");
		 
	 }
	 
 }
