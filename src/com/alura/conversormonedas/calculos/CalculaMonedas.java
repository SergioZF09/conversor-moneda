package com.alura.conversormonedas.calculos;

import com.alura.conversormonedas.conexionhttp.ConsultaMonedas;
import com.alura.conversormonedas.modelos.Moneda;
import com.alura.conversormonedas.modelos.MonedasAPI;
import java.util.Scanner;

public class CalculaMonedas {

    public void calcularConversion(String monedaBase, String monedaObjetivo, Scanner teclado){

        double monto;
        double montoTotal;

        ConsultaMonedas consultar = new ConsultaMonedas();

        System.out.println("\nIngresa el monto que deseas convertir:");

        try {

            monto = Double.parseDouble(teclado.next());

            MonedasAPI monedasAPI = consultar.buscarMoneda(monedaBase, monedaObjetivo);

            Moneda moneda = new Moneda(monedasAPI);

            montoTotal = monto * moneda.getTasaConvertido();

            System.out.println("\nEl valor %.2f[%s] corresponde al valor final de: %.2f[%s]\n"
                    .formatted(monto, monedaBase, montoTotal, monedaObjetivo));

        } catch (NumberFormatException e) {

            System.out.println("Ingresa un monto válido por favor.");

        }

    }

}
