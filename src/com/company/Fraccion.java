package com.company;

public class Fraccion {
    int numerador;
    int denominador;
    public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public Fraccion sumar(Fraccion a){
        int cost1 = (a.numerador *this.denominador)+(a.denominador*this.numerador);
        int cost2 = this.denominador * a.denominador;

        Fraccion f = new Fraccion(cost1,cost2);
        return f;
    }

    public void mostrar(){
        System.out.print(numerador+"/"+denominador);
    }
}
