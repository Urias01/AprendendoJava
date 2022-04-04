package application;



import java.util.Locale;

import java.util.Scanner;

import entities.CurrencyConverter;



public class Exercise04 {

    public static void main(String[] args) {

       

       Locale.setDefault(Locale.US);

       Scanner sc = new Scanner (System.in);

       System.out.print("Qual é o valor do dolar ? ");

       double dolar = sc.nextDouble();

       System.out.print("Quantidade de dolar a ser comprado: ");

       double quantidade = sc.nextDouble();

       double valorConvertido = CurrencyConverter.conversor(dolar, quantidade);

       System.out.printf("O valor que deverá ser pago é de: %.2f%n ", valorConvertido);

       sc.close();
               

    }

   

}