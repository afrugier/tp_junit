package dev.console;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;
import dev.service.CalculService;

public class App {
	private Scanner scanner;
	private CalculService calculatrice;
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public App(Scanner scanner, CalculService calculatrice) {
		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}

	protected void afficherTitre() {
		LOG.info("**** Application Calculatrice ****");
	}

	public void demarrer() {
		afficherTitre();
	}

	protected void evaluer(String expression) {
		try {
			int somme = calculatrice.additionner(expression);
			LOG.info("{}={}", expression, somme);
		} catch (RuntimeException e) {
			LOG.debug("L'expression {} est invalide", expression);
			throw new CalculException();
		}

	}
}
