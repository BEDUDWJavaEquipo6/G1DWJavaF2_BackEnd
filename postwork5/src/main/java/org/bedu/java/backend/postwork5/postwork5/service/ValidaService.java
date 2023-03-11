package postwork5.postwork5.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidaService {


    public boolean Valida(String telefono){

        Pattern pattern = Pattern.compile("^(\\d{3}[- ]?){2}\\d{4}$");
        Matcher matcher = pattern.matcher(telefono);
        return matcher.matches();
    }
}
