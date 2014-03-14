import static org.junit.Assert.*;

import org.junit.*;

import corona.acceptors.*;
import corona.filters.*;
import corona.test.helper.MainInvoker;
import java.util.ArrayList;
import CS232.Building;
import java.awt.Point;
import java.util.List;

/**
 * Collected student-generated tests for Skyline program, Phase III
 *
 * @author CS 232 Students, Spring 2014
 * @version 02/08/14
 */
public class PhaseIIISpring2014 {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tests that Skyline accounts for a single building
	 */
	@Test
	public void testCM2014SingleBuilding() {
		try {
			ArrayList<Building> actual_0 = new ArrayList<Building>();
			int actual_0_0_0 = 1;
			int actual_0_0_1 = 7;
			int actual_0_0_2 = 4;
			Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
			actual_0.add(actual_0_0);
			List<Point> actual = Skyline.makeSkyline(actual_0);

			ArrayList<Point> expected = new ArrayList<Point>();
			int expected_0_0 = 1;
			int expected_0_1 = 7;
			Point expected_0 = new Point(expected_0_0, expected_0_1);
			expected.add(expected_0);
			int expected_1_0 = 4;
			int expected_1_1 = 0;
			Point expected_1 = new Point(expected_1_0, expected_1_1);
			expected.add(expected_1);

			assertEquals(expected, actual);
		} catch (Exception ex) {
			Assert.fail();
		}
	}

