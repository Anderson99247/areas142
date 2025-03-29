// 1- Bibliotecas / Imports

// 1.5 pacotes
package com.exerciciolista06;

// 2 -  classe
public class Main {
    // 2.1 Atributos

    //  2.2 Métodos e funções
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");      

    }

    public static float calcularAreaQuadrado(float lado){ 
        float resultado = lado * lado;
        System.out.println("Area do quadrado" + resultado); //imprime os resultados no Debug Console.     
        return resultado;
    }

    public static float calcularAreaRetangulo(float base, float altura){
        float resultado = base * altura;
        System.out.println("Area do retangulo" + resultado);  //imprime os resultados no Debug Console.
        return resultado;
    }

    public static float calcularAreacirculo(float raio){
        float resultado = (float)(Math.PI * Math.pow(raio, 2));
        System.out.println("Area do Ciculo" + resultado);  //imprime os resultados no Debug Console.
        return resultado;        
    }

    public static float calcularAreatriangulo(float base, float altura){
        float resultado = (base * altura) / 2;
        System.out.println("Area do triangulo" + resultado);  //imprime os resultados no Debug Console.
        return resultado;
    }



}