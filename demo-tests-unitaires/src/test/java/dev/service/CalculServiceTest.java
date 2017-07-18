package dev.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class CalculServiceTest {

	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);

	@Test
	public void testAdditionner() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		CalculService calculService = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		int somme = calculService.additionner("1+3+4");
		LOG.info("Alors j'obtiens le résultat 8");
		assertTrue(somme == 8);
 	}
}