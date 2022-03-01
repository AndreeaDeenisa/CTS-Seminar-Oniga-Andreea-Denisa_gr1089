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
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Student student =new Student();
			AplicantReader.citireAplicant(scanner, student);
			int an_studii = scanner.nextInt();
			String facultate = (scanner.next()).toString();
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}

}
