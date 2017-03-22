package up.edu.dimcalc;

import org.junit.Test;
import android.graphics.Point;

import static org.junit.Assert.*;


/**
 * Created by eepp on 3/18/17.
 */
public class TwoPointsTest {

/** when created, getPoint() should show both points at the origin */
    @Test
    public void testGetPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }

    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void testSetPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);
    }

    /*
    @Test
    public void getPoint() throws Exception {

    }

    @Test
    public void setPoint() throws Exception {

    }

    @Test
    public void randomValue() throws Exception {

    }

    @Test
    public void setOrigin() throws Exception {

    }

    @Test
    public void copy() throws Exception {

    }

    @Test
    public void distance() throws Exception {

    }

    @Test
    public void slope() throws Exception {

    }
    */

}