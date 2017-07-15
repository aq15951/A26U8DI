package li.fufuture.balldemo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BallComponent extends JPanel {

	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGTH = 500;

	private List<Ball> balls = new ArrayList< >();

	public void add(Ball b) {
		balls.add(b);
	}
	
	public void paintCompinent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		for ( Ball b: balls) {
			g2.fill(b.getShape());
		}
		
	}
	
	public Dimension getPreferedSize(){
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGTH);
		
	}
	
}
