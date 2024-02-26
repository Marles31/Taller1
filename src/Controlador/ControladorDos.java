
package Controlador;

import Modelo.ModeloDos;

public class ControladorDos {

    private ModeloDos dos = new ModeloDos();
    
    public String compare(String a, String b){
        
        String operation = "";
        String resultado = "";

        if(a.equals(b)){
            operation = "Las cadenas son iguales";
        }
        else{
            operation = "Las cadenas son diferentes";
        }

        resultado = "Resultado 1: \nSon iguales? : " + operation;
        dos.setUno(resultado);
        return dos.getUno();
    }

    public String createC(String a, String b){
        String c = "";
        
        c = a.concat(b);

        return c;
    }

    public String newStringC(String a, String b){
        String c = "";
        String resultado = "";

        c = createC(a, b);

        resultado = "Resultado 2: \nNuevo string c: " + c;
        dos.setDos(resultado);
        return dos.getDos();
    }

    public String createD(String a, String b){
        String d = "";
        
        d = b.concat(a);

        return d;
    }

    public String newStringD(String a, String b){
        String d = "";
        String resultado = "";

        d = createD(a, b);

        resultado = "Resultado 3: \nNuevo string d: " + d;
        dos.setTres(resultado);
        return dos.getTres();
    }

    public String compareNewStrings(String a, String b){
        String c = "";
        String d = "";
        String operation = "";
        String resultado = "";

        c = createC(a, b);
        d = createD(a, b);

        if(c.equals(d)){
            operation = "Las cadenas son iguales";
        }
        else{
            operation = "Las cadenas son diferentes";
        }

        resultado = "Resultado 4: \nSon iguales c y d? : " + operation;
        dos.setCuatro(resultado);
        return dos.getCuatro();
    }

    public String numberOfStrings(String a, String b){

        String resultado ="";

        a=eliminarEspacios(a);
        b=eliminarEspacios(b);

        String c = createC(a, b);
        String d = createD(a, b);

        c=eliminarEspacios(c);
        d=eliminarEspacios(d);

        int stringA = a.length();
        int stringB = b.length();
        int stringC = c.length();
        int stringD = d.length();

        resultado = "Resultado 5: \nLongitud de string a: " + stringA + "\nLongitud de string b: " + stringB + "\nLongitud de string c: " + stringC + "\nLongitud de string d: " + stringD;
        dos.setCinco(resultado);
        return dos.getCinco();
    }

    public String eliminarEspacios(String cadena){

            return cadena.replaceAll("\\s+", "");

    }

    public String copyAString(String a, String b){

        String resultado = "";

        b = a.substring(0);

        resultado = "Resultado 6: \nCopia de string a en b: " + b;
        dos.setSeis(resultado);
        return dos.getSeis();
    }

    public String finalResult(String a, String b){

        String resultado = "";
        b=a.substring(0);

        resultado = "Resultado 7: \nContenido de string a: " + a+"\nContenido de string b: " + b;
        dos.setSiete(resultado);
        return dos.getSiete();
    }
    
    

}
