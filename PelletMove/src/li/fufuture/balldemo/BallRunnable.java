package li.fufuture.balldemo;

public class BallRunnable implements Runnable {

	
	private Ball ball;
	private BallComponent com;
	
	public BallRunnable(Ball ball, BallComponent com) {
		this.ball = ball;
		this.com = com;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
