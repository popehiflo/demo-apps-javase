package pe.popehiflo.javabuildingsblocks;

public class VariablesDeInstancia {

    // Variables de Instancia
    /* variables que esta ndentro de una clases, estas si tienes valor por defecto
    */

    boolean active;     //false
    byte myByte;        //0
    short myShort;      //0
    int myInt;          //0
    long myLong;        //0

    float promedio;     //0.0f;
    double sueldo;      //0.0

    char caracter;      // '\u0000'  -> (NUL)

    String cadena;      //null

    //No puedo usar var como variable de instancia
    //var tricky = "Hello";

    public void WhatTypeAmI() {
        // Si puedo usar var como variable de local
        var tricky = "hello";
        var size = 7;
    }

    public void reassignment() {
        var number = 7;
        number = 4;
        //number = "five";
    }
}
