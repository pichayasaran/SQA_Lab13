package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzzApplication;

class Input14ShouldBe14 {

	@Test
	public void Input14ShouldBe14() {
	   String expected = "14";
	   int number = 14;

	   FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	   String actual = fizzBuzz.convert(number);

	   assertEquals(expected,actual);
	}
}