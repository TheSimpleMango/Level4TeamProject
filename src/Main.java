import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main implements ActionListener{

	JFrame frame;
	JPanel panel;
	JButton login, create, exit;
	
	public static void main(String[] args){
		
		new Main();
		
		
	}
	
	public Main(){
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.add(panel);
		
		switchGUI(0);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public void switchGUI(int gui){
		
		panel.removeAll();
		
		switch(gui){
		case 0:
			login = new JButton("Login");
			panel.add(login);
			create = new JButton("Create new account");
			panel.add(create);
			exit = new JButton("Exit");
			panel.add(exit);
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		
		
		
	}
	
}
