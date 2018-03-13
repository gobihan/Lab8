import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A container for a set of balls.  New balls can be added.
 *
 * 
 * @author William Marsh
 *
 */
public class BallSet {
    
    
    // private variables
    private List<Ball> balls ;
    private int size ;
    Random random ;
    
    /**
     * Create a new ball set - initially empty
     *
     */
    public BallSet() {
        balls = new ArrayList() ;
        size = 0 ;
        random = new Random() ;
    }
    
    /**
     * Add a ball to the set. The ball has a random colour and diameter.
     */
    public void addBall() {
        Color colour = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)) ;
        int diameter = random.nextInt(20) + 30 ;
        Ball ball = new Ball(diameter, colour) ;
        balls.add(ball) ;
        size++ ;
    }
    
    /**
     * Get the size of ball set.
     * @return the number of balls in the set.
     */
    public int getSize() {
        return size ;
    }
    
    /**
     * Get the i'th element of the set, if it's there.
     * 
     * @param index the element number
     * @return the Ball object or null 
     */
    public Ball getElem(int index) {
        Ball b ;
        try {
            return balls.get(index) ;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Missing ball at index " + index + "\n") ;
            return null ;
        }
    }

    /**
     * Remove a ball
     * 
     * @param ball the ball to be deleted
     */
    public void deleteElem(Ball b)  {
        if (balls.remove(b)) size-- ;
    }
}
