
package Modelo;

public class ModeloUno {
    
    String uno;
    String dos;
    String tres;
    String cuatro;
    String cinco;
    
    public  ModeloUno(){
    }
    
    public ModeloUno(String resultadoUno, String resultadoDos, String resultadoTres, String resultadoCuatro, String resultadoCinco ){
        this.uno = resultadoUno;
        this.dos = resultadoDos;
        this.tres = resultadoTres;
        this.cuatro = resultadoCuatro;
        this.cinco = resultadoCinco;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public String getTres() {
        return tres;
    }

    public void setTres(String tres) {
        this.tres = tres;
    }

    public String getCuatro() {
        return cuatro;
    }

    public void setCuatro(String cuatro) {
        this.cuatro = cuatro;
    }

    public String getCinco() {
        return cinco;
    }

    public void setCinco(String cinco) {
        this.cinco = cinco;
    }
    
    
}
