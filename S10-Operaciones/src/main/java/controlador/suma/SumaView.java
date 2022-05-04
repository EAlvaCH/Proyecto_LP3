
package controlador.suma;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped

public class SumaView {
    
    private int numero1;
    private int numero2;
    private int suma;
    private String nota;
    
    public SumaView() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public int suma(){
        suma = numero1 + numero2;
        return suma;
    }
    
    public void operacion(){
        nota = "La suma es: "+suma();
    }
    
}
