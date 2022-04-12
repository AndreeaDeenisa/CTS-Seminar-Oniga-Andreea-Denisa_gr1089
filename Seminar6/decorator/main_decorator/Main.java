package main_decorator;

import clase_decorator.DecoratorAbstract;
import clase_decorator.DecoratorConcret;
import clase_decorator.Printer;
import clase_decorator.PrinterBilet;

public class Main {

	public static void main(String[] args) {
		Printer bilPrinter = new PrinterBilet();
		bilPrinter.afiseazaMesaj();
		
		DecoratorAbstract decoratorAbstract = new DecoratorConcret(bilPrinter, "La multi ani");
		decoratorAbstract.afiseazaMesaj();
		decoratorAbstract.mesajSpecial();
	}

}
