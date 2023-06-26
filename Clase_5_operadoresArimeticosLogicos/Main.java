package Clase_5_operadoresArimeticosLogicos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Codigo para pedir entrada de datos de usuario:
        Scanner variable = new Scanner(System.in);
        int i = variable.nextInt();
         */
       /* System.out.println("Que edad tienes?");
        Scanner datosDeUsuario = new Scanner(System.in);
        Integer edad = datosDeUsuario.nextInt();

        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }*/

        /* Ejercicio Calculadora IMC(Indice de masa corporal):
        IMC = peso(Kg) / [estatura(m]**2
        Bajo <18.5
        Normal 18.5-24.9
        Sobrepeso 25-29.9
        Obeso >30
         */
        Scanner  datosDeUsuario = new Scanner(System.in);
        System.out.println("Escriba su peso en kilogramos:");
        double peso = datosDeUsuario.nextDouble();
        System.out.println("Escriba su estatuta en metros:");
        double estatura = datosDeUsuario.nextDouble();
        double IMC = peso / (estatura * estatura);

        if (IMC < 18.5){
            System.out.println("Estas bajo peso");
        }if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Tienes un peso normal");
        }if (IMC >= 25 && IMC <= 29.9 ){
            System.out.println("Estas en sobrepeso");
        }if (IMC >= 30){
            System.out.println("Estas obeso");
        }
    }
}
