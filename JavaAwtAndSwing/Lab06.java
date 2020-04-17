package guiSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab06 {

	public static void main(String[] args) {
		
X obj=new X();
	}

}

class X extends JFrame implements ActionListener{
	int i;
	JProgressBar p;
	public X() {
		
		JButton b= new JButton("ADD Form");
		p=new JProgressBar(0,20);
		
		
		Timer t=new Timer(250, this);
		

		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				t.start();
			}
			
			
		});
		
		add(b);
		add(p);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(i==20)
		{new AddSub();
		dispose();
		}
		i++;
		
		p.setValue(i);
	}
	
	
}
