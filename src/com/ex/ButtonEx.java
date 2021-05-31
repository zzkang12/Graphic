package com.ex;

import java.awt.*;
public class ButtonEx extends Frame{
	
	private String[] str = {"7", "8", "9", "4", "5", "6", "1", "2", " 3", "#", "0", "*"};
	private Button[] bt = new Button[str.length];

	
	public ButtonEx() {
		super("버튼");
		
		setLayout(new GridLayout(4, 3, 5, 5));

		for(int i = 0; i<bt.length; i++) {
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("궁서체", Font.BOLD, 30));
			add(bt[i]);
		}
		setSize(300, 300);
		setVisible(true);
		
//		WinEvent we= new WinEvent()
//		addWindowListener(we);
		
	}

	public static void main(String[] args) {
		new ButtonEx();
		
		
		
	}

}
