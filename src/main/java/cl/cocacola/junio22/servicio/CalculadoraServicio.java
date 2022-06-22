package cl.cocacola.junio22.servicio;

import cl.cocacola.junio22.modelos.Valores;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServicio {
    public int sumar(Valores arg) {
        int resultado=0;
        resultado=arg.getNum1()+arg.getNum2();
        return resultado;
    }
    public int restar(Valores arg) {
        int resultado=0;
        resultado=arg.getNum1()-arg.getNum2();
        return resultado;
    }
    public int multiplicar(Valores arg) {
        int resultado=0;
        resultado=arg.getNum1()*arg.getNum2();
        return resultado;
    }
    public int dividir(Valores arg) {
        int resultado=0;
        resultado=arg.getNum1()/arg.getNum2();
        return resultado;
    }

}
