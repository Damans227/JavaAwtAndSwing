package guiSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab05 {

	public static void main(String[] args) {
		Xyz obj = new Xyz();

	}

}

class Xyz extends JFrame{
	
	public Xyz() {
		
		addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {

				int x=e.getX();
				int y=e.getY();
				
				System.out.println(x+" , "+y);
				
			}
			
		});
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
