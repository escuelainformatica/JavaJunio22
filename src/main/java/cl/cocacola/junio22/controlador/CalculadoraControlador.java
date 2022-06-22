package cl.cocacola.junio22.controlador;

import cl.cocacola.junio22.modelos.Valores;
import cl.cocacola.junio22.servicio.CalculadoraServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// CalculadoraController cal=new CalculadoraContoller();

@RestController
@RequestMapping("/calculator")
public class CalculadoraControlador {

    @Autowired
    private CalculadoraServicio srv;

    @PostMapping("/add") // http://localhost:8080/calculator/add [post]
    public int sumar(@RequestBody Valores arg) {
        // funcion envoltorio: es una funcion que solo llama a otra funcion.
        return srv.sumar(arg);
    }

    @PostMapping("/rest") // http://localhost:8080/calculator/rest [post]
    public int restar(@RequestBody Valores arg) {
        return srv.restar(arg);
    }
    @PostMapping("/multiply") // http://localhost:8080/calculator/multiply [post]
    public int multiplicar(@RequestBody Valores arg) {
        return srv.multiplicar(arg);
    }
    @PostMapping("/divide") // http://localhost:8080/calculator/divide [post]
    public int dividir(@RequestBody Valores arg) {
        return srv.dividir(arg);
    }
}
