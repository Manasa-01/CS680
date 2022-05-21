package edu.umb.cs680.hw10;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.umb.cs680.hw10.Distance;
import edu.umb.cs680.hw10.Euclidean;
import edu.umb.cs680.hw10.Manhattan;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DistanceTest {
	private static List<Double> p1, p2, p3, p4, p5;
	private static List<List<Double>> points = new LinkedList<>();
	

    @Test
    public void checkGetwitheuclidean() {
    	p1 = Arrays.asList(5.0, 6.0, 7.0);
		p2 = Arrays.asList(2.0, 3.0, 4.0);
		
		points.add(p1);
		points.add(p2);

        double actual = Distance.get(p1, p2, new Euclidean());
        double expected = Math.sqrt(27.0);

        assertEquals(expected, actual);

    }

    @Test
    public void checkGetWithManhattan() {
    	p1 = Arrays.asList(5.0, 3.0, 7.0);
		p2 = Arrays.asList(2.0, 6.0, 4.0);
		
		points.add(p1);
		points.add(p2);

        double actual = Distance.get(p1, p2, new Manhattan());
        double expected = 9.0;

        assertEquals(expected, actual);

    }

    @Test
	public void defaultMatrixWithPointsList() {
    	p1 = Arrays.asList(5.0, 6.0, 7.0);
		p2 = Arrays.asList(2.0, 3.0, 4.0);
		p3 = Arrays.asList(4.0, 6.0, 9.0);
		p4 = Arrays.asList(5.0, 2.0, 3.0);
		p5 = Arrays.asList(5.0, 6.0, 5.0);
		
		
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);

		Double[][] expected = { { 0.0, Math.sqrt(27.0), Math.sqrt(10.0), Math.sqrt(32.0), Math.sqrt(4.0) },
				{ Math.sqrt(27.0), 0.0, Math.sqrt(13.0), Math.sqrt(11.0), Math.sqrt(19.0) },
				{ Math.sqrt(10.0), Math.sqrt(13.0), 0.0, Math.sqrt(18.0),  Math.sqrt(2.0)},
				{ Math.sqrt(32.0), Math.sqrt(11.0), Math.sqrt(18.0), 0.0, Math.sqrt(20.0) },
				{ Math.sqrt(4.0),  Math.sqrt(19.0),  Math.sqrt(2.0), Math.sqrt(20.0), 0.0 } };
		List<List<Double>> actual = Distance.matrix(points);
			assertEquals(expected, actual);
		}
    
    @Test
	public void checkmatrixpointlistofManhattan() {
    	p1 = Arrays.asList(5.0, 6.0, 7.0);
		p2 = Arrays.asList(2.0, 3.0, 4.0);
		p3 = Arrays.asList(4.0, 6.0, 9.0);
		p4 = Arrays.asList(5.0, 2.0, 3.0);
		p5 = Arrays.asList(5.0, 6.0, 5.0);
		
		
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);
		Double[][] expected = { { 0.0, 9.0, 5.0, 8.0, 2.0 },{ 9.0, 0.0, 5.0, 5.0, 7.0 },{ 4.0, 5.0, 0.0, 6.0, 2.0 },{ 8.0, 5.0, 6.0, 0.0, 6.0 },
								{ 2.0, 7.0, 2.0, 6.0, 0.0 } };
		List<List<Double>> actual = Distance.matrix(points, new Manhattan());
		assertEquals(expected, actual);
		}
	}


