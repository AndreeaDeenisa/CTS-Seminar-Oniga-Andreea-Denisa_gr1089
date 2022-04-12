package clase_proxy;

public class AutobuzDeNoapte implements MijlocTransport{
	private Autobuz autobuz;
	
	public AutobuzDeNoapte(Autobuz autobuz) {
		super();
		this.autobuz = autobuz;
	}

	@Override
	public void opresteInStatie() {
		if(autobuz.getNrCalatori()>0) {
			autobuz.opresteInStatie();
		}
		else System.out.println("Autobuzul nu opreste in statie");
		
	}

}
