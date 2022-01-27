import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz FizzBuzz = new FizzBuzz();
    FizzBuzzLogic FizzBuzzLogic = new FizzBuzzLogic();

    @ParameterizedTest
    @MethodSource("fizzBuzzData")
    void test(String testName, int inputNumber, String expectedResult) {
        String calculatedState = FizzBuzzLogic.convertNumber(inputNumber);
        assertThat(calculatedState).describedAs(testName).isEqualTo(expectedResult);
    }

    static Stream<Arguments> fizzBuzzData () {
        return Stream.of(
                Arguments.of("return the Number", 1, "1"),
                Arguments.of("return Fizz", 3, "Fizz"),
                Arguments.of("return Buzz", 5, "Buzz"),
                Arguments.of("return FizzBuzz", 15, "FizzBuzz")
        );
    }
// Test2 Jenkins automatic build

}