package com.ex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx2 extends Frame {

	public FrameEx2() {
		this.addWindowListener(new WinEvent());
		this.setSize(300, 300);
		this.setVisible(true);
		this.setLocation(200, 200);
	}

	public static void main(String[] args) {
		new FrameEx2();
	}

	class WinEvent extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
