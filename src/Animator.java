
/**
 * The animator periodically moves the balls and repaints the canvas.
 * This is the active class
 * 
 * @author William
 */
public class Animator implements Runnable
{
    /**
     * The ball
     */
    private Ball ball ;
    
    /**
     * The canvas on which the ball is drawn
     */
    private BallCanvas canvas ;

    /**
     * Constructor for the animator
     * 
     * @param theBall the ball to be animated
     * @param theCanvas the canvas for painting the animation
     */
    public Animator(Ball theBall, BallCanvas theCanvas) 
    {
        ball = theBall ;
        canvas = theCanvas ;
    }

    /**
     * Run the animation
     */
    public void run()
    {
        while (! Thread.interrupted() && ! ball.atRightEdge()) {
            ball.move() ;
            canvas.repaint() ;
            try {
                Thread.sleep(10) ;
            } catch (InterruptedException e) {
                System.out.println("Program was interupted");
            }
        }
            System.out.println("stopped");
    }

}
