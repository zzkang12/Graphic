package com.ex;

import java.awt.*;


public class LabelEx extends Frame {

	Label la1; Label la2; Label la3; Label la4;
	Font f1; Font f2; Font f3;
	
	public LabelEx() {
		super("Label");
		f1 = new Font("±¼¸²Ã¼", Font.BOLD, 20);
		f2 = new Font("±Ã¼­Ã¼", Font.ITALIC, 25);
		f3 = new Font("°íµñ", Font.PLAIN, 10);
		
		la1 = new Label("¾È³çÇÏ¼¼¿ä");
		la2 = new Label("È«±æµ¿ÀÔ´Ï´Ù.", Label.CENTER);
		la3 = new Label("Á¶¼±ÀÇ Çù°´ÀÔ´Ï´Ù.", Label.RIGHT);
		la4 = new Label("¿ÍÀÌ¶ó³ë.", Label.LEFT);
		
		setLayout(new GridLayout(4, 1));
		
		
		la1.setBackground(Color.black);
		la2.setBackground(Color.BLUE);
		la3.setBackground(Color.red);
		la4.setBackground(Color.green);
		
		la1.setFont(f1);
		la2.setFont(f2);
		la3.setFont(f2);
		la4.setFont(f2);
		
		add(la1);add(la2);add(la3);add(la4);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		LabelEx ex= new LabelEx();
		
		

	}

}
