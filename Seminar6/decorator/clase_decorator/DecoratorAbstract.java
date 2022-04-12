package clase_decorator;

public abstract class DecoratorAbstract implements Printer{
	Printer printer;
	
	public DecoratorAbstract(Printer printer) {
		this.printer=printer;
	}

	public abstract void mesajSpecial();
	
	@Override
	public void afiseazaMesaj() {
		printer.afiseazaMesaj();
		
	}
	
	

}
