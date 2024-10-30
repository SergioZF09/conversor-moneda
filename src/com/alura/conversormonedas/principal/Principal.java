package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.calculos.CalculaMonedas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        CalculaMonedas mostrar = new CalculaMonedas();

        int opcion = 0;

        String menuOpciones = """
                           ****************************************************
                           ¡Bienvenido/a al Conversor de Monedas!
                              
                           En este programa puedes elegir diferentes tipos de
                           monedas para realizar conversiones.
                              
                           Elige una opción para convertir el monto interesado:
                           
                           1. Dólar a Peso Argentino
                           2. Peso Argentino a Dólar
                           3. Dólar a Real Brasilenio
                           4. Real Brasilenio a Dólar
                           5. Dólar a Peso Colombiano
                           6. Peso Colombiano a Dólar
                           7. Salir
                           ****************************************************
                           
                           """;

        while (opcion != 7) {

            System.out.println(menuOpciones);

            System.out.println("Elije una opción válida:");

            try {

                opcion = Integer.parseInt(teclado.next());

                switch (opcion) {

                    case 1 -> {

                        System.out.println("\nElegiste la opción Dólar a Peso Argentino");
                        mostrar.calcularConversion("USD", "ARS", teclado);

                    }

                    case 2 -> {

                        System.out.println("\nElegiste la opción Peso Argentino a Dólar");
                        mostrar.calcularConversion("ARS", "USD", teclado);

                    }

                    case 3 -> {

                        System.out.println("\nElegiste la opción Dólar a Real Brasilenio");
                        mostrar.calcularConversion("USD", "BRL", teclado);

                    }

                    case 4 -> {

                        System.out.println("\nElegiste la opción Real Brasilenio a Dólar");
                        mostrar.calcularConversion("BRL", "USD", teclado);

                    }

                    case 5 -> {

                        System.out.println("\nElegiste la opción Dólar a Peso Colombiano");
                        mostrar.calcularConversion("USD", "COP", teclado);

                    }

                    case 6 -> {

                        System.out.println("\nElegiste la opción Peso Colombiano a Dólar");
                        mostrar.calcularConversion("COP", "USD", teclado);

                    }

                    case 7 -> {

                        System.out.println("\nElegiste la opción Salir\n");
                        System.out.println("Saliendo del programa. Que tenga un buen día.");

                    }

                    default -> {

                        System.out.println("\nOpción no válida.");

                    }

                }

            }catch (NumberFormatException e){

                System.out.println("Error: Por favor, ingresa un número válido.");

            }catch (InputMismatchException e) {

                System.out.println("Ocurrió un error. Por favor, ingresa un número.");
                teclado.next();

            }

        }

        teclado.close();

    }

}
