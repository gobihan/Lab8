
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Canvas for drawing the ball animation.
 * 
 * 
 */
public class BallCanvas extends Canvas
{
    public static final int HEIGHT = 600 ;
    public static final int WIDTH = 1000 ;

    
    /**
     * The ball which is drawn on the canvas
     */
    private Ball ball ;

    /**
     * Create a canvas of size WIDTH x HEIGHT.
     * 
     * @param theBall the ball to be animated
     */
    public BallCanvas(Ball theBall) {
        setSize(WIDTH, HEIGHT) ;
        ball = theBall ;
    }

    /**
     * Repaint the canvas by drawing the ball
     * 
     * @param  g   the graphics context
     */
    public void paint(Graphics g)
    {
       int x = ball.getX() ;
       int y = ball.getY() ;
       int diam = ball.getDiam() ;

       g.setColor(Color.RED) ;
       g.drawOval(x, y, diam, diam) ;
       g.fillOval(x, y, diam, diam) ;
    }
}
