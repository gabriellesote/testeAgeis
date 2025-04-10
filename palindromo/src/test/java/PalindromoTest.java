import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.aula.ValidadorPalindromo;

public class PalindromoTest {

  @ParameterizedTest
  @CsvSource({
      "ana, true",
      "ovo,true",
      "lava esse aval, true",
      "Socorram-me subi no ônibus em Marrocos,true",
      "aáne, false",
      "olo?, true"

  })
  void isPalindrome(String frase, boolean esperado) {
    assertEquals(esperado, ValidadorPalindromo.verificaPalindromo(frase));
  }

}
