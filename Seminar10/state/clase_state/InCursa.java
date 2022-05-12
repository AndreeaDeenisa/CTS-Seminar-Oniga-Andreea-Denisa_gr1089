package clase_state;

public class InCursa implements Stare{

	@Override
	public void actualizareStare(Autobuz autobuz) {
		if(autobuz.getStare() instanceof LaCapatDeLinie) {
			System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" a plecat in cursa");
			autobuz.setStare(this);
		}else {
			System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" NU poate pleca in cursa");
		}
		
	}

}
