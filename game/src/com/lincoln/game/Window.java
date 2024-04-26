package com.lincoln.game;
import javax.swing.JFrame;
public class Window extends JFrame
{
	Window() {
		board b=new board();
        //window f=new Window();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("NINJA GAME IN JAVA");
		setSize(1500,800);
		setResizable(false);
		setLocationRelativeTo(null);
		add(b);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Window();
	}
}