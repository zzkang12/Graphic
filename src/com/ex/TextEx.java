package com.ex;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextEx extends Frame{

	private TextField tf = new TextField("제목");
	private TextArea ta = new TextArea("메모", 5, 10);
	private Button bt = new Button("확인");
	private Label la = new Label("내용");
	
	public TextEx() {
		super("텍스트 필드");
		setLayout(new BorderLayout());
		add("North", tf);
		add("South", bt);
		add("Center", ta);
		add("West", la);
		setSize(300, 200);
		setVisible(true);
		
		WinEvent we= new WinEvent();
		addWindowListener(we);
	}
	
	public static void main(String[] args) {
		new TextEx();
	}
	public static class WinEvent extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
