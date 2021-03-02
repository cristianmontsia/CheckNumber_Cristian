package com.alumne.checknumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCheckNumber {

	@Test
	void Test() {
		
	}
	
	@Test
	void testNegatiu() {

		double resultat_esperat, resultat_actual;
	
			CheckNumber negatiu;
			negatiu = new CheckNumber(-4);

			resultat_esperat = -1;
			resultat_actual = negatiu.comprovaSigne();

			assertEquals(resultat_esperat, resultat_actual, "Error!");
	}
	
	@Test
	void testZero() {

		double resultat_esperat, resultat_actual;
	
			CheckNumber zero;
			zero = new CheckNumber(0);

			resultat_esperat = 0;
			resultat_actual = zero.comprovaSigne();

			assertEquals(resultat_esperat, resultat_actual, "Error!");
		
	}
	
	@Test
	void testpositiu() {

		double resultat_esperat, resultat_actual;
	
			CheckNumber positiu;
			positiu = new CheckNumber(5);

			resultat_esperat = 1;
			resultat_actual = positiu.comprovaSigne();

			assertEquals(resultat_esperat, resultat_actual, "Error!");
		
	}
}
