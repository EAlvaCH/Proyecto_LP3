
package controlador.operaciones;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped

public class OperacionesView {
    
    private float numero1;
    private float numero2;
    private String operacion;
    private float resultado;
    private String resultadoT;

    public OperacionesView() {
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getResultadoT() {
        return resultadoT;
    }

    public void setResultadoT(String resultadoT) {
        this.resultadoT = resultadoT;
    }
    
    public void obtener(){
        switch (operacion) {
            case "1":
                resultado= numero1+numero2;
                resultadoT="La suma es:  ";
                break;
            case "2":
                resultado= numero1-numero2;
                resultadoT="La resta es:  ";
                break;
            case "3":
                resultado =numero1*numero2;
                resultadoT="La multiplicacion es:  ";
                break;       
            case "4":
                resultado= numero1/numero2;
                resultadoT="La division es:  ";
                break;
            default:
                break;
        }
    }
     
}
