/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasimples.VALIDATION;

/**
 *
 * @author bruno.costa2
 */
public class Calculos {
    
     public double resultado;
     
     public String somar(double numero1, double numero2){
            this.resultado = numero1 + numero2;
            return String.valueOf(resultado);
     }
     
     public String subtrair(double numero1, double numero2){
            this.resultado = numero1 - numero2;
            return String.valueOf(resultado);
     }
     
     public String multiplicar(double numero1, double numero2){
            this.resultado = numero1 * numero2;
            return String.valueOf(resultado);
     }
     
     public String dividir(double numero1, double numero2){
            this.resultado = numero1 / numero2;
            return String.valueOf(resultado);
     }
     
     
    
    
    
}
