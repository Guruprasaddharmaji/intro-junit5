/**
 * 
 */
package guru.springframework;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author guruprasad
 *
 */
@Tag("Controllers")
class GreetingTest {

    @DisplayName("Greeting Tests")
    @RepeatedTest(value = 5)
    void testHelloWorld1() {
        Greeting greeting = new Greeting();
        String grString = greeting.helloWorld();

        assertEquals("Hello World", grString);
        assertThat(greeting.helloWorld()).isEqualTo("Hello World");
        assertAll("assert All test", 
                () -> assertEquals("Hello Guru", greeting.helloWorld("Guru")));
        
    }

    @DisplayName("Parameterized Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ValueSource(strings = { "Guru", "Sunitha", "Vijay", "Varun" })
    public void parameterizedTest(String val) {
        System.out.println("Value = " + val);
    }

}
