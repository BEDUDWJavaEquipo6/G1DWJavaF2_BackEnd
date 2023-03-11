package postwork5.postwork5.service;

import org.springframework.stereotype.Service;
import static java.util.Collections.replaceAll;

@Service
public class CompruebaService {

    public String Comprueba(String telefono){
        return telefono.replaceAll("[^0-9.]","");
    }
}
