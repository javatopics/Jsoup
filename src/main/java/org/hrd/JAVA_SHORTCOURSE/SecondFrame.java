package org.hrd.JAVA_SHORTCOURSE;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondFrame extends WindowAdapter implements ActionListener{
	Frame f;
	Container container;
	public SecondFrame(){
		f=new Frame();
		Button b=new Button("close");
		b.setBounds(300,100,70,30);
		b.addActionListener(this);
		
		//container
		container=new Container();
		
		f.add(b);
		f.setTitle("Login");
		f.setSize(500, 250);
		f.setFont(new Font("Khmer OS Battambang", Font.CENTER_BASELINE, 12));
		f.setLayout(null);
		Image image=Toolkit.getDefaultToolkit().getImage("src/assets/image/login.png");
		f.setIconImage(image);
		f.setVisible(true);
		
		f.addWindowListener(this);
		
		System.out.println(f.getAlignmentY());
		System.out.println(f.getAlignmentX());
		//Component
		
	}
	
	public void windowClosing(WindowEvent e){
		f.dispose();
	}
	public static void main(String[] args) {
		new SecondFrame();
	}
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
