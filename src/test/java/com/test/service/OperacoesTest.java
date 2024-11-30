package com.test.service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class OperacoesTest {

    private final OperacoesService service = new OperacoesService();

    @Test
    void testFatorialComNumeroValido() {
        assertEquals(120, service.calcularFatorial(5)); 
    }

    @Test
    void testFatorialComNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> service.calcularFatorial(-1));
    }

    @Test
    void testMaiorNumeroNaLista() {
        assertEquals(10, service.encontrarMaiorNumero(List.of(1, 2, 3, 10, 5)));
    }

    @Test
    void testMaiorNumeroListaVazia() {
        assertThrows(IllegalArgumentException.class, () -> service.encontrarMaiorNumero(List.of()));
    }

    @Test
    void testContarVogais() {
        OperacoesService operacoes = new OperacoesService();
        String texto = "Eu sou um estudante";
        int resultado = operacoes.contarVogais(texto);
        assertEquals(9, resultado);  
    }
    

    @Test
void testContarVogaisComStringVazia() {
    OperacoesService operacoes = new OperacoesService();
    int resultado = operacoes.contarVogais("");
    assertEquals(0, resultado, "A contagem de vogais de uma string vazia deve ser 0.");
}

    @Test
void testContarVogaisComNull() {
    OperacoesService operacoes = new OperacoesService();
    assertThrows(IllegalArgumentException.class, () -> {
        operacoes.contarVogais(null);
    }, "IllegalArgumentException quando a entrada for null.");
}

    @Test
void testDivisaoPorZero() {
    OperacoesService operacoes = new OperacoesService();
    assertThrows(ArithmeticException.class, () -> {
        operacoes.dividir(10, 0);
    }, "Deve lançar ArithmeticException quando tentar dividir por zero.");
}


    

}
