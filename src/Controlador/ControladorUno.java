
package Controlador;
import Modelo.ModeloUno;

public class ControladorUno {
    
    private ModeloUno uno = new ModeloUno();
    
    public String letterNumber(String cadena){
        
        String operation=cadena;
        int contador = 0;
        String resultado="";
        
        char[] arreglo =operation.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i]!=' ') {
                contador ++;
            }

        }

        resultado = "Resultado 1: \nNuméro de letras: " + contador;
        uno.setUno(resultado);
        return uno.getUno();
    }
    
    public String WordNumber(String cadena){

        String operation = cadena;
        int contador = 1;
        String resultado = "";
        
        char[] arreglo =operation.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            
            if (arreglo[i] == ' ') {
                contador++;
            }

        }

        resultado = "Resultado 2: \nNuméro de palabras: " + contador;
        uno.setDos(resultado);
        return uno.getDos();
    }
    
    public String aNumber(String cadena){

        String operation = cadena;
        int contador = 0;
        String resultado = "";
        
        char[] arreglo =operation.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            
            if (arreglo[i] == 'a' || arreglo[i] == 'A') {
                contador++;
            }

        }

        resultado = "Resultado 3: \nNuméro de letras a: " + contador;
        uno.setTres(resultado);
        return uno.getTres();
    }
    
    public String invertedText(String cadena){

        String resultado = "";

        StringBuilder stringBuilder = new StringBuilder(cadena);

		String invertida = stringBuilder.reverse().toString();

        resultado = "Resulatdo 4: \nTexto invertido: " + invertida;
        uno.setCuatro(resultado);
        return uno.getCuatro();
    }

    public String invertedWordText(String cadena){

        String resultado = "";

        String[] palabras = cadena.split("\\s+");

        StringBuilder operation = new StringBuilder();
        
        for (String palabra : palabras) {

            StringBuilder palabraInvertida = new StringBuilder(palabra);
            palabraInvertida.reverse();
            operation.append(palabraInvertida).append(" ");

        }

        resultado = "Resulatdo 5: \nTexto invertido palabra a palabra: " + operation;
        uno.setCinco(resultado);
        return uno.getCinco();
    }

}
    
    
    