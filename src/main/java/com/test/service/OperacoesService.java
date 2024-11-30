package com.test.service;

import java.util.List;

public class OperacoesService {

    public int calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public int encontrarMaiorNumero(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia");
        }
        return numeros.stream().max(Integer::compareTo).orElseThrow();
    }

    public int contarVogais(String frase) {
        if (frase == null) {
            throw new IllegalArgumentException("A frase não pode ser nula");
        }
        int contador = 0;
        String vogais = "aeiouAEIOU";
        for (char c : frase.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }
}


