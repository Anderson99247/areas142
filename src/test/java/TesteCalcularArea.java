// Pacote

// Biblioteca


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.exerciciolista06.Main;
// classe
public class TesteCalcularArea {
    // atributos

    // funções e métodos
    @Test
    public void testarAreaQuadrado() {
        float resultado = Main.calcularAreaQuadrado(4);
        assertEquals(16, resultado);
    }

    @Test
    public void testarAreaRetangulo() {
        float resultado = Main.calcularAreaRetangulo(5, 10);
        assertEquals(50, resultado);
    }
    @Test
    public void testarAreatriangulo() {
        float resultado = Main.calcularAreatriangulo(6, 8);
        assertEquals(24, resultado);
    }

    @Test
    public void testarAreacirculo() {
        float resultado = Main.calcularAreacirculo(3);
        assertEquals(28.27, resultado, 0.01); //  Margem de erro (0.01)evita erros com valores decimais. 
    }
  
    // DDT -> teste de unidade data-driven que ler uma lista de valores fornecidas no próprio script.

    @ParameterizedTest // @ParameterizedTest do JUnit 5 junto com 
    @CsvSource({      //  @CsvSource, permite testar varios valores dentro do proprio codigo.
        "7, 3, 21",
        "10, 5, 50",
        "15, 7, 105",
        "25, 10, 250",
        "20, 10, 200",
        "3, 6, 18",
        "7, 4, 28",
        "8, 2, 16",
        "9, 3, 27",
        "8, 3, 24"

    })

    public void testeAreaRetanguloDDT(float base, float altura, float esperado) {
        float resultado = Main.calcularAreaRetangulo(base, altura); // Executa
        assertEquals(esperado, resultado); // verifica se o resultado da função está correto.
    }

    @ParameterizedTest    //aqui nesse arquivo CSV deve-se remover os espaços caso contrario usar tring.
    @CsvFileSource(resources = "csv/testeareatriangulo.csv", numLinesToSkip = 1)
    public void testarAreatriangulo(float base, float altura, float esperado){
        float resultado = Main.calcularAreatriangulo(base, altura);
        assertEquals(esperado, resultado); // verifica se a função retornou o resultado correto.

    }

   






    
}
