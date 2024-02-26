
package Controlador;

import Modelo.ModeloTres;

public class ControladorTres {

    private ModeloTres tres = new ModeloTres();

    public String letterNumber(String cadena) {

        String operation=cadena;
        int contador = 0;
        String resultado="";
        
        char[] arreglo =operation.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {

            if(Character.isLetter(arreglo[i])){
                contador ++;
            }

        }

        resultado = "Resultado 1: \nNuméro de letras: " + contador;
        tres.setUno(resultado);
        return tres.getUno();

    }

    public String digitNumber(String cadena) {
        

        String operation=cadena;
        int contador = 0;
        String resultado="";

        char[] arreglo =operation.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            
            if(Character.isDigit(arreglo[i])){
                contador ++;
            }

        }

        resultado = "Resultado 2: \nNuméro de digitos: " + contador;
        tres.setDos(resultado);
        return tres.getDos();

    }

    public String spacesNumber(String cadena) {

        String operation=cadena;
        int contador = 0;
        String resultado="";

        char[] arreglo =operation.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            
            if(Character.isWhitespace(arreglo[i])){
                contador ++;
            }

        }

        resultado = "Resultado 3: \nNuméro de espacios: " + contador;
        tres.setTres(resultado);
        return tres.getTres();

    }
    
}
