
package Controlador;

import java.util.ArrayList;

import Modelo.ModeloCuatro;

public class ControladorCuatro {

    private ModeloCuatro cuatro = new ModeloCuatro();

    public String validNameNumber(ArrayList<String> lista) {;

        String resultado = "";
        int contadorValidos = 0;
        int contadorInvalidos = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).matches("[a-zA-Z]*")){
                contadorValidos ++;
            }else{
                contadorInvalidos ++;
            }
        }

        resultado = "Resultado 1: \nNombres válidos: " + contadorValidos + "\nNombres inválidos: " + contadorInvalidos;
        cuatro.setUno(resultado);
        return cuatro.getUno();
    }

    public String deleteInvalidName(ArrayList<String> lista) {;

        String resultado = "";
        int contadorValidos = 0;
        int contadorInvalidos = 0;

        ArrayList <String> arrValidos = new ArrayList<String>();
        ArrayList <String> arrInvalidos = new ArrayList<String>();

        String validos = "";
        String invalidos = "";
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).matches("[a-zA-Z]*")){
                arrValidos.add(lista.get(i));
                contadorValidos ++;
            }else{
                arrInvalidos.add(lista.get(i));
                contadorInvalidos ++;
            }
        }

        for (int i = 0; i < arrValidos.size(); i++) {
            validos = validos + arrValidos.get(i) + "\n";
        }

        for (int i = 0; i < arrInvalidos.size(); i++) {
            invalidos = invalidos + arrInvalidos.get(i) + "\n";
        }

        resultado = "Resultado 2: \nNombres válidos: \n" + validos + "\nNombres inválidos: \n" + invalidos + "\nNombres totales validos: \n" + (contadorValidos);
        cuatro.setUno(resultado);
        return cuatro.getUno();
    }
    
}
