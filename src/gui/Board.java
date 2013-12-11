package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Board extends JFrame{
	
	public Board(){
		super("BasiCalc");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		final Board b = new Board();
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				b.setVisible(true);
			}
		});
	}

}
