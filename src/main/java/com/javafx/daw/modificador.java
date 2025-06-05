package com.javafx.daw;

public class modificador {

    public char cambionum(int num){

        int codigoASCII = num;

        char character = (char) codigoASCII;

        System.out.println("El numero introducido es: "+num);
        System.out.println("EL caracter correspondiente es: "+character);
        return character;
    }

    public int cambioletra(char character){

        char codigoASCII = character;

        int num = codigoASCII;

        System.out.println("EL caracter correspondiente es: "+character);
        System.out.println("El numero introducido es: "+num);
        
        return num;
    }

}
