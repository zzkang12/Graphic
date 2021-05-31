package com.ex;
import java.awt.*;
import java.awt.event.*;

public class BorderEx extends Frame{

	Label a, b, c, d, e;
	
	public BorderEx() {
	// 레이아웃 설정
		setLayout(new BorderLayout(5, 5));
		
		a = new Label("↑", Label.CENTER);
		b = new Label("↓", Label.CENTER);
		c = new Label("←", Label.CENTER);
		d = new Label("→", Label.CENTER);
		e = new Label("move", Label.CENTER);
		
		setBackground(Color.gray);
		a.setBackground(Color.red);
		b.setBackground(Color.green);
		c.setBackground(Color.blue);
		d.setBackground(Color.magenta);
		e.setBackground(Color.yellow);
		
		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);
		
		
		add("North", a);
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add("Center", e);
		setLocation(500, 500);
		pack();
		setVisible(true);
		addWindowListener(new WinEvent());
	}
	
	
	public static void main(String[] args) {
	new BorderEx();
	
	}

	public class WinEvent extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
}
