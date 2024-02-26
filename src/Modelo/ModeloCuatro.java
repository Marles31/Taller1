
package Modelo;

public class ModeloCuatro {
    
    String uno;
    String dos;
    String tres;

    public ModeloCuatro() {
    }

    public ModeloCuatro(String resultadoUno, String resultadoDos, String resultadoTres) {
        this.uno = resultadoUno;
        this.dos = resultadoDos;
        this.tres = resultadoTres;
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

}
