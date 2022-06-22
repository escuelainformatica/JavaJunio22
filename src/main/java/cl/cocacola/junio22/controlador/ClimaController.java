package cl.cocacola.junio22.controlador;

import cl.cocacola.junio22.modelos.Clima;
import cl.cocacola.junio22.servicio.ClimaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clima")
public class ClimaController {
    // campos
    @Autowired
    private ClimaServicio cservicio;

    // metodos
    @PostMapping("/f") // http://localhost:8080/clima/f
    public Clima convertirF(@RequestBody Clima clima) {
        return cservicio.convertirF(clima);
    }
}
