package org.hrd.JAVA_SHORTCOURSE;

import java.awt.Button;
import java.awt.Frame;

public class FirstFrame extends Frame {
	public FirstFrame()
	{
		Button b=new Button("Cancel");
		b.setBounds(500, 500, 80, 30);
		add(b);
		setSize(1200,678);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FirstFrame();
	}
}
