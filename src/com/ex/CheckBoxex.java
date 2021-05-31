package com.ex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.ex.ChoiceEx.WinEvent;

public class CheckBoxex extends Frame{

	private Label lb = new Label("좋아하는 과일은 ?");
	private Checkbox[] cb = {
			new Checkbox("바나나"),
			new Checkbox("딸기", true),
			new Checkbox("파인애플")};
	private Button bt = new Button("확인");
	
	
	public CheckBoxex() {
		super("Checkbox");
		setLayout(new GridLayout(5, 1));
		add(lb);
		for(int i = 0; i<3; i++) {
			add(cb[i]);
		}
		pack();
		setVisible(true);
		WinEvent we= new WinEvent();
		addWindowListener(we);
		
	}
	
	
	public static void main(String[] args) {
		new CheckBoxex();
		
	}
	public class WinEvent extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