	/**
	 * Tests that Skyline accounts for two buildings
	 */
	@Test
	public void testCM2014TwoBuildings() {
		try {
			ArrayList<Building> actual_0 = new ArrayList<Building>();
			int actual_0_0_0 = 1;
			int actual_0_0_1 = 5;
			int actual_0_0_2 = 2;
			Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
			actual_0.add(actual_0_0);
			int actual_0_1_0 = 4;
			int actual_0_1_1 = 8;
			int actual_0_1_2 = 5;
			Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
			actual_0.add(actual_0_1);
			int actual_0_2_0 = 6;
			int actual_0_2_1 = 3;
			int actual_0_2_2 = 8;
			Building actual_0_2 = new Building(actual_0_2_0, actual_0_2_1, actual_0_2_2);
			actual_0.add(actual_0_2);
			List<Point> actual = Skyline.makeSkyline(actual_0);

			ArrayList<Point> expected = new ArrayList<Point>();
			int expected_0_0 = 1;
			int expected_0_1 = 5;
			Point expected_0 = new Point(expected_0_0, expected_0_1);
			expected.add(expected_0);
			int expected_1_0 = 2;
			int expected_1_1 = 0;
			Point expected_1 = new Point(expected_1_0, expected_1_1);
			expected.add(expected_1);
			int expected_2_0 = 4;
			int expected_2_1 = 8;
			Point expected_2 = new Point(expected_2_0, expected_2_1);
			expected.add(expected_2);
			int expected_3_0 = 5;
			int expected_3_1 = 0;
			Point expected_3 = new Point(expected_3_0, expected_3_1);
			expected.add(expected_3);
			int expected_4_0 = 6;
			int expected_4_1 = 3;
			Point expected_4 = new Point(expected_4_0, expected_4_1);
			expected.add(expected_4);
			int expected_5_0 = 8;
			int expected_5_1 = 0;
			Point expected_5 = new Point(expected_5_0, expected_5_1);
			expected.add(expected_5);

			assertEquals(expected, actual);
		} catch (Exception ex) {
			Assert.fail();
		}
	}

	
	/**
	 * Tests that Skyline accounts for a list of three buildings, all of which aren't touching or overlapping.
	 */
	@Test
	public void testCM2014ThreeBuildings() {
		try {
			ArrayList<Building> actual_0 = new ArrayList<Building>();
			int actual_0_0_0 = 1;
			int actual_0_0_1 = 3;
			int actual_0_0_2 = 2;
			Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
			actual_0.add(actual_0_0);
			int actual_0_1_0 = 3;
			int actual_0_1_1 = 5;
			int actual_0_1_2 = 6;
			Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
			actual_0.add(actual_0_1);
			int actual_0_2_0 = 7;
			int actual_0_2_1 = 2;
			int actual_0_2_2 = 8;
			Building actual_0_2 = new Building(actual_0_2_0, actual_0_2_1, actual_0_2_2);
			actual_0.add(actual_0_2);
			List<Point> actual = Skyline.makeSkyline(actual_0);

			ArrayList<Point> expected = new ArrayList<Point>();
			int expected_0_0 = 1;
			int expected_0_1 = 3;
			Point expected_0 = new Point(expected_0_0, expected_0_1);
			expected.add(expected_0);
			int expected_1_0 = 2;
			int expected_1_1 = 0;
			Point expected_1 = new Point(expected_1_0, expected_1_1);
			expected.add(expected_1);
			int expected_2_0 = 3;
			int expected_2_1 = 5;
			Point expected_2 = new Point(expected_2_0, expected_2_1);
			expected.add(expected_2);
			int expected_3_0 = 6;
			int expected_3_1 = 0;
			Point expected_3 = new Point(expected_3_0, expected_3_1);
			expected.add(expected_3);
			int expected_4_0 = 7;
			int expected_4_1 = 2;
			Point expected_4 = new Point(expected_4_0, expected_4_1);
			expected.add(expected_4);
			int expected_5_0 = 8;
			int expected_5_1 = 0;
			Point expected_5 = new Point(expected_5_0, expected_5_1);
			expected.add(expected_5);

			assertEquals(expected, actual);
		} catch (Exception ex) {
			Assert.fail();
		}
	}
	   /**
     * This test has one building.
     */
    @Test
    public void testKT2014OneBuilding() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 4;
            int actual_0_0_2 = 3;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 4;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 3;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * This is a test (with Hopeful.jar added to the pathway) testing two building. 
     *  Each building stands alone and not touch, or behind the other. 
     */
    @Test
    public void testKT2014TwoSeperateBuildings() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 4;
            int actual_0_0_2 = 3;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 7;
            int actual_0_1_1 = 1;
            int actual_0_1_2 = 8;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 4;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 3;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 7;
            int expected_2_1 = 1;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 8;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * This is a test (with Hopeful.jar added to the pathway) testing no buildings.      
     */
    @Test
    public void testKT2014NoBuilding() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }
    /**
     * This is a test (with Hopeful.jar added to the pathway) testing two 
     * separate buildings.  The first building will have a higher height 
     * than the second building will.
     */
    @Test
    public void testKT2014TwoSeperateBuildingsFirstHigherThanSecond() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 4;
            int actual_0_0_2 = 9;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 11;
            int actual_0_1_1 = 2;
            int actual_0_1_2 = 13;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 4;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 9;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 11;
            int expected_2_1 = 2;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 13;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }
    /**
     * This is a test (with Hopeful.jar added to the pathway) testing two separate 
     * buildings.  The first building will have a smaller height than the 
     * second building will.
     */
    @Test
    public void testKT2014TwoSeperateBuildingsFirstSmallerThanSecond() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 1;
            int actual_0_0_2 = 2;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 3;
            int actual_0_1_1 = 3;
            int actual_0_1_2 = 6;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 1;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 2;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 3;
            int expected_2_1 = 3;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 6;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * 
     */
    @Test
    public void testBJ2014onebuilding() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 2;
            int actual_0_0_1 = 4;
            int actual_0_0_2 = 3;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 2;
            int expected_0_1 = 4;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 3;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * 
     */
    @Test
    public void testBJ2014ally() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 2;
            int actual_0_0_2 = 2;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 3;
            int actual_0_1_1 = 2;
            int actual_0_1_2 = 4;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 2;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 2;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 3;
            int expected_2_1 = 2;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 4;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * 
     */
    @Test
    public void testNR2014startat0() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 2;
            int actual_0_0_2 = 5;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 7;
            int actual_0_1_1 = 10;
            int actual_0_1_2 = 9;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 2;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 5;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 7;
            int expected_2_1 = 10;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 9;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * 
     */
    @Test
    public void testNR2014OneBuliding() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 3;
            int actual_0_0_1 = 5;
            int actual_0_0_2 = 8;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 3;
            int expected_0_1 = 5;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 8;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * 
     */
    @Test
    public void testNR2014TwoBuildings() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 2;
            int actual_0_0_1 = 5;
            int actual_0_0_2 = 7;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 9;
            int actual_0_1_1 = 8;
            int actual_0_1_2 = 14;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 2;
            int expected_0_1 = 5;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 7;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 9;
            int expected_2_1 = 8;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 14;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }
    
    /**
     * Tests for a single building being input
     */
    @Test
    public void testAS2014OneBuilding() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 2;
            int actual_0_0_1 = 5;
            int actual_0_0_2 = 5;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 2;
            int expected_0_1 = 5;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 5;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * Tests for no buildings being input
     */
    @Test
    public void testAS2014ZeroBuildings() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * Tests for two buildings with a "gap" between them
     */
    @Test
    public void testAS2014TwoBuildingsDisjoint() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 3;
            int actual_0_0_1 = 5;
            int actual_0_0_2 = 8;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 10;
            int actual_0_1_1 = 10;
            int actual_0_1_2 = 12;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 3;
            int expected_0_1 = 5;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 8;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 10;
            int expected_2_1 = 10;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 12;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * Tests for three buildings with a "gap" between each
     */
    @Test
    public void testAS2014ThreeBuildingsDisjoint() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 2;
            int actual_0_0_2 = 5;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 8;
            int actual_0_1_1 = 2;
            int actual_0_1_2 = 10;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            int actual_0_2_0 = 11;
            int actual_0_2_1 = 2;
            int actual_0_2_2 = 17;
            Building actual_0_2 = new Building(actual_0_2_0, actual_0_2_1, actual_0_2_2);
            actual_0.add(actual_0_2);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 2;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 5;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 8;
            int expected_2_1 = 2;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 10;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);
            int expected_4_0 = 11;
            int expected_4_1 = 2;
            Point expected_4 = new Point(expected_4_0, expected_4_1);
            expected.add(expected_4);
            int expected_5_0 = 17;
            int expected_5_1 = 0;
            Point expected_5 = new Point(expected_5_0, expected_5_1);
            expected.add(expected_5);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }
    /**
     * Tests for two buildings which are input with the building further to the right of the skyline first
     */
    @Test
    public void testAS2014TwoBuildingsDescendingOrder() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 7;
            int actual_0_0_1 = 1;
            int actual_0_0_2 = 15;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 3;
            int actual_0_1_1 = 5;
            int actual_0_1_2 = 6;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 3;
            int expected_0_1 = 5;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 6;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 7;
            int expected_2_1 = 1;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 15;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    /**
     * Tests a skyline of a single building
     */
    @Test
    public void testCVL2014Onebuilding() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 2;
            int actual_0_0_2 = 3;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 2;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 3;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }


    /**
     * This tests two non overlapping buildings
     */
    @Test
    public void test9CVL2014() {
        try {
            ArrayList<Building> actual_0 = new ArrayList<Building>();
            int actual_0_0_0 = 1;
            int actual_0_0_1 = 2;
            int actual_0_0_2 = 3;
            Building actual_0_0 = new Building(actual_0_0_0, actual_0_0_1, actual_0_0_2);
            actual_0.add(actual_0_0);
            int actual_0_1_0 = 4;
            int actual_0_1_1 = 2;
            int actual_0_1_2 = 5;
            Building actual_0_1 = new Building(actual_0_1_0, actual_0_1_1, actual_0_1_2);
            actual_0.add(actual_0_1);
            List<Point> actual = Skyline.makeSkyline(actual_0);

            ArrayList<Point> expected = new ArrayList<Point>();
            int expected_0_0 = 1;
            int expected_0_1 = 2;
            Point expected_0 = new Point(expected_0_0, expected_0_1);
            expected.add(expected_0);
            int expected_1_0 = 3;
            int expected_1_1 = 0;
            Point expected_1 = new Point(expected_1_0, expected_1_1);
            expected.add(expected_1);
            int expected_2_0 = 4;
            int expected_2_1 = 2;
            Point expected_2 = new Point(expected_2_0, expected_2_1);
            expected.add(expected_2);
            int expected_3_0 = 5;
            int expected_3_1 = 0;
            Point expected_3 = new Point(expected_3_0, expected_3_1);
            expected.add(expected_3);

            assertEquals(expected, actual);
        } catch (Exception ex) {
            Assert.fail();
        }
    }


}
