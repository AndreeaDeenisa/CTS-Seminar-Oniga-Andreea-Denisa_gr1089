package clase_decorator;

public class DecoratorConcret extends DecoratorAbstract{
	
	private String mesaj;
	
	public DecoratorConcret(Printer printer, String mesaj) {
		super(printer);
		this.mesaj = mesaj;
	}
	
	public void mesajSpecial() {
		System.out.println(mesaj);
	}

}
