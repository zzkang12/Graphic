package com.ex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListEx extends Frame{

	private Label lb = new Label("과목 목록");
	private List li = new List(4, true);
	private Button bt = new Button("확인");
	private String[] name;
	
	public ListEx(String[] a) {
		super("과목 목록");
		name = a;
		setLayout(new BorderLayout());
		
		for(int i = 0; i<name.length; i++) {
			li.add(name[i]);
		}
		add("North", lb);
		add("South", bt);
		add("Center", li);
		
		li.setFont(new Font ("굴림체", Font.BOLD, 30));
		pack();
		setVisible(true);
		WinEvent we= new WinEvent();
		addWindowListener(we);
	}
	
	public static void main(String[] args) {
		new ListEx(args);
	}

	public class WinEvent extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
