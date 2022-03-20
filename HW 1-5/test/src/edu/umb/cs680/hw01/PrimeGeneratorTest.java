package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	 public void getprimes() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(10, 30);
	       primeGenerator.generatePrimes();
	       Long[] expectedprimes = {11L, 13L, 17L, 19L, 23L, 29L };
	       assertArrayEquals(expectedprimes, primeGenerator.getPrimes().toArray());
	 }


	 @Test
	 public void NoOfPrimesFound() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(1,100 );
	       primeGenerator.generatePrimes();
	       assertEquals(primeGenerator.getPrimes().size(), 25);
	 }

	 
	 @Test
	 public void NoOfOddPrimesFound() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(10,20 );
	       primeGenerator.generatePrimes();
	       assertNotEquals(primeGenerator.getPrimes().size(), 0);
	 }

	    @Test
	    public void NegativeInvalidInputRange() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(-10, -11);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=-10 to=-11", ex.getMessage());
	        }
	    }


}
