package dev.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

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
		assertThat(somme).isEqualTo(8);

 	}

	@Test(expected = CalculException.class)
	public void testException() throws CalculException {
		CalculService cal = new CalculService();
		int somme = cal.additionner("aaaa++++");
	}
}
