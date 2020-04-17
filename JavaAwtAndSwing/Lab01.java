package guiSwing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lab01 {

	public static void main(String[] args) {
	
Abc obj=new Abc();

	}

}
 class Abc extends JFrame{  // 1)extend JFrame class   // Card layout as default
	 
	 public Abc() {
		
		 JLabel l = new JLabel ("Hello World"); // 3) Add gui components 
		 JLabel l1 = new JLabel ("Welcome Daman!");
		 add(l);
		 add(l1);
		 
		 setLayout(new FlowLayout());// 5) setFlowLayout, GridLayout
		 setVisible(true);// 2) make the frame visible
		 setSize(400,400); // 4) set size
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //6 close statement
	 }
	 
 }
