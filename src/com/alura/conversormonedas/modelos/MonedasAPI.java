package com.alura.conversormonedas.modelos;

public record MonedasAPI(
        String base_code,
        String target_code,
        double conversion_rate
) {
}
