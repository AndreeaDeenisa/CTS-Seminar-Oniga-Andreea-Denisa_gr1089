package clase;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.List;

public interface CitireAplicanti {
	List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}
