package li.fufuture.balldemo;

public class BallRunnable implements Runnable {

	private Ball ball;
	private BallComponent com;
	public static final int STEPS = 4000;
	public static final int DELAY = 1;

	public BallRunnable(Ball ball, BallComponent com) {
		this.ball = ball;
		this.com = com;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i <= STEPS; i++) {
				ball.move(com.getBounds());
				com.paintCompinent(com.getGraphics());
				Thread.sleep(DELAY);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
