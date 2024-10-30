package com.alura.conversormonedas.modelos;

public class Moneda {

    private String monedaBase;
    private String monedaObjetivo;
    private double tasaConvertido;

    public Moneda() {
    }

    public Moneda(String monedaBase, String monedaObjetivo, double tasaConvertido) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.tasaConvertido = tasaConvertido;
    }

    public Moneda(MonedasAPI monedaApi) {

        this.monedaBase = monedaApi.base_code();
        this.monedaObjetivo = monedaApi.target_code();
        this.tasaConvertido = Double.valueOf(monedaApi.conversion_rate());

    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public double getTasaConvertido() {
        return tasaConvertido;
    }

}
