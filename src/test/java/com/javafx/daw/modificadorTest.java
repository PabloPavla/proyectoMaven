package com.javafx.daw;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class modificadorTest {

    @org.junit.jupiter.api.Test
    void cambionum() {
        int i = 97;
        modificador mod = new modificador();
        char expResult = 'a';
        char result = mod.cambionum(i);
        Assertions.assertEquals(expResult,result);

    }

    @org.junit.jupiter.api.Test
    void cambioletra() {
        char a = 'a';
        modificador mod = new modificador();
        int expResult = 97;
        int result = mod.cambioletra(a);
        Assertions.assertEquals(expResult,result);

    }
}