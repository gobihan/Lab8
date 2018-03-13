
/**
 * The ball has a current position and velocity.
 * 
 * @author William
 */
public class Ball
{
    // Cordinates
    private int x ;
    private int y ;
    private int diam ;

    // dynamics
    private int vy ;  // speed downwards
    private final int VX = 3 ; // horizontal speed 
    private final int AY = 1 ; // acceleration downwards
    // acceleration is change of speed
    // constant acceleration is like gravity and produces the characteristic
    //    parabola

    // Multiplier for speed on each bounce
    // Multiplier for speed on each bounce
    // Making this less than 1 causes the bounces to decay gradually
    private final float BOUNCE = 0.9f ;

    /**
     * Constructor for objects of class Ball
     * 
     * @param theDiam the ball diameter
     */
    public Ball(int theDiam)
    {
        // diameter
        diam = theDiam ;

        // set initial co-ordinates
        x = diam / 2 ;
        y = diam / 2 ;

        // initial vertical speed
        vy = 0 ;
    }

    /**
     * Get the x co-ordinate
     * 
     * @return  The x co-ordinate of the position
     */
    public int getX() 
    {
       return x ;
    } 
   

    /**
     * Get the y co-ordinate
     * 
     * @return  The x co-ordinate of the position
     */
    public int getY() 
    {
       return y ;
    } 
   

    /**
     * Get the ball's diameter 
     * 
     * @return  The diameter
     */
    public int getDiam() 
    {
       return diam ;
    } 

    /**
     * Move the ball. The horizontal speed is constant.
     * The vertical speed increased by a constant amount, simulating
     * gravity and giving a parabolic motion.
     * 
     * When the ball touches the ground the vertical speed reverses.
     */
    public void move() {
       x = x + VX ;
       vy = vy + AY ;
       y = y + vy ;

       // bounce
       if (y >= BallCanvas.HEIGHT - diam) {
            // the ball is on the ground, reverse the speed
            vy = - (int) (vy * BOUNCE) ;
            // place the ball on the ground
            y = BallCanvas.HEIGHT - diam ;
        } 
    }

    /**
     * Test if ball at right hand edge
     * 
     * @return  true if right edge reached
     */
    public boolean atRightEdge() 
    {
       return x > BallCanvas.WIDTH - diam ;
    }

    public void reset(){

        // set initial co-ordinates
        x = diam / 2 ;
        y = diam / 2 ;

        // initial vertical speed
        vy = 0 ;
    }
}
