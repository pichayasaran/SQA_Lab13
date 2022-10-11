package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzzApplication;

class Input4ShouldBe4 {

	@Test
	public void Input2ShouldBe2() {
	   String expected = "4";
	   int number = 4;

	   FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	   String actual = fizzBuzz.convert(number);

	   assertEquals(expected,actual);
	}
}
