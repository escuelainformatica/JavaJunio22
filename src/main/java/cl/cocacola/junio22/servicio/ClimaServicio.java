package cl.cocacola.junio22.servicio;

import cl.cocacola.junio22.modelos.Clima;
import org.springframework.stereotype.Service;

@Service
public class ClimaServicio {

    public Clima convertirF(Clima clima) {
        clima.setTemp( (clima.getTemp()*9/5)+32 );
        return clima;
    }

}
