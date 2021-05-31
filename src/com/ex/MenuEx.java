package com.ex;

import java.awt.*;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

public class MenuEx extends Frame {

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("파일");
	private Menu setting = new Menu("설정");
	private Menu view = new Menu("보기");
	private Menu help = new Menu("헬프");
	private MenuItem fnew = new MenuItem("새파일");
	private MenuItem fopen = new MenuItem("파일열기");
	private MenuItem fsave = new MenuItem("파일저장");
	private MenuItem fsaveas = new MenuItem("다른이름으로 저장");
	private MenuItem exit = new MenuItem("나가기");
	
	private Menu ecolor = new Menu("색상");
	private Menu esize = new Menu("크기");
	
	// 색상 설정
	private CheckboxMenuItem ecred = new CheckboxMenuItem("빨강");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("초록");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("파랑");
	private CheckboxMenuItem ecyellow = new CheckboxMenuItem("노랑");

	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");
	
	public MenuEx() {
		super("메뉴바");
		setMenuBar(mb);
		mb.add(file);
		mb.add(view);
		mb.add(help);
		mb.add(setting);
		
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);
		ecolor.add(ecyellow);
			
		esize.add(es10);
		esize.add(es20);
		esize.add(es30);
		
		setting.add(ecolor);
		setting.addSeparator();
		setting.add(esize);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveas);
		file.add(exit);
		
		setLayout(new BorderLayout());

		add("North", new Label("오늘도 수고하셨습니다.", Label.CENTER));
		add("Center", new TextArea());
		Panel p = new Panel(new GridLayout(1, 2));
		p.add(new Button("확인"));
		p.add(new Button("취소"));
		add("South", p);
		pack();
		setSize(300, 300);
		setVisible(true);
		WinEvent we = new WinEvent();
		addWindowListener(we);

	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
