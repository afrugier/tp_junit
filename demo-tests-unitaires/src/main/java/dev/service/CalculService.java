package dev.service;

import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

public class CalculService {
	private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);

	public int additionner(String expression) {
		LOG.debug("Evaluation de l'expression {}", expression);
		int calcul = 0;
		try {
			calcul = Stream.of(expression.split("\\+")).mapToInt(Integer::parseInt).sum();
		} catch (RuntimeException e) {
			throw new CalculException();
		}
		return calcul;
	}
}
