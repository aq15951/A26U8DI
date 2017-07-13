package li.fufuture.balldemo;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

//–°«Ú¿‡
public class Ball {

	private static final int XSIZE=20;
	private static final int YSIZE=20;
	private double x=0;
	private double y=0;
	private double dx=1;
	private double dy=1;
	
	public void move(Rectangle2D bounds){
		
		
	}
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,XSIZE,YSIZE);
	}
	
}
