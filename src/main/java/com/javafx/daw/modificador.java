package com.javafx.daw;

public class modificador {

    public char cambionum(int num){

        int codigoASCII = num;

        char character = (char) codigoASCII;

        System.out.println("El numero introducido es: "+num);
        System.out.println("EL caracter correspondiente es: "+character);
        return character;
    }


}
