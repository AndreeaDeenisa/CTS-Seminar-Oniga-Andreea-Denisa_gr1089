package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitireStudenti implements CitireAplicanti {

	@Override
	public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(numeFisier));
		scanner.useDelimiter(",");
		List<Aplicant> studenti = citireAplicantiDinScanner(scanner);
		
		scanner.close();
		return studenti;
	}

	
	private List<Aplicant> citireAplicantiDinScanner(Scanner scanner) {
		List<Aplicant> studenti = new ArrayList<Aplicant>();
		
		while (scanner.hasNext()) {
			Student student =new Student();
			AplicantReader.citireAplicant(scanner, student);
			Integer anStudii = scanner.nextInt();
			String facultate = scanner.next();
			student.setAnStudii(anStudii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		return studenti;
	}
}
