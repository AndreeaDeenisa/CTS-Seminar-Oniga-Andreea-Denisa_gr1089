package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitireElevi implements CitireAplicanti{

	@Override
	public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(numeFisier));
		scanner.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Elev elev = new Elev();
			AplicantReader.citireAplicant(scanner, elev);
			int clasa = scanner.nextInt();
			String tutore = scanner.next();
			elev.setTutore(tutore);
			elev.setClasa(clasa);
			elevi.add(elev);
		}

		scanner.close();
		return elevi;
	}

}
