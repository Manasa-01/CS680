package edu.umb.cs680.hw10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw10.Euclidean;

public class EuclideanTest {
	
	private static List<Double> p1, p2;
	private static List<List<Double>> points = new LinkedList<>();
	

    @Test
    public void checkeuclideandistancep1p2() {
    	p1 = Arrays.asList(5.0, 6.0, 7.0);
		p2 = Arrays.asList(2.0, 3.0, 4.0);
		
		points.add(p1);
		points.add(p2);

        double actual = Distance.get(p1, p2, new Euclidean());
        double expected = Math.sqrt(27.0);

        assertEquals(expected, actual);}

    }
