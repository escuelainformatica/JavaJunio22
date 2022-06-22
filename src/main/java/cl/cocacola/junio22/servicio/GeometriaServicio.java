package cl.cocacola.junio22.servicio;

import cl.cocacola.junio22.modelos.Region;
import org.springframework.stereotype.Service;

@Service
public class GeometriaServicio {

    public int calculoArea(Region region) {
        int resultado=0;
        resultado=region.getAncho()*region.getAlto();
        return resultado;
    }
    public Region convertir(Region region,String unidad) {
        if(unidad.equals("pies")) {
            region.setAlto(region.getAlto() * 3);
            region.setAncho(region.getAncho() * 3);
        }
        if(unidad.equals("centimetro")) {
            region.setAlto(region.getAlto() * 100);
            region.setAncho(region.getAncho() * 100);
        }
        if(unidad.equals("pulgada")) {
            region.setAlto(region.getAlto() * 40);
            region.setAncho(region.getAncho() * 40);
        }


        return region;
    }
}
