package cl.cocacola.junio22.controlador;

import cl.cocacola.junio22.modelos.Region;
import cl.cocacola.junio22.servicio.GeometriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/geometria")
public class GeometriaControlador {

    @Autowired // inyeccion, es decir Spring boot se preocupa de crear la variable.
    private GeometriaServicio geometriaServicio;

    @PostMapping("/calculoArea") // http://localhost:8080/geometria/calculoArea [post]
    public int calculoArea(@RequestBody Region region) {
        return geometriaServicio.calculoArea(region);
    }

    @PostMapping("/convertir") // http://localhost:8080/geometria/convertir?unidad=*** [post]
    public Region convertir(@RequestBody Region region,String unidad) {
        return geometriaServicio.convertir(region,unidad);
    }

    @PostMapping("/convertirv2/{unidad}") // http://localhost:8080/geometria/convertir/*** [post]
    public Region convertirv2(@RequestBody Region region,@PathVariable String unidad) {
        return geometriaServicio.convertir(region,unidad);
    }

}
