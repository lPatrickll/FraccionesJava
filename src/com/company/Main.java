package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fraccion a = new Fraccion(1,2);
        Fraccion b = new Fraccion(3,4);

        Fraccion resuls =a.sumar(b);
        resuls.mostrar();
    }
}
