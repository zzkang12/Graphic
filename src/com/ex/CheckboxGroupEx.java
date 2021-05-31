package com.ex;
import java.awt.*;

public class CheckboxGroupEx extends Frame{

	GridLayout gl = new GridLayout(4, 1);
	Label la = new Label("성별은?");
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox man = new Checkbox("남성", cg, true);
	Checkbox woman = new Checkbox("여성", cg, true);
	Button bt = new Button("확인");
	
	public CheckboxGroupEx() {
		super("체크박스그룹");
		setLayout(gl);
		add(la);
		add(man);
		add(woman);
		add(bt);
		pack();
		setVisible(true);
		WinEvent we= new WinEvent();
		addWindowListener(we);
		
	}
	
	public static void main(String[] args) {
	new CheckboxGroupEx();
	}

}
